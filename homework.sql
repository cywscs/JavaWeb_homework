/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80033 (8.0.33-0ubuntu0.23.04.1)
 Source Host           : localhost:3306
 Source Schema         : homework

 Target Server Type    : MySQL
 Target Server Version : 80033 (8.0.33-0ubuntu0.23.04.1)
 File Encoding         : 65001

 Date: 18/06/2023 15:07:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for homework
-- ----------------------------
DROP TABLE IF EXISTS `homework`;
CREATE TABLE `homework` (
  `id` int NOT NULL AUTO_INCREMENT,
  `content` varchar(1000) DEFAULT NULL,
  `requirement` varchar(1000) DEFAULT NULL,
  `deadline` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of homework
-- ----------------------------
BEGIN;
INSERT INTO `homework` (`id`, `content`, `requirement`, `deadline`) VALUES (1, 'zjj6', 'zjj66', '2023/06/06');
INSERT INTO `homework` (`id`, `content`, `requirement`, `deadline`) VALUES (2, 'zjjsb', 'zjjsb', '2023/06/07');
INSERT INTO `homework` (`id`, `content`, `requirement`, `deadline`) VALUES (3, 'ipsum', 'cupidatat reprehenderit Duis', 'sit ex consectetur ad');
INSERT INTO `homework` (`id`, `content`, `requirement`, `deadline`) VALUES (4, 'eu fugiat cupidatat cillum anim', 'ipsum irure dolore id incididunt', 'dolor sunt');
INSERT INTO `homework` (`id`, `content`, `requirement`, `deadline`) VALUES (5, 'consectetur sunt in', 'quis', 'reprehenderit Ut');
INSERT INTO `homework` (`id`, `content`, `requirement`, `deadline`) VALUES (6, 'non', 'in', 'consectetur laborum ex dolore do');
INSERT INTO `homework` (`id`, `content`, `requirement`, `deadline`) VALUES (7, 'reprehenderit esse ea', 'Ut in est', 'pariatur sint');
INSERT INTO `homework` (`id`, `content`, `requirement`, `deadline`) VALUES (8, 'exercitation sint sunt nulla laboris', 'dolore ut nisi', 'proident');
COMMIT;

-- ----------------------------
-- Table structure for stu_work
-- ----------------------------
DROP TABLE IF EXISTS `stu_work`;
CREATE TABLE `stu_work` (
  `id` int NOT NULL AUTO_INCREMENT,
  `work_id` int DEFAULT NULL,
  `stu_id` int DEFAULT NULL,
  `attachment` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `answer` varchar(1000) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `score` varchar(255) DEFAULT NULL,
  `comment` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `argument` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of stu_work
-- ----------------------------
BEGIN;
INSERT INTO `stu_work` (`id`, `work_id`, `stu_id`, `attachment`, `answer`, `status`, `score`, `comment`, `argument`) VALUES (1, 1, 1, 'images', 'zjj6666', 'false', '98', 'good', 'sb');
INSERT INTO `stu_work` (`id`, `work_id`, `stu_id`, `attachment`, `answer`, `status`, `score`, `comment`, `argument`) VALUES (2, 2, 2, 'txt', 'zjjjjjz', 'true', '100', 'good', 'thank you');
INSERT INTO `stu_work` (`id`, `work_id`, `stu_id`, `attachment`, `answer`, `status`, `score`, `comment`, `argument`) VALUES (3, 2023, 1, 'file', 'aaa1a', '0', NULL, NULL, NULL);
INSERT INTO `stu_work` (`id`, `work_id`, `stu_id`, `attachment`, `answer`, `status`, `score`, `comment`, `argument`) VALUES (4, 2023, 1, 'file', 'aaa1a', '0', NULL, NULL, NULL);
INSERT INTO `stu_work` (`id`, `work_id`, `stu_id`, `attachment`, `answer`, `status`, `score`, `comment`, `argument`) VALUES (5, 2023, 1, 'file', 'aaa1a', 'false', NULL, NULL, NULL);
INSERT INTO `stu_work` (`id`, `work_id`, `stu_id`, `attachment`, `answer`, `status`, `score`, `comment`, `argument`) VALUES (6, 2023, 1, 'file', 'aaa1a', 'false', NULL, NULL, NULL);
INSERT INTO `stu_work` (`id`, `work_id`, `stu_id`, `attachment`, `answer`, `status`, `score`, `comment`, `argument`) VALUES (7, 2023, 1, '/home/cywscs/a4dca229-c82a-48b1-8c3d-ffd4e7131638.jpg', 'aaa1a', 'false', NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `grade` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of student
-- ----------------------------
BEGIN;
INSERT INTO `student` (`id`, `username`, `password`, `name`, `grade`) VALUES (1, '2021213898', '123456', 'cs', '2102');
INSERT INTO `student` (`id`, `username`, `password`, `name`, `grade`) VALUES (10, '2021213888', '123456', 'cs', '2101');
INSERT INTO `student` (`id`, `username`, `password`, `name`, `grade`) VALUES (11, '2021216666', '123457', 'zjj', '2102');
INSERT INTO `student` (`id`, `username`, `password`, `name`, `grade`) VALUES (12, '2021217777', '123458', 'jjz', '2103');
INSERT INTO `student` (`id`, `username`, `password`, `name`, `grade`) VALUES (2021213866, '2021213866', '2021213866', 'zzm', '2102');
INSERT INTO `student` (`id`, `username`, `password`, `name`, `grade`) VALUES (2021218888, '2021218888', '2021218888', 'zxy', '2102');
COMMIT;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` int NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of teacher
-- ----------------------------
BEGIN;
INSERT INTO `teacher` (`id`, `username`, `password`, `name`) VALUES (1, '2023666666', '123456', 'zhangjijun');
INSERT INTO `teacher` (`id`, `username`, `password`, `name`) VALUES (3, '2023777777', '123456', 'zjj');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
