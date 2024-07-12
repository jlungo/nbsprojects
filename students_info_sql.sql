/* CREATING UserCategory TABLE */
CREATE TABLE UserCategory(
	UserCategoryRef Serial,
	Category Varchar(20) NOT NULL,
	CONSTRAINT PK_UserCategory PRIMARY KEY (Category)
);

/* INSERTING DATA INTO UserCategory */
INSERT INTO UserCategory(Category) VALUES('Students');

/* CREATING User TABLE */
CREATE TABLE Users(
	UserRef Serial,
	UserID Varchar(30) NOT NULL,
	FullName Varchar(80),
	PasswordHash BYTEA NOT NULL,
	Category Varchar(20),
	Email Varchar(80),
	Mobile Varchar(15),
	Status Varchar(15) DEFAULT('Enabled'),
	CONSTRAINT PK_User PRIMARY KEY (UserID),
	CONSTRAINT FK_UserCategory FOREIGN KEY (Category) REFERENCES UserCategory(Category)
);

/* INSERTING DATA INTO Users */
INSERT INTO Users(UserID, FullName, PasswordHash, Category, Email, Mobile)
	VALUES('mmdee', 'Munir Mdee', 'Munir@2024', 'Students', 'munirmdee@gmail.com', '0755740090');

/* CREATING Roles TABLE */
CREATE TABLE Roles(
	RoleRef Serial,
	RoleID Varchar(20) NOT NULL,
	CreateUserID Varchar(30),
	CreateDate timestamp DEFAULT(NOW()),
	HostPC Varchar(60), -- PC Name or IP Address
	CONSTRAINT PK_Role PRIMARY KEY (RoleID),
	CONSTRAINT FK_Role_User FOREIGN KEY (CreateUserID) REFERENCES Users(UserID)
);

/* CREATING UserRole TABLE */
CREATE TABLE UserRole(
	UserRoleRef Serial,
	UserID Varchar(30) NOT NULL,
	RoleID Varchar(20) NOT NULL,
	CreateUserID Varchar(30),
	CreateDate timestamp DEFAULT(NOW()),
	HostPC Varchar(60), -- PC Name or IP Address
	CONSTRAINT PK_UserRole PRIMARY KEY (UserID,RoleID),
	CONSTRAINT FK_UserRole_Users FOREIGN KEY (UserID) REFERENCES Users(UserID),
	CONSTRAINT FK_UserRole_Roles FOREIGN KEY (RoleID) REFERENCES Roles(RoleID)
);

/* CREATING Students TABLE */
CREATE TABLE Students(
	RegNo Varchar(30),
	FirstName Varchar(30),
	LastName Varchar(30),
	Programme Varchar(50),
	Photo Varchar(250),
	CONSTRAINT PK_RegNo PRIMARY KEY (RegNo)
);

/* CREATING Courses TABLE */
CREATE TABLE Courses(
	CourseCode Varchar(30),
	CourseName Varchar(30),
	Credits Int,
	CONSTRAINT PK_CourseCode PRIMARY KEY (CourseCode)
);

/* CREATING Examresults TABLE */
CREATE TABLE Examresults(
	RegNo Varchar(30),
	CourseCode Varchar(30),
	Marks Int,
	Grade Varchar(2),
	CONSTRAINT PK_RegNo_CCode PRIMARY KEY (RegNo,CourseCode),
	CONSTRAINT FK_CCode FOREIGN KEY (CourseCode) REFERENCES Courses(CourseCode)
);

/* CREATING Departments TABLE */
CREATE TABLE Departments(
	DeptNo Varchar(30),
	DeptName Varchar(30),
	DeptDesc Varchar(250),
	CONSTRAINT PK_DeptNo PRIMARY KEY (DeptNo)
);

/* CREATING Lecturer TABLE */
CREATE TABLE Lecturer(
	EmpNo Varchar(30),
	FirstName Varchar(30),
	LastName Varchar(30),
	CourseCode Varchar(30),
	DeptNo Varchar(30),
	CONSTRAINT PK_EmpNo PRIMARY KEY (EmpNo),
	CONSTRAINT FK_CourseCode FOREIGN KEY (CourseCode) REFERENCES Courses(CourseCode),
	CONSTRAINT FK_DeptNo FOREIGN KEY (DeptNo) REFERENCES Departments(DeptNo)
);

/* INSERT DATA INTO Courses TABle */
INSERT INTO Courses (DeptNo,DeptName,DeptDesc)
VALUES('D001','Data Processing Department','Data Processing Department'),
	('D002','Networking and Tech Department','Networking and Tech Department'),
	('D003','System Development Department','System Development Department');

/* INSERT DATA INTO Departments TABle */
INSERT INTO Departments (CourseCode,CourseName,Credits)
VALUES('001','Computer Science',8),
	('002','Database Administrator',9),
	('003','Networking',10);

/* INSERT DATA INTO Students TABle */
INSERT INTO Students (RegNo,FirstName,LastName,Programme,Photo)
VALUES('001','Munir','Mdee','Computer Science','No Photo'),
	('002','Rose','Michael','Database Administrator','No Photo'),
	('003','Beatrice','Rwegoshora','Networking','No Photo'),
	('004','Rajabu','Sollo','Computer Science','No Photo'),
	('005','Laury','Cliff','Database Administrator','No Photo'),
	('006','Ariv','Severe','Networking','No Photo'),
	('007','Shagihilu','Shagihilu','Computer Science','No Photo'),
	('008','Vicent','Kaberengeta','Database Administrator','No Photo'),
	('009','Kelvin','Njau','Networking','No Photo'),
	('010','Festo','Mwemutsi','Computer Science','No Photo'),
	('011','Joanita','Mchiwa','Database Administrator','No Photo'),
	('012','Jamal','Mbuguyu','Networking','No Photo');

/* INSERT DATA INTO Lecturer TABle */
INSERT INTO Lecturer (EmpNo,FirstName,LastName,CourseCode,DeptNo)
VALUES('E001','Juma','Ndugo','001','D001'),
	('E002','Hillary','Clinton','002','D002'),
	('E003','Carly','Mmuni','003','D003'),
	('E004','Paul','Masenya','001','D001'),
	('E005','Deogratius','Shidende','002','D002'),
	('E006','Ernest','Govert','003','D003'),
	('E007','Mwanaidi','Mahiza','001','D001'),
	('E008','Albina','Chuwa','002','D002'),
	('E009','Mariam','Kitembe','003','D003'),
	('E010','Phausta','Ntigiti','001','D001'),
	('E011','Emillian','Karugendo','002','D002'),
	('E012','Esther','Chakala','003','D003');

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
	('003','003',98,'A+'),
	('004','001',80,'B+'),
	('004','002',80,'B+'),
	('004','003',98,'A+'),
	('005','002',70,'B'),
	('005','003',75,'B'),
	('005','001',90,'C'),
	('006','001',90,'C'),
	('006','002',60,'C'),
	('006','003',65,'C'),
	('007','001',80,'B+'),
	('007','002',80,'B+'),
	('007','003',98,'A+'),
	('008','001',80,'B+'),
	('008','002',80,'B+'),
	('008','003',98,'A+'),
	('009','001',80,'B+'),
	('008','002',80,'B+'),
	('009','003',98,'A+'),
	('010','002',70,'B'),
	('010','003',75,'B'),
	('010','001',90,'C'),
	('011','002',70,'B'),
	('011','003',75,'B'),
	('011','001',90,'C'),
	('012','001',90,'C'),
	('012','002',60,'C'),
	('012','003',65,'C');

/* INNER JOIN */
SELECT Students.RegNo, Students.FirstName, Students.LastName, Courses.CourseName, Examresults.Marks, Examresults.Grade
FROM Students
INNER JOIN Examresults ON Students.RegNo = Examresults.RegNo
INNER JOIN Courses ON Examresults.CourseCode = Courses.CourseCode;

/* 12-07-2024 SQL COMMANDS PRACTICES */
SELECT COUNT(*) FROM patients WHERE gender = 'F';
SELECT COUNT(*) FROM patients WHERE gender = 'M';
SELECT COUNT(*) FROM patients;
SELECT first_name, last_name, gender FROM patients WHERE gender = 'F' LIMIT 10;
SELECT first_name, last_name, gender FROM patients WHERE gender = 'M' LIMIT 10;
SELECT first_name AS 'Jina La Kwanza', last_name AS 'Jina la Mwisho', gender AS Jinsi 
FROM patients WHERE gender = 'F' LIMIT 10;

SELECT DISTINCT patients.patient_id AS Namba, first_name AS 'Jina La Kwanza', last_name AS 'Jina la Mwisho', 
gender AS Jinsia, admission_date AS 'Kuingia', discharge_date  AS 'Kutoka'
FROM patients, admissions WHERE patients.patient_id = admissions.patient_id;

SELECT DISTINCT patients.patient_id AS Namba, patients.first_name AS 'Jina La Kwanza', 
patients.last_name AS 'Jina la Mwisho', gender AS Jinsia, admission_date AS 'Kuingia', 
discharge_date  AS 'Kutoka', CONCAT(doctors.first_name,' ',doctors.last_name) AS Dakitari
FROM patients, admissions, doctors WHERE patients.patient_id = admissions.patient_id 
AND admissions.attending_doctor_id = doctors.doctor_id;

SELECT * FROM admissions WHERE admission_date BETWEEN '2019-01-01' AND '2019-03-31';

SELECT first_name, last_name, gender, allergies FROM patients WHERE allergies IS NOT NULL;
SELECT COUNT(*) FROM patients WHERE allergies IS NOT NULL;
SELECT first_name FROM patients WHERE first_name LIKE 'C%';
SELECT first_name FROM patients WHERE first_name LIKE '__C%';
SELECT first_name, weight FROM patients WHERE weight BETWEEN 100 AND 120;
UPDATE patients SET allergies = 'NKA' WHERE allergies IS NULL;
SELECT first_name, allergies FROM patients WHERE allergies = 'NKA';
SELECT DISTINCT first_name, birth_date FROM patients ORDER BY birth_date ASC;

SELECT DISTINCT first_name, last_name, birth_date FROM patients
WHERE birth_date BETWEEN '1970-01-01' AND '1979-12-31'
ORDER BY birth_date ASC;

