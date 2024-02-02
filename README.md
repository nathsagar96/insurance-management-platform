# Insurance Management Platform
Welcome to the Insurance Management Platform, a backend application built with Spring Boot and Java for managing insurance policies, clients, and claims.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Getting Started](#getting-started)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [API Endpoints](#api-endpoints)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

## Overview
The Insurance Management Platform provides a robust backend infrastructure for handling key aspects of insurance operations. It allows users to manage clients, insurance policies, and claims through RESTful APIs.

## Features
- **Client Management:**
    - Create, retrieve, update, and delete client information.
    - View a list of all clients.
- **Insurance Policy Management:**
    - Create, retrieve, update, and delete insurance policies.
    - Associate policies with clients.
    - View a list of all policies.
- **Claim Management:**
    - Create, retrieve, update, and delete insurance claims.
    - Associate claims with insurance policies.
    - View a list of all claims.

## Getting Started
Follow these steps to set up and run the Insurance Management Platform locally:
1. **Clone the Repository:**
   ```sh
   git clone https://github.com/nathsagar96/insurance-management-platform.git
   ```
2. **Build the Project:**
   ```sh
   cd insurance-management-platform
   ./mvnw clean package
   ```
3. **Run the Application:**
   ```sh
   ./mvnw spring-boot:run
   ```

## Technologies Used
- Spring Boot
- Spring Data JPA
- H2 Database (for development and testing)

## Project Structure
The project follows a standard Spring Boot structure:
- **src/main/java**: Contains the main application code.
- **src/test/java**: Houses the unit tests.
- **src/main/resources**: Includes application properties and database configurations.

## API Endpoints
### Clients
- **GET /api/clients**: Fetch all clients.
- **GET /api/clients/{id}**: Fetch a specific client by ID.
- **POST /api/clients**: Create a new client.
- **PUT /api/clients/{id}**: Update a client's information.
- **DELETE /api/clients/{id}**: Delete a client.

### Insurance Policies
- **GET /api/policies**: Fetch all insurance policies.
- **GET /api/policies/{id}**: Fetch a specific insurance policy by ID.
- **POST /api/policies**: Create a new insurance policy.
- **PUT /api/policies/{id}**: Update an insurance policy.
- **DELETE /api/policies/{id}**: Delete an insurance policy.

### Claims
- **GET /api/claims**: Fetch all claims.
- **GET /api/claims/{id}**: Fetch a specific claim by ID.
- **POST /api/claims**: Create a new claim.
- **PUT /api/claims/{id}**: Update a claim's information.
- **DELETE /api/claims/{id}**: Delete a claim.

## Testing
Execute the unit tests using the following command:
```sh
./mvnw test
```

## Contributing
Contributions are welcome! Feel free to open issues or submit pull requests. For major changes, please open an issue first to discuss potential updates.

## License
This project is licensed under the MIT License.