SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS `t_blog`;

CREATE TABLE `t_blog` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '博客类型',
  `title` varchar(200) NOT NULL COMMENT '博客题目',
  `summary` varchar(400) DEFAULT NULL COMMENT '博客摘要',
  `releaseDate` datetime DEFAULT NULL COMMENT '发布日期',
  `clickHit` int(11) DEFAULT NULL COMMENT '评论次数',
  `replyHit` int(11) DEFAULT NULL COMMENT '回复次数',
  `content` longtext COMMENT '博客内容',
  `keyWord` varchar(200) DEFAULT NULL COMMENT '关键字',
  `type_id` int(11) DEFAULT NULL COMMENT '外键关联博客类别',
  PRIMARY KEY (`id`),
  KEY `type_id` (`type_id`),
  CONSTRAINT `t_blog_ibfk_1` FOREIGN KEY (`type_id`) REFERENCES `t_blogtype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `t_blogger`
-- ----------------------------
DROP TABLE IF EXISTS `t_blogger`;
CREATE TABLE `t_blogger` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '??id',
  `username` varchar(50) NOT NULL COMMENT '????',
  `password` varchar(100) NOT NULL COMMENT '????',
  `profile` longtext COMMENT '????',
  `nickname` varchar(50) DEFAULT NULL COMMENT '????',
  `sign` varchar(255) DEFAULT NULL COMMENT '????',
  `imagename` varchar(255) DEFAULT NULL COMMENT '??????',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for `t_blogtype`
-- ----------------------------
DROP TABLE IF EXISTS `t_blogtype`;
CREATE TABLE `t_blogtype` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '??id',
  `type_name` varchar(30) DEFAULT NULL COMMENT '????',
  `order_num` int(11) DEFAULT NULL COMMENT '????',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for `t_comment`
-- ----------------------------
DROP TABLE IF EXISTS `t_comment`;
CREATE TABLE `t_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_ip` varchar(50) DEFAULT NULL,
  `blog_id` int(11) DEFAULT NULL,
  `content` text,
  `comment_date` datetime DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for `t_great`
-- ----------------------------
DROP TABLE IF EXISTS `t_great`;
CREATE TABLE `t_great` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_ip` varchar(50) NOT NULL,
  `image_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=402 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `t_link`
-- ----------------------------
DROP TABLE IF EXISTS `t_link`;
CREATE TABLE `t_link` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `link_name` varchar(100) DEFAULT NULL,
  `link_url` varchar(200) DEFAULT NULL,
  `order_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for `t_message`
-- ----------------------------
DROP TABLE IF EXISTS `t_message`;
CREATE TABLE `t_message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_ip` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `content` text,
  `message_date` datetime DEFAULT NULL,
  `state` int(4) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `t_notice`
-- ----------------------------
DROP TABLE IF EXISTS `t_notice`;
CREATE TABLE `t_notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(250) NOT NULL,
  `notice_publisher` varchar(100) NOT NULL,
  `notice_date` datetime NOT NULL,
  `level` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `t_picture`
-- ----------------------------
DROP TABLE IF EXISTS `t_picture`;
CREATE TABLE `t_picture` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `url` varchar(200) NOT NULL,
  `publisher` varchar(100) NOT NULL,
  `date` datetime NOT NULL,
  `click` int(11) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_picture
-- ----------------------------
INSERT INTO `t_picture` VALUES ('1', '../uploads/158958.jpg', 'admin', '2018-3-20 15:30:55', '2', '刘亦菲');
INSERT INTO `t_picture` VALUES ('2', '../uploads/158983.jpg', 'admin', '2018-3-20 15:30:55', '1', '刘亦菲');
INSERT INTO `t_picture` VALUES ('3', '../uploads/159008.jpg', 'admin', '2018-3-20 19:00:36', '0', '刘亦菲');
INSERT INTO `t_picture` VALUES ('4', '../uploads/159011.jpg', 'admin', '2018-3-20 19:00:38', '0', '刘亦菲');
INSERT INTO `t_picture` VALUES ('5', '../uploads/159013.jpg', 'admin', '2018-3-20 19:00:40', '0', '刘亦菲');
INSERT INTO `t_picture` VALUES ('6', '../uploads/159014.jpg', 'admin', '2018-3-20 19:00:42', '0', '刘亦菲');
INSERT INTO `t_picture` VALUES ('7', '../uploads/159019.jpg', 'admin', '2018-3-20 19:00:45', '0', '刘亦菲');
INSERT INTO `t_picture` VALUES ('8', '../uploads/159022.jpg', 'admin', '2018-3-20 19:00:47', '0', '刘亦菲');
INSERT INTO `t_picture` VALUES ('9', '../uploads/159031.jpg', 'admin', '2018-3-20 19:00:49', '0', '刘亦菲');
INSERT INTO `t_picture` VALUES ('10', '../uploads/198096.jpg', 'admin', '2018-3-20 19:00:52', '0', '刘亦菲');
INSERT INTO `t_picture` VALUES ('11', '../uploads/刘亦菲1.jpg', 'admin', '2018-3-20 19:01:26', '0', '刘亦菲');
