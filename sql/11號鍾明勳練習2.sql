SELECT * FROM cmdev.emp;
select * from world.country;

#1. 員工資料表中，顯示有業績(comm)的有哪幾位。
select ename, comm
from cmdev.emp
where comm > 0;

#2. 顯示從你的生日到今日為止，已經過共幾年，幾個月，幾日。
SELECT TIMESTAMPDIFF(year, '1987-07-26', current_time()) as year,TIMESTAMPDIFF(month, '1987-07-26', current_time()) as month,TIMESTAMPDIFF(day, '1987-07-26', current_time()) as day;

#3. 顯示你的生日當天是星期幾。
select dayofweek('1987-07-26');

#4. 比較顯示emp資料表中的name欄位，若使用LENGTH與CHAR_LENGTH的不同點。
select ename,length(ename) from cmdev.emp;
select ename,char_length(ename) from cmdev.emp;
#主要差異在於，length查詢某些特殊字符在UTF-8編碼時所佔位元組不同

#5. 查詢country資料表，一個單字名稱以上的國家有那些。
select Name
from world.country
where locate(' ',name)<>0;
