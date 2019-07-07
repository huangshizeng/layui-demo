CREATE TABLE book (
  id INTEGER NOT NULL AUTO_INCREMENT,
  name VARCHAR(128) NOT NULL,
  author VARCHAR(128) NULL,
  publisher VARCHAR(128) NULL,
  price VARCHAR(45) NULL,
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
);