/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50723
Source Host           : 127.0.0.1:3306
Source Database       : demo_ds_0

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2019-04-12 15:36:21
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
) ENGINE=InnoDB AUTO_INCREMENT=307115831500734485 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES ('307115829458108416', '2', 'master');
INSERT INTO `t_order` VALUES ('307115829890121728', '4', 'master');
INSERT INTO `t_order` VALUES ('307115830510878720', '6', 'master');
INSERT INTO `t_order` VALUES ('307115831014195200', '8', 'master');
INSERT INTO `t_order` VALUES ('307115831500734464', '10', 'master');
INSERT INTO `t_order` VALUES ('307115831500734472', '33', 'master');
INSERT INTO `t_order` VALUES ('307115831500734473', '33', 'master');
INSERT INTO `t_order` VALUES ('307115831500734474', '33', 'master');
INSERT INTO `t_order` VALUES ('307115831500734475', '33', 'master');
INSERT INTO `t_order` VALUES ('307115831500734476', '33', 'master');
INSERT INTO `t_order` VALUES ('307115831500734477', '33', 'master');
INSERT INTO `t_order` VALUES ('307115831500734478', '33', 'master');
INSERT INTO `t_order` VALUES ('307115831500734479', '33', 'master');
INSERT INTO `t_order` VALUES ('307115831500734480', '33', 'master');
INSERT INTO `t_order` VALUES ('307115831500734481', '33', 'master');
INSERT INTO `t_order` VALUES ('307115831500734482', '33', 'master');
INSERT INTO `t_order` VALUES ('307115831500734483', '33', 'master');
INSERT INTO `t_order` VALUES ('307115831500734484', '33', 'master');

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
) ENGINE=InnoDB AUTO_INCREMENT=307115831630757889 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_order_item
-- ----------------------------
INSERT INTO `t_order_item` VALUES ('307115829541994496', '307115829458108416', '2', 'INSERT_TEST');
INSERT INTO `t_order_item` VALUES ('307115830062088192', '307115829890121728', '4', 'INSERT_TEST');
INSERT INTO `t_order_item` VALUES ('307115830624124928', '307115830510878720', '6', 'INSERT_TEST');
INSERT INTO `t_order_item` VALUES ('307115831165190144', '307115831014195200', '8', 'INSERT_TEST');
INSERT INTO `t_order_item` VALUES ('307115831630757888', '307115831500734464', '10', 'INSERT_TEST');
