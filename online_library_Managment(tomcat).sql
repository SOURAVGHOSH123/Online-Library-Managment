create database lms;
use lms;
create table book(
bookID varchar(10)primary key,
name varchar(100),
publisher varchar(100),
price varchar(10),
publisherYear varchar(5)
);

create table issue(
bookID varchar(10),
studentID varchar(10),
issueDate varchar(20),
dueDate varchar(20),
returnBook varchar(10)
);

create table student(
studentID varchar(10),
name varchar(100),
fatherName varchar(100),
courseName varchar(20),
branchName varchar(20)
);
 
