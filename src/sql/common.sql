SELECT * FROM TAB;

DROP TABLE CUSTOMERS CASCADE CONSTRAINTS;
DROP TABLE EMPLOYEES CASCADE CONSTRAINTS;
DROP TABLE ORDERS CASCADE CONSTRAINTS;
DROP TABLE ORDER_DETAILS CASCADE CONSTRAINTS;
DROP TABLE PRODUCTS CASCADE CONSTRAINTS;
DROP TABLE SHIPPERS CASCADE CONSTRAINTS;
DROP TABLE SUPPLIERS CASCADE CONSTRAINTS;
DROP TABLE CATEGORIES CASCADE CONSTRAINTS;

DROP SEQUENCE order_id;
DROP SEQUENCE category_id;
DROP SEQUENCE product_id;
DROP SEQUENCE order_detail_id;
DROP SEQUENCE employee_id;

CREATE TABLE Customers(
customer_id VARCHAR2(15) PRIMARY KEY,
customer_name VARCHAR2(15) NOT NULL,
password VARCHAR2(15) NOT NULL,
ssn VARCHAR2(15) NOT NULL,
photo VARCHAR2(15) default 'default-photo',
phone VARCHAR2(15) NOT NULL,
city VARCHAR2(70) NOT NULL,
address VARCHAR2(70) NOT NULL,
postalcode VARCHAR2(15) NOT NULL
);

insert into CUSTOMERS(customer_id, customer_name, password, ssn, photo, phone, city, address, postalcode)
VALUES('ronaldo','호날두','1234','850205-1','default','010-1234-5678','서울특별시 강남구 논현로 507','성지하이츠3차빌딩 101동 101호','06132');
insert into CUSTOMERS(customer_id, customer_name, password, ssn, photo, phone, city, address, postalcode)
VALUES('messi','메시','1234','870624-1','default','010-2345-6789','서울특별시 강남구 선릉로18길 12','개포현대아파트 202동 202호','06325');
insert into CUSTOMERS(customer_id, customer_name, password, ssn, photo, phone, city, address, postalcode)
VALUES('modric','모드리치','1234','850909-1','default','010-3456-7890','서울특별시 강남구 영동대로 740',' 더 리버스청담 303동 303호','06075');
insert into CUSTOMERS(customer_id, customer_name, password, ssn, photo, phone, city, address, postalcode)
VALUES('ramos','라모스','1234','860330-1','default','010-4567-8901','서울특별시 강남구 학동로64길 7','한솔아파트 404동 404호','06089');
insert into CUSTOMERS(customer_id, customer_name, password, ssn, photo, phone, city, address, postalcode)
VALUES('bruyne','브라위너','1234','910628-1','default','010-5678-9012','서울특별시 강남구 선릉로90길 56','대우아이빌명문가 505동 505호','06194');
insert into CUSTOMERS(customer_id, customer_name, password, ssn, photo, phone, city, address, postalcode)
VALUES('degea','데헤아','1234','901107-1','default','010-6789-0123','서울특별시 강남구 논현로157길 40','반도상사 606동 606호','06033');
insert into CUSTOMERS(customer_id, customer_name, password, ssn, photo, phone, city, address, postalcode)
VALUES('marcelo','마르셀로','1234','880512-1','default','010-7890-1234','서울특별시 강남구 학동로11길 29','알파임하우스2 707동 707호','06043');
insert into CUSTOMERS(customer_id, customer_name, password, ssn, photo, phone, city, address, postalcode)
VALUES('neymar','네이마르','1234','920205-1','default','010-8901-2345','서울특별시 강남구 압구정로29길 72-1','신사상가 808동 808호','06004');
insert into CUSTOMERS(customer_id, customer_name, password, ssn, photo, phone, city, address, postalcode)
VALUES('kante','캉테','1234','910329-1','default','010-9012-3456','서울특별시 강남구 자곡로 36','강남효성해링턴코트 909동 909호','06376');
insert into CUSTOMERS(customer_id, customer_name, password, ssn, photo, phone, city, address, postalcode)
VALUES('mbappe','음바페','1234','981220-1','default','010-0123-4567','서울특별시 강남구 밤고개로21길 25','래미안포레 1000동 1000호','06370');
insert into CUSTOMERS(customer_id, customer_name, password, ssn, photo, phone, city, address, postalcode)
VALUES('varane','바란','1234','930425-1','default','010-1234-5670','서울특별시 강남구 밤고개로24길 44-9','율현주택 1001동 1001호','06370');
insert into CUSTOMERS(customer_id, customer_name, password, ssn, photo, phone, city, address, postalcode)
VALUES('vandijk','반데이크','1234','910708-1','default','010-1234-5671','서울특별시 강남구 개포로110길 50','래미안 루체하임 1002동 1002호','06344');
insert into CUSTOMERS(customer_id, customer_name, password, ssn, photo, phone, city, address, postalcode)
VALUES('rooney','루니','1234','851024-1','default','010-1234-5672','서울특별시 강남구 광평로56길 11','수서6단지아파트 1003동 1003호','06368');
insert into CUSTOMERS(customer_id, customer_name, password, ssn, photo, phone, city, address, postalcode)
VALUES('aguero','아구에로','1234','880602-1','default','010-1234-5672','서울특별시 강남구 언주로30길 57','타워팰리스 1004동 1004호','06293');
INSERT INTO CUSTOMERS(CUSTOMER_ID, CUSTOMER_NAME, PASSWORD, SSN, PHONE, PHOTO, CITY, ADDRESS, POSTALCODE)
VALUES('jang','장영실','1111','940506-1', '010-8765-4321',default,'서울시 중구 중림동 244','삼성아파트상가','100-859');
INSERT INTO CUSTOMERS(CUSTOMER_ID, CUSTOMER_NAME, PASSWORD, SSN, PHONE, PHOTO, CITY, ADDRESS, POSTALCODE)
VALUES('woo','전서우','2222','960905-1',  '010-5689-4789',default,'서울시 서초구 방배동 424-28','방배롯데캐슬','06676');
INSERT INTO CUSTOMERS(CUSTOMER_ID, CUSTOMER_NAME, PASSWORD, SSN, PHONE, PHOTO, CITY, ADDRESS, POSTALCODE)
VALUES('jk55','남기호','3333','980203-1', '010-5986-7898',default,'서울특별시 강서구 화곡동 1165','강서힐스테이트','07694');
INSERT INTO CUSTOMERS(CUSTOMER_ID, CUSTOMER_NAME, PASSWORD, SSN, PHONE, PHOTO, CITY, ADDRESS, POSTALCODE)
VALUES('roll90','김태혁','2222','950909-1','010-5989-5688',default,'서울특별시 마포구 성산동 450','성산시영선아파트','03936');
INSERT INTO CUSTOMERS(CUSTOMER_ID, CUSTOMER_NAME, PASSWORD, SSN, PHONE, PHOTO, CITY, ADDRESS, POSTALCODE)
VALUES('hahalo','김창하','1111','960405-1','010-6545-5566',default,'서울특별시 마포구 백범로 10','현대벤쳐빌','04100');
INSERT INTO CUSTOMERS(CUSTOMER_ID, CUSTOMER_NAME, PASSWORD, SSN, PHONE, PHOTO, CITY, ADDRESS, POSTALCODE)
VALUES('changjunzzang','이창준','2323','920606-1','010-6334-5566',default,'서울특별시 마포구 백범로 205','펜트리우스아파트','04194');
INSERT INTO CUSTOMERS(CUSTOMER_ID, CUSTOMER_NAME, PASSWORD, SSN, PHONE, PHOTO, CITY, ADDRESS, POSTALCODE)
VALUES('lalaland','서동준','090909','930106-1','010-0909-1190',default,'서울특별시 용산구 한강대로10길 14','한강로쌍용스윗닷홈','04389');
INSERT INTO CUSTOMERS(CUSTOMER_ID, CUSTOMER_NAME, PASSWORD, SSN, PHONE, PHOTO, CITY, ADDRESS, POSTALCODE)
VALUES('kimzzang','김이레','06078','950506-1','010-7859-5566',default,'서울특별시 서초구 방배로19길 67','방배브라운가아파트','06681');
INSERT INTO CUSTOMERS(CUSTOMER_ID,CUSTOMER_NAME,PASSWORD,SSN,PHONE,POSTALCODE,CITY,ADDRESS)
VALUES('Gameing','배정욱','1234','901220-1','010-8452-6312','07728','서울특별시 강서구 강서로 142','삼화빌리지102호');
INSERT INTO CUSTOMERS(CUSTOMER_ID,CUSTOMER_NAME,PASSWORD,SSN,PHONE,POSTALCODE,CITY,ADDRESS)
VALUES('Tomas','정서우','1234','900830-1','010-5245-8453','07727','서울특별시 강서구 화곡로 176-21','썬라인101호');
INSERT INTO CUSTOMERS(CUSTOMER_ID,CUSTOMER_NAME,PASSWORD,SSN,PHONE,POSTALCODE,CITY,ADDRESS)
VALUES('Rupi','이창준','1234','940234-1','010-3254-4512','07677','서울특별시 강서구 초록마을로11길 27','도원힐라이프');
INSERT INTO CUSTOMERS(CUSTOMER_ID,CUSTOMER_NAME,PASSWORD,SSN,PHONE,POSTALCODE,CITY,ADDRESS)
VALUES('Ourusa','김창하','1234','950425-1','010-5491-4425','07677','서울특별시 강서구 까치산로12길 57','케이앤와이빌리지');
INSERT INTO CUSTOMERS(CUSTOMER_ID,CUSTOMER_NAME,PASSWORD,SSN,PHONE,POSTALCODE,CITY,ADDRESS)
VALUES('Smoker','스모커','1234','940201-2','010-5598-7812','07679','서울특별시 강서구 까치산로 63','쉐보레강서바로서비스');
INSERT INTO CUSTOMERS(CUSTOMER_ID,CUSTOMER_NAME,PASSWORD,SSN,PHONE,POSTALCODE,CITY,ADDRESS)
VALUES('Oarora','김은정','1234','951112-2','010-8265-4455','07726','서울특별시 강서구 강서로26길 35-27','경민아트빌120호');
INSERT INTO CUSTOMERS(CUSTOMER_ID,CUSTOMER_NAME,PASSWORD,SSN,PHONE,POSTALCODE,CITY,ADDRESS)
VALUES('ting','이지은','1234','900512-2','010-7751-1513','07676','서울특별시 강서구 초록마을로21길 6','영산빌라202호');
INSERT INTO CUSTOMERS(CUSTOMER_ID,CUSTOMER_NAME,PASSWORD,SSN,PHONE,POSTALCODE,CITY,ADDRESS)
VALUES('skrad','김우석','1234','970118-1','010-5098-5412','07730','서울특별시 강서구 까치산로4길 98-10','햇빛애주택302호');
INSERT INTO CUSTOMERS(CUSTOMER_ID,CUSTOMER_NAME,PASSWORD,SSN,PHONE,POSTALCODE,CITY,ADDRESS)
VALUES('monga','고동영','1234','961211-1','010-5611-6312','07727','서울특별시 강서구 화곡로 176-19','성재센트리움아파트102호');
INSERT INTO CUSTOMERS(CUSTOMER_ID,CUSTOMER_NAME,PASSWORD,SSN,PHONE,POSTALCODE,CITY,ADDRESS)
VALUES('rion','정지우','1234','960422-2','010-5131-1123','07721','서울특별시 강서구 화곡로34길 22','프라임하우스102호');
INSERT INTO CUSTOMERS(CUSTOMER_ID,CUSTOMER_NAME,PASSWORD,SSN,PHONE,POSTALCODE,CITY,ADDRESS)
VALUES('tail','박은지','1234','940220-2','010-6151-8488','07730','서울특별시 강서구 까치산로4다길 21','아름아트빌102호');

CREATE SEQUENCE employee_id
START WITH 1000
INCREMENT BY 1;

CREATE TABLE EMPLOYEES(
employee_id VARCHAR2(15) PRIMARY KEY,
manager VARCHAR2(20) NOT NULL,
name VARCHAR2(20) NOT NULL,
birth_date VARCHAR2(20) NOT NULL,
photo VARCHAR2(20),
notes VARCHAR2(20)
);





CREATE TABLE Shippers(
shipper_id VARCHAR2(15) PRIMARY KEY,
shipper_name VARCHAR2(15)  NOT NULL,
phone VARCHAR2(15) UNIQUE NOT NULL
);

CREATE SEQUENCE order_id
START WITH 1000
INCREMENT BY 1;

CREATE TABLE Orders(
order_id NUMBER PRIMARY KEY,
customer_id VARCHAR2(15),
employee_id VARCHAR2(15),
order_date DATE DEFAULT SYSDATE,
shipper_id VARCHAR2(15),
CONSTRAINT orders_fk_customers FOREIGN KEY(customer_id) REFERENCES customers(customer_id),
CONSTRAINT orders_fk_employees FOREIGN KEY(employee_id) REFERENCES employees(employee_id),
CONSTRAINT orders_fk_shippers FOREIGN KEY(shipper_id) REFERENCES shippers(shipper_id)
);
CREATE TABLE Suppliers(
supplier_id VARCHAR2(15) PRIMARY KEY,
supplier_name VARCHAR2(15) NOT NULL,
contact_name VARCHAR2(15) NOT NULL,
address VARCHAR2(15) NOT NULL,
city VARCHAR2(15) NOT NULL,
postal_code VARCHAR2(15) NOT NULL,
country VARCHAR2(15) NOT NULL,
phone VARCHAR2(15) NOT NULL
);

CREATE SEQUENCE category_id
START WITH 1000
INCREMENT BY 1;

CREATE TABLE Categories(
category_id NUMBER PRIMARY KEY,
category_name VARCHAR2(15),
description VARCHAR2(15) 
);


CREATE SEQUENCE product_id
START WITH 1000
INCREMENT BY 1;
CREATE TABLE Products(
    product_id NUMBER PRIMARY KEY,
    product_name VARCHAR2(15) NOT NULL,
    supplier_id VARCHAR2(15),
    category_id NUMBER,
    unit VARCHAR2(15),
    price NUMBER,
    CONSTRAINT products_fk_suppliers FOREIGN KEY(supplier_id) REFERENCES  suppliers(supplier_id),
    CONSTRAINT products_fk_categories FOREIGN KEY(category_id) REFERENCES categories(category_id)
);

CREATE SEQUENCE order_detail_id
START WITH 1000
INCREMENT BY 1;
CREATE TABLE Order_details(
order_detail_id NUMBER PRIMARY KEY,
order_id NUMBER,
product_id NUMBER,
quantity NUMBER,
CONSTRAINT orderdetails_order_id FOREIGN KEY(order_id) REFERENCES Orders(order_id),
CONSTRAINT orderdetails_product_id FOREIGN KEY(product_id) REFERENCES Products(product_id)
);

insert into EMPLOYEES(employee_id, manager, name, birth_date, photo, notes)
VALUES(EMPLOYEE_ID.NEXTVAL,'MANAGER','김경민','890201-2','경민.jpg','매니저');