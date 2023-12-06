# JDBC
JDBC stands for Java Database Connectivity. JDBC is a Java API to connect and execute the query with the database. It is a part of JavaSE (Java Standard Edition). JDBC API uses JDBC drivers to connect with the database.
## Java Database Connectivity with 5 Steps
There are 5 steps to connect any java application with the database using JDBC. These steps are as follows:

1-Register the Driver class

2-Create connection

3-Create statement

4-Execute queries

5-Close connection

### 1) Register the driver class
The forName() method of Class class is used to register the driver class. This method is used to dynamically load the driver class.

#### Syntax of forName() method

public static void forName(String className)throws ClassNotFoundException

### 2) Create the connection object

The getConnection() method of DriverManager class is used to establish connection with the database.

#### Syntax of getConnection() method

1) public static Connection getConnection(String url)throws SQLException
  
3) public static Connection getConnection(String url,String name,String password)  
throws SQLException
