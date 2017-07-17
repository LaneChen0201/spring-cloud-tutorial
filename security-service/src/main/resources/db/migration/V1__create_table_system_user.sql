CREATE TABLE SYSTEM_USERS (
  userId INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  userName VARCHAR(50) NOT NULL,
  password VARCHAR(50) NOT NULL,
  role VARCHAR(10) NOT NULL
);



-- CREATE TABLE SYSTEM_USERS (
-- 	userId BIGNINT PRIMARY KEY,
-- 	userName varchar(100) not null,
-- 	password varchar(100) not null,
--   role varchar(100) not null
-- );

-- INSERT INTO SYSTEM_USERS('userName', 'password', 'role') VALUES ('admin', 'admin', 'admin');
-- INSERT INTO SYSTEM_USERS('userName', 'password', 'role') VALUES ('user', 'user', 'user');
-- INSERT INTO SYSTEM_USERS('userName', 'password', 'role') VALUES ('guest', 'guest', 'guest');
