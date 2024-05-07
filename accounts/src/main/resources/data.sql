INSERT INTO customer (name,email,mobile_number,created_at,created_by) 
VALUES ('Eazy Bytes','tutor@eazybytes.com','9823150966',CURDATE(),'ADMIN');
INSERT INTO accounts (customer_id,account_number,account_type,branch_address,created_at,created_by) 
VALUES (1,654321,'Savings','123, Main Street',CURDATE(),'ADMIN');
