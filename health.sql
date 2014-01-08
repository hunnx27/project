CREATE TABLE HEALTH(		
hno	number,
hname	varchar2(20)	not null,
Constraint pk_Health_hno PRIMARY KEY(hno)
);		
insert HEALTH values(2,"haha");
insert HEALTH values(3,"haha");
insert HEALTH values(4,"haha");
select * from health;
CREATE TABLE MEMBER(		
memno	number,	
hno	number,
mname	varchar2(10)	not null,
mbirth	varchar2(6)	not null,
phone	varchar2(20)	not null,
email	varchar2(30)	not null,
addr	varchar2(60)	not null,
mgender	varchar2(2)	not null,
Constraint pk_MEMBER_memno PRIMARY KEY(memno),
CONSTRAINT fk_Health_Member_hno FOREIGN KEY(hno) REFERENCES HEALTH(hno) 
);		
		
CREATE TABLE EMP(		
empno	number,
hno	number,
ename	varchar2(10)	not null,
pname	varchar2(20)	not null,
egender	varchar2(2)	not null,
ebirth	date	not null,
career	number,
sal	number	not null,
Constraint pk_EMP_empno PRIMARY KEY(empno),
Constraint fk_Health_EMP_hno foreign key(hno) REFERENCES HEALTH(hno)
);		

CREATE TABLE PROGRAM(		
pno	number,
memno	number,
empno	number,
hno	number,
pdate	date	not null,
pname	varchar2(20)	not null,
price	number	not null,
Constraint pk_Program_pno PRIMARY KEY(pno),
Constraint fk_Health_Program_hno foreign key(hno) REFERENCES Health(hno),
Constraint fk_Member_Program_memno foreign key(memno) REFERENCES Member(memno),
Constraint fk_EMP_Program_empno foreign key(empno) REFERENCES EMP(empno)
);	

CREATE TABLE dealer(		
dealno	number,
dname	varchar2(20)	not null,
phone	varchar2(20)	not null,
addr	varchar2(60)	not null,
Constraint pk_Dealer_dealno PRIMARY KEY(dealno)
);
insert into dealer values(1,'testFactory','02-111-1111','서울시 관악구');
insert into dealer values(2,'testFactory','02-111-1111','서울시 관악구');
insert into dealer values(3,'testFactory','02-111-1111','서울시 관악구');
insert into dealer values(4,'testFactory','02-111-1111','서울시 관악구');
commit
select * from dealer;

CREATE TABLE ETC(		
etcno	number,
dealno	number,
hno	number,
etcname	varchar2(20)	not null,
code	varchar2(20)	not null,
price	number	not null,
quantity	number	not null,
state	varchar2(2)	not null,
factory	varchar2(2)	not null,
Constraint pk_ETC_etcno PRIMARY KEY(etcno),
Constraint fk_Health_ETC_hno foreign key(hno) REFERENCES HEALTH(hno),
constraint fk_Dealer_ETC_dealno foreign key(dealno) REFERENCES Dealer(dealno)
);		
select * from etc;
		
CREATE TABLE LOCKER(		
lockno	number,
hno	number,
regdate	date	not null,
price	number	not null,
Constraint pk_LOCKER_lockno PRIMARY KEY(lockno),
Constraint fk_Health_LOCKER_hno foreign key(hno) REFERENCES Health(hno)
);		
		
CREATE TABLE ACCOUNT(
hno	number,
pno	number,	
sales	number	not null,
expense	number	not null,
Constraint fk_Health_ACCOUNT_hno foreign key(hno) REFERENCES Health(hno),
Constraint fk_PROGRAM_ACCOUNT_pno foreign key(pno) REFERENCES Program(pno)
);		

insert into HEALTH values (health_hno.nextval, '티모');
select * from EMP;
insert into HEALTH values (1, '최지훈의헬스클럽');

create sequence emp_seq;
select emp_seq;

delete from EMp;

alter table emp
modify ebirth date;

desc emp
