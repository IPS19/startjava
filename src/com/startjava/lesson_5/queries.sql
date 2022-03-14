SELECT * FROM Jaegers;

SELECT * FROM Jaegers WHERE status = 'In service';

SELECT * FROM Jaegers WHERE mark = 'Mark-1'OR mark ='Mark-3';

SELECT * FROM Jaegers ORDER BY mark DESC;

SELECT * from Jaegers WHERE launch = (SELECT MAX(launch) FROM Jaegers);

SELECT * from Jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers) OR kaijuKill = (SELECT MIN(kaijuKill) FROM Jaegers);

SELECT AVG(weight) as averageWeight from Jaegers;

UPDATE Jaegers SET kaijuKill = (kaijuKill+1) WHERE status = 'In service';

DELETE FROM Jaegers WHERE status = 'Destroyed';