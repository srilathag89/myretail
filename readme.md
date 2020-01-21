# myRetail RESTFul Services

The application provides internal data available to any number of client devices, from myRetail.com to native mobile apps.


## Tools and Technologies used

* Spring boot 2.2.3
* MongoDB
* Postman

> Note: I am using embedded mongodb plug-in for MongoDB database instead of installing it.

## Step to install

1. **Clone the application**

```bash
git clone https://github.com/srilathag89/myretail.git
```

2. **Build and run the backend app using maven**

```bash
cd myretail
mvn package
java -jar target/myretail-0.0.1-SNAPSHOT.jar
```

Alternatively, you can run the app without packaging it using -

```bash
mvn myretail:run
```

The backend server will start at <http://localhost:8080>.

Examples to post data :


```bash
curl --location --request POST 'localhost:8080/products' \
--header 'Content-Type: application/json' \
--data-raw '{"id":13860428,"name":"The Big Lebowski (Blu-ray) (Widescreen)","current_price":{"value": 13.49,"currency_code":"USD"}}'
```


```bash
curl --location --request POST 'localhost:8080/products' \
--header 'Content-Type: application/json' \
--data-raw '{"id" : 13045467, "name": "Bose headphones", "current_price" : {"value" : 35.00, "currency": "USD"}}'
```

Example to get data by id:

```bash
curl --location --request GET 'localhost:8080/products/13860428'
```

Example to update data:

```bash
curl --location --request PUT 'localhost:8080/products/13045467' \
--header 'Content-Type: application/json' \
--data-raw '{"id":13860429,"name":"Samsung","current_price" : {"value" : 45.00, "currency": "CAD"}}'
```