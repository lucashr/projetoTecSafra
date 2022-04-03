# To run Project Backend:

mvn quarkus:dev


## Endpoints

# (ADICIONAR INVESTIMENTO DE CLIENTES) POST /client/equity

body: {
    "type" : "CDB",
    "custumerId" : 27487888899,
    "minInvestMonths" : 6,
    "totalAmount" : 100000,
    "actualInterestRate" : 110000,
    "safraInterestRate" : 120000
}

# (CONSULTAR INVESTIMENTO DE CLIENTES) GET /client/equity/{clientId}

Retorno:

body: [
    {
        "type": "CDB",
        "custumerId": 27487888899,
        "minInvestMonths": 6,
        "totalAmount": 100000.0,
        "actualInterestRate": 110000.0,
        "safraInterestRate": 120000.0
    }
]
# To run Project Frontend:

## Instalar as dependências

npm i

## Subir a aplicação

npm run serve