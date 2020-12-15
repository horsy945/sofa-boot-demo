SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `mobile`;
CREATE TABLE `mobile` (`id` mediumint(8) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',`phone` varchar(11) NOT NULL DEFAULT '' COMMENT '手机号码段',`name` varchar (10) NOT NULL DEFAULT '' COMMENT '姓名',`gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',`gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',PRIMARY KEY (`id`),UNIQUE KEY PHONE_0 (`phone`));
insert into `mobile`(`phone`, `name`) values ('17706520000','小文')
