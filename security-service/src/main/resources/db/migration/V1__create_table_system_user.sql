CREATE TABLE SYSTEM_USERS (
	id BIGNINT auto_increment PRIMARY KEY,
	userName varchar(100) not null,
	password varchar(100) not null,
  role varchar(100) not null
);

INSERT INTO SYSTEM_USERS('userName', 'password', 'role') VALUES ('admin', 'admin', 'admin');
INSERT INTO SYSTEM_USERS('userName', 'password', 'role') VALUES ('user', 'user', 'user');
INSERT INTO SYSTEM_USERS('userName', 'password', 'role') VALUES ('guest', 'guest', 'guest');
