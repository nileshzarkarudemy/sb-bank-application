INSERT INTO customer (name,email,mobile_number,create_dt) 
VALUES ('Eazy Bytes','tutor@eazybytes.com','9823150966',CURDATE());
INSERT INTO accounts (customer_id,account_number,account_type,branch_address,create_dt) 
VALUES (1,654321,'Savings','123, Main Street',CURDATE());
