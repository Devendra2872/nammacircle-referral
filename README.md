Tasks :-
1. Suppose NammaCircle has a feature where:
A user refers a candidate to a company
The same candidate should not be referred twice to the same company
How would you enforce this rule?

Answe :- Please check above code.

2 What Happens When You Type a URL in the Browser?
Answer:- 
URL Parsing — Browser reads the protocol (https) or domain (nammacircle.com) and path (/jobs)

Cache Check — Browser checks if it already has the page saved locally

DNS Lookup — Browser takes permission from DNS server to convert domain name into an IP address like 123.450.x.x

TCP Connection — Browser connects to that IP address on port 443

TLS Handshake — Browser and server verify each other's and create an encrypted connection

HTTP Request — Browser sends GET /jobs api request to the server

Server Processing — Spring Boot app receives request, runs business logic, fetches data from DB

HTTP Response — Server sends back 200 OK with HTML or JSON data if its all clear;

Rendering — Browser displays the page to the user.


3. Java & Spring Boot Version

Java → Java 17 (LTS)
Spring Boot → 3.2.5


4. Annotations Explained

@SpringBootApplication
Marks the main starting point of the Spring Boot application.
It tells Spring to auto-configure everything and start scanning components automatically.

@Entity
Marks a Java class as a database table. Each field in the class becomes a column in the table. 
Hibernate automatically creates the table from this class.

@Service
Marks a class as the business logic layer. 
It tells Spring to manage this class as a bean and it is where all the core rules and operations of the app are written.

@Autowired
Tells Spring to automatically inject the required dependency. 
Instead of creating objects manually using new keyword, Spring finds the right bean and provides it automatically.

@Repository
Marks a class as the data access layer. It is responsible for all database operations like save, find, delete. 
Spring Data JPA automatically implements the methods based on method names.

@Id
Marks a field as the primary key of the database table. Every entity must have one @Id field.

@Transactional
Wraps a method in a database transaction. If everything succeeds, 
changes are saved. If anything fails, everything is rolled back automatically keeping the database clean like D in ACID Property.


6 Improving NammaCircle Performance as a Backend Engineer
Issue I Observe:
1. Slow page load time
2. Delay in fetching job listings
3. Lag when submitting profile data

Solutions:-
1. Database Indexing
Add indexes on frequently searched columns like email, company_id, candidate_id so database queries run faster instead of scanning the entire table.

2. Caching with Redis
Instead of hitting the database every time for the same data like job listings or company profiles, store them in Redis cache. Serve from cache — much faster.

3. Pagination
Instead of loading all records at once, load data in small pages — reduces response time drastically.

4. Async Processing
For non-critical tasks like sending emails or notifications, don't make the user wait — process them in background.

5. API Response Optimization
Return only required fields using DTOs — don't expose full entity
Reduces response payload size.

Thank you.
