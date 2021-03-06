DROP TABLE IF EXISTS "Rooms";
CREATE TABLE "Rooms" ("ID" INTEGER PRIMARY KEY  NOT NULL ,"NAMEROOM" VARCHAR NOT NULL  DEFAULT (null) ,"CATEGORY" VARCHAR NOT NULL );
INSERT INTO "Rooms" VALUES(1,'1','standart');
INSERT INTO "Rooms" VALUES(2,'2','standart');
INSERT INTO "Rooms" VALUES(3,'3','standart');
INSERT INTO "Rooms" VALUES(4,'4','standart');
INSERT INTO "Rooms" VALUES(5,'5','studio');
INSERT INTO "Rooms" VALUES(6,'6','studio');
INSERT INTO "Rooms" VALUES(7,'7','studio');
INSERT INTO "Rooms" VALUES(8,'8','luxe');
INSERT INTO "Rooms" VALUES(9,'9','luxe');
INSERT INTO "Rooms" VALUES(10,'10','luxe');




DROP TABLE IF EXISTS "Guests";
CREATE TABLE Guests(
ID_GUEST INTEGER NOT NULL PRIMARY KEY,
SURNAME VARCHAR NOT NULL,
NAME VARCHAR,
MIDDLE_NAME VARCHAR,
DATE_OF_ BIRTH DATE);
INSERT INTO "Guests" VALUES(1,'A','A','A','01/01/2000');
INSERT INTO "Guests" VALUES(2,'B','B','B','02/02/2000');
INSERT INTO "Guests" VALUES(3,'C','C','C','03/03/2000');
INSERT INTO "Guests" VALUES(4,'D','D','D','04/04/2000');
INSERT INTO "Guests" VALUES(5,'E','E','E','05/05/2000');
INSERT INTO "Guests" VALUES(6,'F','F','F','06/06/2000');
INSERT INTO "Guests" VALUES(7,'G','G','G','07/07/2000');
INSERT INTO "Guests" VALUES(8,'H','H','H','08/08/2000');
INSERT INTO "Guests" VALUES(9,'I','I','I','09/09/2000');
INSERT INTO "Guests" VALUES(10,'J','J','J','10/10/2000');





DROP TABLE IF EXISTS "Booking";
CREATE TABLE Booking(
ID INTEGER NOT NULL,
NAMEROOM VARCHAR NOT NULL,
CATEGORY VARCHAR NOT NULL,
ID_GUEST INTEGER NOT NULL,
SURNAME VARCHAR NOT NULL,
NAME VARCHAR,
MIDDLE_NAME VARCHAR,
CHECK_IN DATE NOT NULL, 
CHECK_OUT DATE NOT NULL,
STAY INTEGER, 
STATUS VARCHAR NOT NULL,
CONSTRAINT fk_ID FOREIGN KEY (ID) REFERENCES Rooms (ID),
CONSTRAINT fk_ID_GUEST FOREIGN KEY(ID_GUEST) REFERENCES  Guests(ID_GUEST)
);
INSERT INTO "Booking" VALUES(1,'1','standart',10,'J','J','J','10/10/2014','16/10/2014',5,'BUSY');
INSERT INTO "Booking" VALUES(1,'1','standart',9,'I','I','I','20/10/2014','30/10/2014',10,'RESERVED');
INSERT INTO "Booking" VALUES(10,'10','LUXE',1,'A','A','A','01/10/2014','02/10/2014',1,'CLOSED');
