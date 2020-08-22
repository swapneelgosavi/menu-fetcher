CREATE TABLE menu_category (
  mid int NOT NULL AUTO_INCREMENT,
  menu_name varchar(255) NOT NULL,
  menu_desc varchar(255) DEFAULT NULL,
  parent_mid int DEFAULT -1,
  PRIMARY KEY (mid),
  FOREIGN KEY (parent_mid) REFERENCES menu_category (mid) 
    ON DELETE CASCADE ON UPDATE CASCADE
);