use `tour`;
CREATE TRIGGER delete_customer AFTER DELETE on customer
FOR EACH ROW
DELETE FROM  reservation
    WHERE reservation.CustomerId = old.id;
	
CREATE TRIGGER mesto_trg   /*������� ����� ������� mesto_trg*/
  AFTER INSERT ON resort    /*������������ ����� ������� �������*/
FOR EACH                   /*��� ������ ����� ������*/
ROW INSERT INTO hotel   /*�������� ������ � hotel*/
VALUES ('','�����');	


DELIMITER \\
/*���������� � ������������ �� ������� ��������� .*/
CREATE  PROCEDURE info_reservation (IN FIO VARCHAR(45))
BEGIN
SELECT info.date_p, info.K_days 
FROM customer info
INNER JOIN 
(SELECT  t.CustomerId
FROM (SELECT id
   from customer WHERE 
   customer.FIO LIKE CONCAT(order_name , '%')) AS info
   INNER JOIN tourists t  ON info.id = t.CustomerId 
   ORDER BY  t.DateFly DESC) AS w
   ON w.customerId=f.Id 
;
END
\\ DELIMITER ;






DELIMITER \\
/*����� ���� ������� .*/
CREATE  PROCEDURE info ()
BEGIN
select sum(price) 
FROM hotel;
END
\\ DELIMITER ;

/* ���������� ���� */ 
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_2`()
BEGIN
select sum(k_child+k_grown)
from reservation;
END



DELIMITER \\
CREATE PROCEDURE `proc_1`()
BEGIN
select distinct tourists.Surname,tourists.Name_tourist
From (tourists
 inner join hotel
 on tourists.id= tourists.HotelId);
 END
 \\
DELIMITER ;








	