/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50723
Source Host           : 127.0.0.1:3306
Source Database       : demo_ds_1

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2019-04-12 15:36:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `order_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=307115831295213569 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES ('307115828698939392', '1', 'slave');
INSERT INTO `t_order` VALUES ('307115829646852096', '3', 'slave');
INSERT INTO `t_order` VALUES ('307115830154362880', '5', 'slave');
INSERT INTO `t_order` VALUES ('307115830728982528', '7', 'slave');
INSERT INTO `t_order` VALUES ('307115831295213568', '9', 'slave');

-- ----------------------------
-- Table structure for t_order_item
-- ----------------------------
DROP TABLE IF EXISTS `t_order_item`;
CREATE TABLE `t_order_item` (
  `order_item_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_id` bigint(20) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`order_item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=307115831404265473 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_order_item
-- ----------------------------
INSERT INTO `t_order_item` VALUES ('307115829340667904', '307115828698939392', '1', 'INSERT_TEST');
INSERT INTO `t_order_item` VALUES ('307115829743321088', '307115829646852096', '3', 'INSERT_TEST');
INSERT INTO `t_order_item` VALUES ('307115830343106560', '307115830154362880', '5', 'INSERT_TEST');
INSERT INTO `t_order_item` VALUES ('307115830863200256', '307115830728982528', '7', 'INSERT_TEST');
INSERT INTO `t_order_item` VALUES ('307115831404265472', '307115831295213568', '9', 'INSERT_TEST');
