CREATE TABLE menu_category (
  mid int,
  menu_name varchar(255) NOT NULL,
  menu_desc varchar(255) DEFAULT NULL,
  parent_mid int DEFAULT -1,
);
insert into menu_category values (1,'Development', 'Development Desc', -1);
insert into menu_category values (2,'Data Science', 'Data Science Desc', 1);
insert into menu_category values (3,'Machine Learning', 'Machine Learning Desc', 2);
insert into menu_category values (4,'Python', 'Python Desc', 2);

insert into menu_category values (5,'Mobile App', 'Mobile App Desc', 1);
insert into menu_category values (6,'React Native', 'React Native Desc', 5);
insert into menu_category values (7,'Android', 'Android Desc', 5);
insert into menu_category values (8,'IOS', 'IOS Desc', 5);

insert into menu_category values (9,'Business', 'Business Desc', -1);
insert into menu_category values (10,'Sales', 'Sales Desc', 9);
insert into menu_category values (11,'B2B', 'B2B Desc', 10);
insert into menu_category values (12,'email marketing', 'email marketing', 10);

insert into menu_category values (13,'Strategy', 'Strategy Desc', 9);
insert into menu_category values (14,'Excel', 'Excel Desc', 13);
insert into menu_category values (15,'Adds', 'Adds Desc', 13);


commit;
Development : Data Science,  > Machine Learning,Python
			  Mobile App  > React Native, Android, IOS
Business :    Sales, > B2B, email marketing
              Strategy > Excel, Adds