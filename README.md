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
  
2) public static Connection getConnection(String url,String name,String password)  
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

## **To connect java application with the mysql database, mysqlconnector.jar file is required to be loaded**.

### Connection interface

A Connection is a session between a Java application and a database. It helps to establish a connection with the database.

The Connection interface is a factory of Statement, PreparedStatement, and DatabaseMetaData, i.e., an object of Connection can be used to get the object of Statement and DatabaseMetaData. The Connection interface provide many methods for transaction management like commit(), rollback(), setAutoCommit(), setTransactionIsolation(), etc.

### Statement interface

The Statement interface provides methods to execute queries with the database. The statement interface is a factory of ResultSet i.e. it provides factory method to get the object of ResultSet.

#### Commonly used methods of Statement interface:

1) public ResultSet executeQuery(String sql): is used to execute SELECT query. It returns the object of ResultSet.
   
2) public int executeUpdate(String sql): is used to execute specified query, it may be create, drop, insert, update, delete etc.
   
3) public boolean execute(String sql): is used to execute queries that may return multiple results.
  
4) public int[] executeBatch(): is used to execute batch of commands.

### PreparedStatement interface
The PreparedStatement interface is a subinterface of Statement. It is used to execute parameterized query.

Let's see the example of parameterized query:

String sql="insert into emp values(?,?,?)"; 
#### Why use PreparedStatement?
The performance of the application will be faster if you use PreparedStatement interface because query is compiled only once.

#### The important methods of PreparedStatement

1-public void setInt(int paramIndex, int value) --->	sets the integer value to the given parameter index.

2-public void setString(int paramIndex, String value)	--->  sets the String value to the given parameter index.

3-public void setFloat(int paramIndex, float value)	--->  sets the float value to the given parameter index.

4-public void setDouble(int paramIndex, double value)	--->  sets the double value to the given parameter index.

5-public int executeUpdate()	--->  executes the query. It is used for create, drop, insert, update, delete etc.

6-public ResultSet executeQuery()	--->  executes the select query. It returns an instance of ResultSet.

### ResultSet interface

The object of ResultSet maintains a cursor pointing to a row of a table. Initially, cursor points to before the first row.

#### Commonly used methods of ResultSet interface

1) public boolean next():	is used to move the cursor to the one row next from the current position.
 
2) public boolean previous():	is used to move the cursor to the one row previous from the current position.
 
3) public boolean first():	is used to move the cursor to the first row in result set object.
 
4) public int getInt(int columnIndex):	is used to return the data of specified column index of the current row as int.
 
5) public int getInt(String columnName):	is used to return the data of specified column name of the current row as int.
 
6) public String getString(int columnIndex):	is used to return the data of specified column index of the current row as String.
 
7) public String getString(String columnName):	is used to return the data of specified column name of the current row as String.

### Java DatabaseMetaData interface

DatabaseMetaData interface provides methods to get meta data of a database such as database product name, database product version, driver name, name of total number of tables, name of total number of views etc.

#### Commonly used methods of DatabaseMetaData interface

1-public String getDriverName()throws SQLException: it returns the name of the JDBC driver.

2-public String getDriverVersion()throws SQLException: it returns the version number of the JDBC driver.

3-public String getUserName()throws SQLException: it returns the username of the database.

4-public String getDatabaseProductName()throws SQLException: it returns the product name of the database.

5-public String getDatabaseProductVersion()throws SQLException: it returns the product version of the database.
