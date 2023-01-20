CREATE TABLE IF NOT EXISTS subscription 
(
  id BIGINT(20) NOT NULL AUTO_INCREMENT,
  type VARCHAR(255) NOT NULL,
  price DECIMAL NOT NULL,
  start_date DATE NOT NULL,
  end_date DATE NOT NULL,
  CONSTRAINT pk_subscription PRIMARY KEY (id),
  UNIQUE INDEX UNIQUE_ID (id ASC) VISIBLE
);

CREATE TABLE IF NOT EXISTS profile 
(
  id BIGINT(20) NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  alias VARCHAR(255) NOT NULL,
  avatar VARCHAR(1020) NULL,
  subscription_id BIGINT(20) NOT NULL,
  CONSTRAINT pk_profile PRIMARY KEY (id),
  UNIQUE INDEX UNIQUE_ID (id ASC) VISIBLE,
  CONSTRAINT FK_PROFILE_SUBSCRIPTION_ID FOREIGN KEY (subscription_id) REFERENCES subscription (id)
);
