USE adlister_db;

TRUNCATE users;

INSERT INTO users
(username, email, password)
VALUES
  ('tim', 'bernie@gmail.com', 'timword');


INSERT INTO ads
(user_id, title, description)
VALUES
  ('1', 'dog', 'has 4 legs');
