## HOW TO RUN THIS PROJECT

### REQUIREMENT

1. Netbeans IDE
2. mysql-connector jdbc <strong>file jar</strong> to include to library (already attached in folder icons_mysqlConnector)
3. mysql workbench or command line (recommend version > 8.0 )

### HOW TO RUN

1. clone this using

```
git clone https://github.com/duyhieunguyenle1/Delievery_Shop_Management.git
or
git clone git@github.com:duyhieunguyenle1/Delievery_Shop_Management.git
```

2. open and then build it with netbeans

3. Run file initDb.sql in folder icons_mysqlConnector

- That file include create table schema and init admin account
- Admin account include:
  <b>
  Email: admin@gmail.com
  Password: admin
  </b>

### NOTE

1. You can only register supplier account by using admin account.
2. To accept purchase, you have to use admin account to select its supplier and then using supplier to confirm purchase to "On the way".
3. <b>Close is the white one not the default one</b>, make sure you chose it right.
4. As a supplier, <b>double-click</b> row on the delivery page to confirm it's received.
