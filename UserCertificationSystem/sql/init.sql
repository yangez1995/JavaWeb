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
VALUE ('1','ROLE_MANAGE_ADMIN','�������ԱȨ��','���ԶԹ���Ա��Ϣ�����������޸ġ�ɾ��');
INSERT INTO t_authority (authority_id, authority_mark, authority_name, authority_description) 
VALUE ('2','ROLE_MANAGE_USER_ACCOUNT','�����û��ʺ�Ȩ��','�����޸��û��ʺŵ�Id���û��������룬Ȩ��');
INSERT INTO t_authority (authority_id, authority_mark, authority_name, authority_description) 
VALUE ('3','ROLE_UPDATE_USER_MESSAGE','�޸��û���ϢȨ��','�����޸��û��ǳơ�״̬���������Ϣ');
INSERT INTO t_authority (authority_id, authority_mark, authority_name, authority_description) 
VALUE ('4','ROLE_NORMAL','��ͨ�û�Ȩ��','��ͨ�û�Ȩ��');

INSERT INTO t_role (role_id, role_name, role_description) 
VALUE ('1','SUPERADMINISTRATOR','��������Ա');
INSERT INTO t_role (role_id, role_name, role_description) 
VALUE ('2','ADMINISTRATOR','�߼�����Ա');
INSERT INTO t_role (role_id, role_name, role_description) 
VALUE ('3','ADMIN','��ͨ����Ա');
INSERT INTO t_role (role_id, role_name, role_description) 
VALUE ('4','USER','�û�');
INSERT INTO t_role (role_id, role_name, role_description) 
VALUE ('5','BLACKLIST','������');

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