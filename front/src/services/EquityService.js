var URL = "http://54.159.50.199:8081/client/equity/27487888899"

export default class EquityService {
    getEquities(treatOk, treatError) {
        return fetch(URL)
            .then(stream => stream.json())
            .then(data => treatOk(data))
            .catch(error => treatError(error))
    }

    validateStatus(data) {
        console.log("aqui", data)
    }
}