create database SchoolDB
go

use SchoolDB
go

create table teacher
(
	username varchar(50) not null primary key,
	password varchar(100) not null,
	name varchar(100) not null,
)
go

create table admin
(
	username varchar(50) not null primary key,
	password varchar(100) not null,
	name varchar(100) not null,
)
go

create table student
(
	username varchar(50) not null primary key,
	password varchar(100) not null,
	name varchar(100) not null,
)
go

create table parent
(
	username varchar(50) not null primary key,
	password varchar(100) not null,
	name varchar(100) not null,
)
go

insert into admin values ('l192257', '2257', 'Sameed Ahmad')
go

create table subject
(
	code varchar(10) not null primary key,
	name varchar(50) not null
)
go

create table teacherSubject
(
	teacherUsername varchar(50) foreign key (teacherUsername) references teacher(username),
	subjectCode varchar(10) foreign key (subjectCode) references subject(code),
	constraint teachSub_PK primary key (teacherUsername, subjectCode)
)
go

create table class
(
	name varchar(20) not null primary key,
	roomNo int not null unique
)
go

create table classSubjectTeacher
(
	className varchar(20) foreign key (className) references class(name),
	subjectCode varchar(10) foreign key (subjectCode) references subject(code),
	teacherUsername varchar(50) foreign key (teacherUsername) references teacher(username),
	constraint classSubTeach_PK primary key (className, subjectCode, teacherUsername)
)
go

create table studentClass
(
	username varchar(50) foreign key (username) references student(username),
	className varchar(20) foreign key (className) references class(name),
	constraint stdClass_PK primary key (username, className)
)
go

select * from student
select * from teacher
select * from class
select * from admin
select * from studentClass
select * from  classSubjectTeacher
select * from teacherSubject
select * from  classSubjectTeacher