# TaskSheduler
TaskScheduler is a Spring Boot application that allows you to add tasks to a list, which is automatically updated every 6 hours using a scheduled cron job.

Steps to Run the Application Locally
Clone the repo using :
git clone https://github.com/yashjain7216/TaskSheduler.git
Open the TaskScheduler folder and  demo subfolder in any development tool like IntelliJ.
Run the Java application.

The application uses port 8081, as configured in application.properties(Can change according to system Requirement).

The application provides two REST Api: GET and POST.

1. GET Api
You can test the GET Api in any browser by using:
localhost:8081/tasks
This will return all the task entries.

3. POST Api
You can test the POST Api using Postman or cURL.
Postman:
Enter the URL: localhost:8081/tasks
Set the request method to POST
In the Body Enter the following data:
{
  "title": "Enter Title Here",
  "description": "Enter Description Here"
}
To check Task entries we can use GET APi.
