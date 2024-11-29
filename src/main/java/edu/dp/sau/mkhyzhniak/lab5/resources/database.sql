CREATE TABLE students (
                          id INT PRIMARY KEY AUTO_INCREMENT,
                          first_name VARCHAR(50) NOT NULL,
                          last_name VARCHAR(50) NOT NULL,
                          patronymic VARCHAR(50),
                          birth_date DATE NOT NULL,
                          record_book_number INT NOT NULL UNIQUE
);

INSERT INTO students (first_name, last_name, patronymic, birth_date, record_book_number)
VALUES
    ('John', 'Smith', 'Michael', '2001-01-15', 1001),
    ('Emily', 'Johnson', 'Rose', '2000-02-20', 1002),
    ('James', 'Brown', 'Andrew', '2002-03-10', 1003),
    ('Olivia', 'Williams', 'Grace', '1999-04-25', 1004),
    ('William', 'Jones', 'Alexander', '2000-05-30', 1005),
    ('Sophia', 'Garcia', 'Marie', '1998-07-19', 1006),
    ('Michael', 'Martinez', 'David', '2001-08-22', 1007),
    ('Jessica', 'Rodriguez', 'Nicole', '1997-09-14', 1008),
    ('Matthew', 'Davis', 'Joseph', '2000-10-02', 1009),
    ('Ashley', 'Hernandez', 'Elizabeth', '1999-11-23', 1010),
    ('Ethan', 'Lopez', 'Daniel', '2001-12-12', 1011),
    ('Isabella', 'Gonzalez', 'Faith', '2001-01-28', 1012),
    ('Benjamin', 'Wilson', 'Christopher', '2000-02-05', 1013),
    ('Chloe', 'Anderson', 'Madison', '1998-03-17', 1014),
    ('Alexander', 'Thomas', 'Robert', '1997-04-30', 1015),
    ('Ava', 'Taylor', 'Victoria', '2000-05-08', 1016),
    ('Jacob', 'Moore', 'Anthony', '1998-07-11', 1017),
    ('Mia', 'Jackson', 'Brooklyn', '1996-08-01', 1018),
    ('Elijah', 'Martin', 'Samuel', '2001-09-19', 1019),
    ('Charlotte', 'Lee', 'Harper', '1997-12-30', 1020);