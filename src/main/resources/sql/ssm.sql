# Host: 127.0.0.1  (Version: 5.5.15)
# Date: 2018-07-16 22:59:29
# Generator: MySQL-Front 5.3  (Build 4.269)

/*!40101 SET NAMES gb2312 */;

#
# Structure for table "springmvc_test"
#

DROP TABLE IF EXISTS `springmvc_test`;
CREATE TABLE `springmvc_test` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `phoneNumber` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

#
# Data for table "springmvc_test"
#

/*!40000 ALTER TABLE `springmvc_test` DISABLE KEYS */;
/*!40000 ALTER TABLE `springmvc_test` ENABLE KEYS */;
