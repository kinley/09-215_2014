SELECT
 CASE DATEDIFF(DAY,0, GETDATE())%7
  WHEN 0 THEN '�����������'
  WHEN 1 THEN '�������'
  WHEN 2 THEN '�����'
  WHEN 3 THEN '�������'
  WHEN 4 THEN '�������'
  WHEN 5 THEN '�������'
  WHEN 6 THEN '�����������'
 END [���� ������]