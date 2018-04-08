INSERT INTO Airplane_company (id,name)
VALUES (1000,'Lukkien Airways');

INSERT into Airport (id,name,code)
VALUES (1000, 'London','LND');
INSERT into Airport (id,name,code)
VALUES (1001, 'Amsterdam','AMS');
INSERT into Airport (id,name,code)
VALUES (1002, 'Frankfurt','FRK');

INSERT INTO Destination(id,airport_id)
VALUES (1000,1000);
INSERT INTO Destination(id,airport_id)
VALUES (1001,1001);
INSERT INTO Destination(id,airport_id)
VALUES (1002,1002);

INSERT INTO Departure(id,departure_time,airport_id)
VALUES (1000, PARSEDATETIME('09:55','HH:mm'),1001);
INSERT INTO Departure(id,departure_time,airport_id)
VALUES (1001, PARSEDATETIME('13:15','HH:mm'),1000);
INSERT INTO Departure(id,departure_time,airport_id)
VALUES (1002, PARSEDATETIME('10:45','HH:mm'),1001);
INSERT INTO Departure(id,departure_time,airport_id)
VALUES (1003, PARSEDATETIME('14:35','HH:mm'),1002);

INSERT INTO Flight(id,airplane_company_id,departure_id,destination_id)
VALUES (1000,1000,1000,1000);
INSERT INTO Flight(id,airplane_company_id,departure_id,destination_id)
VALUES (1001,1000,1001,1001);
INSERT INTO Flight(id,airplane_company_id,departure_id,destination_id)
VALUES (1002,1000,1002,1002);
INSERT INTO Flight(id,airplane_company_id,departure_id,destination_id)
VALUES (1003,1000,1003,1000);




