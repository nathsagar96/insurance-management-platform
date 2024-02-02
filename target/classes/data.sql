-- Insert Test Data for Client Table
INSERT INTO client (name, date_of_birth, address, contact_information)
VALUES ('John Doe', '1990-05-15', '123 Main St', '555-1234'),
       ('Jane Smith', '1985-10-20', '456 Oak St', '555-5678');

-- Insert Test Data for InsurancePolicy Table
INSERT INTO insurance_policy (policy_number, type, coverage_amount, premium, start_date, end_date, client_id)
VALUES ('POL123', 'Auto', 50000.00, 1000.00, '2023-01-01', '2024-01-01', 1),
       ('POL456', 'Home', 200000.00, 1500.00, '2023-02-01', '2024-02-01', 2);

-- Insert Test Data for Claim Table
INSERT INTO claim (claim_number, description, claim_date, claim_status, policy_id)
VALUES ('CLM789', 'Car Accident', '2023-03-15', 'Pending', 1),
       ('CLM987', 'House Fire', '2023-04-20', 'Approved', 2);

-- Insert More Test Data for Client Table
INSERT INTO client (name, date_of_birth, address, contact_information)
VALUES ('Alice Johnson', '1982-08-10', '789 Pine St', '555-9876'),
       ('Bob Wilson', '1995-03-25', '321 Elm St', '555-4321');

-- Insert More Test Data for InsurancePolicy Table
INSERT INTO insurance_policy (policy_number, type, coverage_amount, premium, start_date, end_date, client_id)
VALUES ('POL789', 'Health', 100000.00, 800.00, '2023-03-01', '2024-03-01', 3),
       ('POL654', 'Life', 500000.00, 2000.00, '2023-04-01', '2024-04-01', 4);

-- Insert More Test Data for Claim Table
INSERT INTO claim (claim_number, description, claim_date, claim_status, policy_id)
VALUES ('CLM234', 'Medical Expenses', '2023-05-10', 'Denied', 3),
       ('CLM543', 'Accidental Death', '2023-06-15', 'Pending', 4);

-- Additional Data for Variety
INSERT INTO client (name, date_of_birth, address, contact_information)
VALUES ('Eva Martinez', '1991-12-03', '555 Maple St', '555-1111');

INSERT INTO insurance_policy (policy_number, type, coverage_amount, premium, start_date, end_date, client_id)
VALUES ('POL987', 'Travel', 30000.00, 500.00, '2023-07-01', '2024-07-01', 5);

INSERT INTO claim (claim_number, description, claim_date, claim_status, policy_id)
VALUES ('CLM876', 'Lost Luggage', '2023-08-20', 'Approved', 5);
