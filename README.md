# api-cities-heroku - Thanks, DIO.

Requirements

    Linux
    Git
    Java 8
    Docker
    IntelliJ Community
    Heroku CLI
    Postman

Link acesso for Heroku

https://mighty-peak-20208.herokuapp.com/cities

https://mighty-peak-20208.herokuapp.com/countries

https://mighty-peak-20208.herokuapp.com/states

https://mighty-peak-20208.herokuapp.com/distances/by-cube?from=4929&to=5254&unit=METE

https://mighty-peak-20208.herokuapp.com/distances/by-points?from=4929&to=5254


DataBase
Postgres

    Postgres Docker Hub

docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres

cd ~/workspace/sql-paises-estados-cidades/PostgreSQL

docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash

psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql
psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql

psql -h localhost -U postgres_user_city cities

CREATE EXTENSION cube; 
CREATE EXTENSION earthdistance;
