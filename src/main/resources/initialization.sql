create table DEMO
(
  ID          NUMBER,
  NAME        VARCHAR2(50),
  GENDER      VARCHAR2(1),
  AGE         NUMBER,
  CREATE_DATE DATE,
  UPDATE_DATE DATE
);
create sequence DEMO_SEQ
minvalue 1
maxvalue 999999999999999999999999999
start with 21
increment by 1
cache 20;