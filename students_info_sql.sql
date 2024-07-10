/* CREATING Students TABLE */
CREATE TABLE Students(
	RegNo Varchar(30),
	FirstName Varchar(30),
	LastName Varchar(30),
	Programme Varchar(50),
	Photo Varchar(250),
	PRIMARY KEY (RegNo)
);

/* CREATING Courses TABLE */
CREATE TABLE Courses(
	CourseCode Varchar(30),
	CourseName Varchar(30),
	Credits Int,
	PRIMARY KEY (CourseCode)
);

/* CREATING Examresults TABLE */
CREATE TABLE Examresults(
	RegNo Varchar(30),
	CourseCode Varchar(30),
	Marks Int,
	Grade Varchar(2),
	PRIMARY KEY (RegNo,CourseCode)
);

/* CREATING Lecturer TABLE */
CREATE TABLE Lecturer(
	EmpNo Varchar(30),
	FirstName Varchar(30),
	LastName Varchar(30),
	CourseCode Varchar(30),
	DeptNo Varchar(30),
	PRIMARY KEY (EmpNo)
);

/* INSERT DATA INTO Courses TABle */
INSERT INTO Courses (CourseCode,CourseName,Credits)
VALUES('001','Computer Science',8),
	('002','Database Administrator',9),
	('003','Networking',10);

/* INSERT DATA INTO Students TABle */
INSERT INTO Students (RegNo,FirstName,LastName,Programme,Photo)
VALUES('001','Munir','Mdee','Computer Science','No Photo'),
	('002','Rose','Michael','Database Administrator','No Photo'),
	('003','Beatrice','Rwegoshora','Networking','No Photo');

/* INSERT DATA INTO Lecturer TABle */
INSERT INTO Lecturer (EmpNo,FirstName,LastName,CourseCode,DeptNo)
VALUES('E001','Juma','Ndugo','001','D001'),
	('E002','Hillary','Clinton','002','D002'),
	('E003','Carly','Mmuni','003','D003');

/* INSERT DATA INTO Examresults TABle */
INSERT INTO Examresults (RegNo,CourseCode,Marks,Grade)
VALUES('001','001',85,'B+'),
	('001','002',70,'B'),
	('001','003',75,'B'),
	('002','001',90,'C'),
	('002','002',60,'C'),
	('002','003',65,'C'),
	('003','001',80,'B+'),
	('003','002',80,'B+'),
	('003','003',98,'A+');