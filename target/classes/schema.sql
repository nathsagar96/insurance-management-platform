-- Create Client Table
CREATE TABLE client (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    date_of_birth VARCHAR(20) NOT NULL,
    address VARCHAR(255),
    contact_information VARCHAR(255)
);

-- Create InsurancePolicy Table
CREATE TABLE insurance_policy (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    policy_number VARCHAR(50) NOT NULL,
    type VARCHAR(50) NOT NULL,
    coverage_amount DOUBLE NOT NULL,
    premium DOUBLE NOT NULL,
    start_date DATE NOT NULL,
    end_date DATE NOT NULL,
    client_id BIGINT,
    FOREIGN KEY (client_id) REFERENCES client(id)
);

-- Create Claim Table
CREATE TABLE claim (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    claim_number VARCHAR(50) NOT NULL,
    description VARCHAR(255) NOT NULL,
    claim_date DATE NOT NULL,
    claim_status VARCHAR(50) NOT NULL,
    policy_id BIGINT,
    FOREIGN KEY (policy_id) REFERENCES insurance_policy(id)
);