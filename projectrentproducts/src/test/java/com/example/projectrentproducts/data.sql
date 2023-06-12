INSERT INTO products (product_name, image_url, cost, start_date, end_date)
SELECT 'basketball', 'https://example.com/product1.jpg', 10.99, '2023-06-01', '2023-06-10'
FROM dual
WHERE NOT EXISTS (SELECT 1 FROM products WHERE id = '1')
UNION ALL
SELECT 'baseball bat', 'https://example.com/product2.jpg', 19.99, '2023-06-05', '2023-06-15'
FROM dual
WHERE NOT EXISTS (SELECT 2 FROM products WHERE id = '2')
UNION ALL
SELECT 'tennis racquet', 'https://example.com/product3.jpg', 8.50, '2023-06-12', '2023-06-20'
FROM dual
WHERE NOT EXISTS (SELECT 3 FROM products WHERE id = '3')
UNION ALL
SELECT 'Golf Clubs', 'https://example.com/product4.jpg', 15.75, '2023-06-03', '2023-06-13'
FROM dual
WHERE NOT EXISTS (SELECT 4 FROM products WHERE id = '4')
UNION ALL
SELECT 'Cycles', 'https://example.com/product5.jpg', 12.50, '2023-06-08', '2023-06-18'
FROM dual
WHERE NOT EXISTS (SELECT 5 FROM products WHERE id = '5');
UNION ALL
SELECT 'Rackets', 'https://example.com/product5.jpg', 12.50, '2023-06-08', '2023-06-18'
FROM dual
WHERE NOT EXISTS (SELECT 6 FROM products WHERE id = '6');