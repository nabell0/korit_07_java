SELECT id, username, phone FROM users;

SELECT COUNT(id) FROM orders WHERE order_date LIKE '2015%';

SELECT name FROM products ORDER BY price DESC LIMIT 1; 또는 SELECT name FROM products WHERE price = (SELECT MAX(price) FROM products);

SELECT id, username FROM users WHERE country = 'Korea';

SELECT last_name, first_name FROM staff WHERE birth_date < '1960-01-01';

SELECT id, order_date FROM orders WHERE user_id = 20;

SELECT SUM(quantity) FROM orderdetails WHERE product_id = 17;

SELECT ROUND(AVG(price), 2) FROM products;

SELECT country, COUNT(id) AS userCnt FROM users GROUP BY country HAVING userCnt >= 5;

SELECT staff_id, COUNT(id) AS orderCnt FROM orders GROUP BY staff_id ORDER BY orderCnt DESC;

SELECT u.username, COUNT(o.id) AS orderCnt FROM users u INNER JOIN orders o ON u.id = o.user_id GROUP BY u.username HAVING orderCnt >= 2;

SELECT u.id, u.username, s.last_name, s.first_name FROM users u INNER JOIN staff s ON u.id = s.user_id;

SELECT o.id, SUM(od.quantity) AS total_quantity FROM orders o INNER JOIN orderdetails od ON o.id = od.order_id GROUP BY o.id HAVING total_quantity > 100;

SELECT COUNT(o.id) FROM orders o INNER JOIN users u ON o.user_id = u.id WHERE u.country = 'USA';

SELECT COUNT(id) FROM orders WHERE order_date LIKE '2015-12%' AND staff_id = 3;

SELECT name, price FROM products WHERE price > (SELECT AVG(price) FROM products);

SELECT city, COUNT(id) AS userCnt FROM users GROUP BY city HAVING city = 'Seoul';

SELECT o.id, SUM(p.price * od.quantity) AS total_price FROM orders o INNER JOIN orderdetails od ON o.id = od.order_id INNER JOIN products p ON od.product_id = p.id GROUP BY o.id HAVING total_price >= 2000;

SELECT name, price FROM products WHERE name LIKE '%Coffee%';

(SELECT last_name, first_name FROM staff WHERE birth_date < '1960-01-01') UNION (SELECT last_name, first_name FROM staff WHERE birth_date > '1990-01-01');