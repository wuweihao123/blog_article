CREATE TABLE springcloud_blog_0.blog_article_0
(
    id              varchar(100) NOT NULL,
    article_title   varchar(100) NOT NULL,
    article_content varchar(100) NOT NULL,
    user_id         varchar(100) NOT NULL,
    article_type_id varchar(100) NOT NULL,
    create_time     TIMESTAMP    NOT NULL,
    updatetime      TIMESTAMP    NULL,
    CONSTRAINT blog_article_pk PRIMARY KEY (id)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8
    COLLATE = utf8_general_ci;


CREATE TABLE springcloud_blog_0.blog_article_1
(
    id              varchar(100) NOT NULL,
    article_title   varchar(100) NOT NULL,
    article_content varchar(100) NOT NULL,
    user_id         varchar(100) NOT NULL,
    article_type_id varchar(100) NOT NULL,
    create_time     TIMESTAMP    NOT NULL,
    updatetime      TIMESTAMP    NULL,
    CONSTRAINT blog_article_pk PRIMARY KEY (id)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8
    COLLATE = utf8_general_ci;

CREATE TABLE springcloud_blog_1.blog_article_0
(
    id              varchar(100) NOT NULL,
    article_title   varchar(100) NOT NULL,
    article_content varchar(100) NOT NULL,
    user_id         varchar(100) NOT NULL,
    article_type_id varchar(100) NOT NULL,
    create_time     TIMESTAMP    NOT NULL,
    updatetime      TIMESTAMP    NULL,
    CONSTRAINT blog_article_pk PRIMARY KEY (id)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8
    COLLATE = utf8_general_ci;


CREATE TABLE springcloud_blog_1.blog_article_1
(
    id              varchar(100) NOT NULL,
    article_title   varchar(100) NOT NULL,
    article_content varchar(100) NOT NULL,
    user_id         varchar(100) NOT NULL,
    article_type_id varchar(100) NOT NULL,
    create_time     TIMESTAMP    NOT NULL,
    updatetime      TIMESTAMP    NULL,
    CONSTRAINT blog_article_pk PRIMARY KEY (id)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8
    COLLATE = utf8_general_ci;


CREATE TABLE springcloud_blog_0.blog_article_type_0
(
    id            varchar(100) NOT NULL,
    article_type  TINYINT      NOT NULL,
    article_notes varchar(100) NOT NULL,
    create_user   varchar(100) NOT NULL,
    create_time   TIMESTAMP    NOT NULL,
    update_user   varchar(100) NULL,
    update_time   TIMESTAMP    NULL,
    CONSTRAINT blog_article_type_pk PRIMARY KEY (id)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8
    COLLATE = utf8_general_ci;

CREATE TABLE springcloud_blog_0.blog_article_type_1
(
    id            varchar(100) NOT NULL,
    article_type  TINYINT      NOT NULL,
    article_notes varchar(100) NOT NULL,
    create_user   varchar(100) NOT NULL,
    create_time   TIMESTAMP    NOT NULL,
    update_user   varchar(100) NULL,
    update_time   TIMESTAMP    NULL,
    CONSTRAINT blog_article_type_pk PRIMARY KEY (id)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8
    COLLATE = utf8_general_ci;

CREATE TABLE springcloud_blog_1.blog_article_type_0
(
    id            varchar(100) NOT NULL,
    article_type  TINYINT      NOT NULL,
    article_notes varchar(100) NOT NULL,
    create_user   varchar(100) NOT NULL,
    create_time   TIMESTAMP    NOT NULL,
    update_user   varchar(100) NULL,
    update_time   TIMESTAMP    NULL,
    CONSTRAINT blog_article_type_pk PRIMARY KEY (id)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8
    COLLATE = utf8_general_ci;


CREATE TABLE springcloud_blog_1.blog_article_type_1
(
    id            varchar(100) NOT NULL,
    article_type  TINYINT      NOT NULL,
    article_notes varchar(100) NOT NULL,
    create_user   varchar(100) NOT NULL,
    create_time   TIMESTAMP    NOT NULL,
    update_user   varchar(100) NULL,
    update_time   TIMESTAMP    NULL,
    CONSTRAINT blog_article_type_pk PRIMARY KEY (id)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8
    COLLATE = utf8_general_ci;
