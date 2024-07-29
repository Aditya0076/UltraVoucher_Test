-- Query Test
CREATE DATABASE DBquerytest;

\c DBquerytest;

CREATE Table users(
    id serial primary key,
    name varchar(255),
    parent_id INT
)

INSERT INTO users(name, parent_id) VALUES
('Zaki', 2),
('Ilham', NULL),
('Irwan', 2),
('Arka', 3)

SELECT
    child.id,
    child.name,
    parent.name AS parent_name
FROM
    users AS child
LEFT JOIN
    users AS parent
ON
    child.parent_id = parent.id;
