show databases;
use kiki;	
create table product_sales(product_id varchar(852),product_name varchar(852),sale_date varchar(852),
quantity_sold varchar(456),revenue varchar(4546));
desc product_sales;
insert into product_sales values(1,"kk","1st jan",69,90),(2,"mg","23 jan",420,69);
select * from product_sales;
select sum(revenue) from product_sales;
select max(revenue) from product_sales;
select revenue,product_name from product_sales where revenue=(select max(revenue) from product_sales);




CREATE TABLE product_sales (
    product_id INT,
    product_name VARCHAR(50),
    sale_date DATE,
    quantity_sold INT,
    revenue DECIMAL(10, 2)
);

INSERT INTO product_sales (product_id, product_name, sale_date, quantity_sold, revenue)
VALUES
    (1, 'Product A', '2024-02-05', 10, 100.00),
    (2, 'Product B', '2024-02-10', 5, 75.50),
    (3, 'Product C', '2024-02-15', 8, 120.00),
    (1, 'Product A', '2024-02-20', 12, 150.00),
    (2, 'Product B', '2024-02-25', 6, 90.00),
    (3,'product C', '2024-03-26', 8, 98.00);

SELECT 
    product_name,
    SUM(revenue) AS total_revenue
FROM 
    product_sales
WHERE 
    sale_date >= DATE_SUB(CURDATE(), INTERVAL 1 MONTH)
GROUP BY 
    product_name;
