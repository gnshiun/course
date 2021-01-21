select * from cmdev.emp;
select * from world.country;

# 1.查詢最晚進公司的三位員工。
select ename,hiredate
from cmdev.emp
order by hiredate desc
limit 3;

# 2.查詢沒有分配部門的員工。
select ename,deptno
from cmdev.emp
where deptno is null;

# 3.查詢公司前三位肥貓(薪資最高)。
select ename,salary
from cmdev.emp
order by salary desc
limit 3;

# 4.顯示若將1981年之前的員工薪資*2倍的結果。
select ename,hiredate,salary,salary*2
from cmdev.emp
where hiredate < '1982-1-1';

# 5.顯示目前的現在時間離下課16:30的小時數。
select hour('16:30:00')-hour(current_time());

# 6.顯示country資料表的name欄位內容(內容向右靠齊，欄位長度設為40，不足的補上*)。
select lpad(name,40,'*')
from world.country;

# 7.顯示今日之前15天的日期。
select adddate(current_date(),-15);

# 8.算出員工資料表平均薪資，最大薪資及最小薪資。
select avg(salary),max(salary),min(salary)
from cmdev.emp;

# 9.顯示員工資料表中大於平均薪資的員工。
select ename,salary
from cmdev.emp
where salary > (select avg(salary) from cmdev.emp)
order by salary;

#10.顯示員工資料表中共有幾個部門
select count(deptno)
from cmdev.dept;

#11.顯示員工資料表中，姓名有S的員工有哪幾位。
select ename
from cmdev.emp
where ename like '%s%';