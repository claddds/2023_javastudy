
/* Drop Tables */

-- DROP TABLE orders CASCADE CONSTRAINTS;
-- DROP TABLE customer CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE customer100
(
	custid number NOT NULL,
	name varchar2(50),
	address varchar2(50),
	phone varchar2(50),
	PRIMARY KEY (custid)
);


CREATE TABLE orders100
(
	orderid number NOT NULL,
	custid number,
	bookid number,
	saleprice number,
	orderdate date,
	custid number NOT NULL,
	PRIMARY KEY (orderid)
);



/* Create Foreign Keys */

ALTER TABLE orders
	ADD FOREIGN KEY (custid)
	REFERENCES customer (custid)
;

select * from CUSTOMER;


