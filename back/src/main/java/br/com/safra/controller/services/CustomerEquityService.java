package br.com.safra.controller.services;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;

import org.bson.Document;
import org.bson.conversions.Bson;

import br.com.safra.entities.Investment;

@ApplicationScoped
public class CustomerEquityService {
    @Inject MongoClient mongoClient;

    public List<Investment> list(Long custumerId) {
        List<Investment> customerInvestments = new ArrayList<>();

        Bson custumerIdFilter = Filters.eq("custumerId", custumerId);

        MongoCursor<Document> cursor = getCollection().find(custumerIdFilter).iterator();

        try {
            while (cursor.hasNext()) {
                Document document = cursor.next();
                Investment investment = new Investment();
                investment.setType(document.getString("type"));
                investment.setMinInvestMonths(document.getInteger("minInvestMonths"));
                investment.setTotalAmount(document.getDouble("totalAmount"));
                investment.setActualInterestRate(document.getDouble("actualInterestRate"));
                investment.setSafraInterestRate(document.getDouble("safraInterestRate"));
                investment.setCustumerId(document.getLong("custumerId"));
                customerInvestments.add(investment);
            }
        } catch (Exception e) {
            System.out.println("Error in [CustomerEquityService][list()]: " + e.getMessage());
        } finally {
            cursor.close();
        }
        return customerInvestments;
    }

    public void add(Investment investment){
        Document document = new Document()
                .append("type", investment.getType())
                .append("custumerId", investment.getCustumerId())
                .append("minInvestMonths", investment.getMinInvestMonths())
                .append("totalAmount", investment.getTotalAmount())
                .append("actualInterestRate", investment.getActualInterestRate())
                .append("safraInterestRate", investment.getSafraInterestRate());
        getCollection().insertOne(document);
    }

    private MongoCollection getCollection(){
        return mongoClient.getDatabase("Safra").getCollection("Investments");
    }
}
