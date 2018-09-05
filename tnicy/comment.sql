/*
Navicat MySQL Data Transfer

Source Server         : sql
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-08-27 19:10:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `aid` int(11) NOT NULL,
  `uid` int(11) NOT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 NOT NULL,
  `time` datetime NOT NULL,
  `content` text CHARACTER SET utf8mb4 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('3', '1', 'aaa', '2018-08-17 00:00:00', 'askdfjalsdf');
INSERT INTO `comment` VALUES ('5', '1', 'test', '2018-08-26 00:00:00', '<p>alsdkfasdfadsf</p>');
INSERT INTO `comment` VALUES ('6', '1', 'test', '2018-08-26 00:00:00', '<p>ok</p>');
INSERT INTO `comment` VALUES ('5', '2', 'fuck', '2018-08-26 00:00:00', '<p>kjhk</p>');
INSERT INTO `comment` VALUES ('5', '2', 'fuck', '2018-08-26 00:00:00', '<h1>FUCK</h1>');
INSERT INTO `comment` VALUES ('3', '2', 'fuck', '2018-08-26 00:00:00', '<p><span style=\"font-weight: bold;\">nice</span><br></p>');
