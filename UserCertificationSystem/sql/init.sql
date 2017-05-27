DROP DATABASE IF EXISTS userCertificationSystem;
CREATE DATABASE userCertificationSystem;
USE userCertificationSystem;

CREATE TABLE t_ordinary_user (
	id INT PRIMARY KEY AUTO_INCREMENT,
	username VARCHAR(30),
	nickname VARCHAR(30),
	
	password VARCHAR(60),
	
	role_id CHAR(2),
	state TINYINT(1)
);

CREATE TABLE t_ordinary_user_message (
	user_id INT PRIMARY KEY AUTO_INCREMENT,
	phone_number VARCHAR(11),
	email VARCHAR(30)
);

CREATE TABLE t_role (
	role_id CHAR(2) NOT NULL,
	role_name VARCHAR(20),
	role_description VARCHAR(200)
);

CREATE TABLE t_authority (
	authority_id CHAR(2) PRIMARY KEY NOT NULL,
	authority_mark VARCHAR(30),
	authority_name VARCHAR(20),
	authority_description VARCHAR(200)
);

CREATE TABLE t_roles_authorities (
	id INT PRIMARY KEY AUTO_INCREMENT,
	role_id CHAR(2) NOT NULL,
	authority_id CHAR(2) NOT NULL
);

INSERT INTO t_authority (authority_id, authority_mark, authority_name, authority_description) 
VALUE ('1','ROLE_MANAGE_ADMIN','管理管理员权限','可以对管理员信息进行审批、修改、删除');
INSERT INTO t_authority (authority_id, authority_mark, authority_name, authority_description) 
VALUE ('2','ROLE_MANAGE_USER_ACCOUNT','管理用户帐号权限','可以修改用户帐号的Id，用户名，密码，权限');
INSERT INTO t_authority (authority_id, authority_mark, authority_name, authority_description) 
VALUE ('3','ROLE_UPDATE_USER_MESSAGE','修改用户信息权限','可以修改用户昵称、状态、邮箱等信息');
INSERT INTO t_authority (authority_id, authority_mark, authority_name, authority_description) 
VALUE ('4','ROLE_NORMAL','普通用户权限','普通用户权限');

INSERT INTO t_role (role_id, role_name, role_description) 
VALUE ('1','SUPERADMINISTRATOR','超级管理员');
INSERT INTO t_role (role_id, role_name, role_description) 
VALUE ('2','ADMINISTRATOR','高级管理员');
INSERT INTO t_role (role_id, role_name, role_description) 
VALUE ('3','ADMIN','普通管理员');
INSERT INTO t_role (role_id, role_name, role_description) 
VALUE ('4','USER','用户');
INSERT INTO t_role (role_id, role_name, role_description) 
VALUE ('5','BLACKLIST','黑名单');

INSERT INTO t_roles_authorities (role_id, authority_id)
VALUE ('1','1');
INSERT INTO t_roles_authorities (role_id, authority_id)
VALUE ('1','2');
INSERT INTO t_roles_authorities (role_id, authority_id)
VALUE ('1','3');

INSERT INTO t_roles_authorities (role_id, authority_id)
VALUE ('2','2');
INSERT INTO t_roles_authorities (role_id, authority_id)
VALUE ('2','3');
INSERT INTO t_roles_authorities (role_id, authority_id)
VALUE ('2','4');

INSERT INTO t_roles_authorities (role_id, authority_id)
VALUE ('3','3');
INSERT INTO t_roles_authorities (role_id, authority_id)
VALUE ('3','4');

INSERT INTO t_roles_authorities (role_id, authority_id)
VALUE ('4','4');