# 🚗 SpringDataRest application

 SpringDataRest is a full-stack web application for managing car-related services, built with *Spring Boot* for the backend and *ReactJS* for the frontend. The application is containerized using *Docker*, and the services are orchestrated via **Docker Compose**.

## 🏗 Project Architecture

The SpringDataRest project consists of the following components:

- *Backend*: Spring Boot service handling the business logic and data access.
- *Frontend*: ReactJS application providing an intuitive user interface for interacting with the car services.
- *Mariadb*: Database service to store and manage data for the application.
- *Prometheus & Grafana*: Monitoring and visualization tools to track the health and performance of the services.

## 📦 Docker Setup

All services are containerized and defined in the docker-compose.yml file.

### Services

- *Backend*
  - Framework: Spring Boot
  - Build Path: ./
  - Port: 8080
      MYSQL_ROOT_PASSWORD: 123456
      MYSQL_DATABASE: springboot
      MYSQL_USER: imaneouabou
      MYSQL_PASSWORD: 123456
    
- *Frontend*
  - Framework: ReactJS
  - Build Path: ./src/main/webapp/reactjs
  - Port: 3000
  - Depends on the backend service.

- *Mariadb*
  - Database: springboot
  - User: root
  - Password: 123456
  - Port: 3306
  - Volume: Persistent storage for database data.

- *Prometheus*
  - Port: 9090
  - Used for monitoring and gathering metrics.

- *Grafana*
  - Port: 3001
  - Depends on Prometheus for data visualization.

### Networks

All services are connected via the app-network to allow seamless communication between containers.

### Volumes

- pgdata: Persistent volume for Mariadb data.

## 🚀 Quick Start

1. *Clone the repository:*

  ```bash
   git clone https://github.com/Imaneouabou/SpringDataRest)
   cd SpringDataRest
```
2. **Build Backend Docker Image**:  
   

    ```bash

    docker build -t voiture-app-backend .   
    

3. **Build Frontend Docker Image**:  
   

    ```bash

    docker build -t voiture-app-frontend ./src/main/webapp/reactjs

5. *Database (Mariadb)*:  
  Ensure the correct database and user credentials are defined:

      MYSQL_ROOT_PASSWORD: 123456
      MYSQL_DATABASE: springboot
      MYSQL_USER: imaneouabou
      MYSQL_PASSWORD: 123456
    


7. **Build and run the containers using Docker Compose:**

    ```bash
    docker-compose up --build
    

8. **Access the application:**
    - Frontend: [http://localhost:3000](http://localhost:3000)
    - Backend: [http://localhost:8080](http://localhost:8080)
    - Grafana: [http://localhost:3001](http://localhost:3001) 
    - Prometheus: [http://localhost:9090](http://localhost:9090)

    To shut down the services:

   ```bash
    docker-compose down
    ```



