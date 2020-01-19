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

Example to post data :

Example to get data by id

Example to update data.
