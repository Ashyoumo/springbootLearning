/*
Navicat MySQL Data Transfer

Source Server         : sql
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-08-27 19:08:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8mb4 NOT NULL,
  `uid` int(11) NOT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 NOT NULL,
  `date` datetime NOT NULL,
  `content` text CHARACTER SET utf8mb4 NOT NULL,
  PRIMARY KEY (`aid`),
  KEY `aid` (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES ('3', 'aaaaaaaaaaa', '1', 'test', '2018-08-17 00:00:00', '<p>adsfasdf<span style=\"font-weight: bold;\">dfasdfasdfafd</span><span style=\"font-family: Roboto, sans-serif;\">asdfasdf</span></p>');
INSERT INTO `article` VALUES ('5', 'testtest', '1', 'test', '2018-08-17 00:00:00', '<h1>Hi</h1><p><span style=\"font-weight: bold;\">asdfasdf</span><br></p><p><span style=\"font-style: italic;\">asdfs</span></p><p><span style=\"font-style: italic;\"><br></span></p><p><span style=\"font-style: italic;\"><br></span></p>');
INSERT INTO `article` VALUES ('6', 'test long', '1', 'test', '2018-08-17 00:00:00', '<h1>COOL</h1><h1>COOL</h1><h1>COOL</h1><h1>COOL</h1><h1>COOL</h1><h1>COOL</h1><h1>COOL</h1><h1>COOL</h1><h1>COOL</h1><h1>COOL</h1><h1>COOL</h1><h1>COOL</h1><h1>COOL</h1><h1>COOL</h1><h1>COOL</h1><h1>COOL</h1><h1>COOL</h1><h1>COOL</h1><h1>COOL</h1><h1>COOL</h1><h1>COOL</h1><h1>COOL</h1><h1>COOL</h1><h1>COOL</h1><h1><br></h1>');
