# Viva / Interview Questions

##  Basic

- What is Spring Boot?
- Answer:
Spring Boot is a Java framework used to build web applications quickly and easily. It provides auto-configuration, embedded servers, and reduces the amount of code developers need to write.
- What is MVC architecture?
- Answer:
MVC stands for Model, View, and Controller.

Model: Manages application data.
View: Displays data to the user (JSP pages).
Controller: Handles user requests and connects Model and View.

MVC helps organize code and makes applications easier to maintain.

---

##  Intermediate

- What is Service layer?
- Answer:
The Service Layer contains the business logic of the application. It processes data, performs validations, and acts as a bridge between the Controller and Repository layers.
- What is Repository in Spring Data JPA?
- Answer:
A Repository is used to interact with the database. It provides methods for saving, updating, deleting, and retrieving data without writing SQL queries manually.
- Difference between GET and POST?
 GET and POST are HTTP methods used to communicate between the client and the server. GET is mainly used to retrieve or fetch data from the server, and the data is sent through the URL, making it visible to users. It is generally used for viewing pages or searching information. POST, on the other hand, is used to send data to the server, such as submitting registration or login forms. In POST requests, the data is sent in the request body and is not visible in the URL, making it more secure than GET. Therefore, GET is used for fetching data, while POST is used for creating or submitting data. 

---

##  Advanced (Project Based)

- How does subscription flow work?
- Answer:
When a user selects a Skill Pack and clicks Subscribe, the request goes to the Controller. The Controller calls the Service Layer, which processes the subscription and saves it through the Repository. The subscription details are then stored in the database, and a success message is shown to the user.
- How do you link User and SkillPack?
- User and SkillPack are linked using a Many-to-Many relationship in Spring Data JPA. This allows one user to subscribe to multiple skill packs, and one skill pack to be subscribed to by multiple users.
- Why do we use Service layer?
- Answer:
We use the Service Layer to separate business logic from the Controller. This makes the code cleaner, reusable, easier to test, and easier to maintain.
- How does JSP get data from Controller?
- Answer:
The Controller sends data to the JSP page using a Model object. The data is added using model.addAttribute(), and the JSP accesses it using Expression Language (${}) or JSTL tags to display it on the webpage.
