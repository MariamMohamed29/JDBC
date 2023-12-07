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

### 3) Create the Statement object

The createStatement() method of Connection interface is used to create statement. The object of statement is responsible to execute queries with the database.

#### Example to create the statement object

Statement stmt=con.createStatement();  

### 4) Execute the query

The executeQuery() method of Statement interface is used to execute queries to the database. This method returns the object of ResultSet that can be used to get all the records of a table.

#### Example to execute query

ResultSet rs=stmt.executeQuery("select * from emp");  
  
while(rs.next()){  

System.out.println(rs.getInt(1)+" "+rs.getString(2));  

### 5) Close the connection object

By closing connection object statement and ResultSet will be closed automatically. The close() method of Connection interface is used to close the connection.

#### Syntax of close() method

public void close()throws SQLException
} 

# To connect java application with the mysql database, mysqlconnector.jar file is required to be loaded.
