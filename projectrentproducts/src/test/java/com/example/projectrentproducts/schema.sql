CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(255) NOT NULL,
    image_url VARCHAR(255),
    cost DECIMAL(10, 2) NOT NULL,
    start_date DATE,
    end_date DATE
);
