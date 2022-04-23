drop table if exists music CASCADE;
CREATE TABLE music (
    id BIGINT AUTO_INCREMENT,
    year INTEGER NOT NULL,
    artist VARCHAR(255),
    song VARCHAR(255),
    PRIMARY KEY (id)
);