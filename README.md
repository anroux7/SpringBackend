"# SpringBackend" 
## Spring Backend Runs on port 8085 
```
look at the application.properties file before running and make sure your setup matches the specified credentials or create a new user on postgres and specify it here.
```


## Setting Up DB for Spring running on the backend (postgres)
```
docker login
enter your username and password.

//docker pull postgres (if you don't have this image)

docker run --name todoappdb -p 5432:5432 -e POSTGRES_PASSWORD=Enteryourpostgrespassword 
-d postgres

then make a new connection on your IDE like DBeaver or pgAdmin4 enter the details you ran the container with. (port and password)

OR use CMD

"Bash in"
docker exec -it todoappdb bash

psql --help
psql -U postgres
\du


-- Database: todoappdb

-- DROP DATABASE IF EXISTS todoappdb;

CREATE DATABASE todoappdb
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'English_United States.1252'
    LC_CTYPE = 'English_United States.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

GRANT ALL ON DATABASE todoappdb TO postgres;

GRANT TEMPORARY, CONNECT ON DATABASE todoappdb TO PUBLIC;

GRANT TEMPORARY ON DATABASE todoappdb TO anroux; (this is your user this is the user I specified in application.properties and it's password)

```
