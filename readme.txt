tips: https://www.youtube.com/watch?v=k5PeywcbVYc

Used MongoDB Compass UI to verify data in moboDB (for easy to use interface)

invoking url and input data
----------
postman url: http://localhost:8080/addbook
--header
Content-Type application/json

--posted data 
{
"isbn" : "j19",
"title": "Java Spring",
"author": "Shawn"
}
output: book saved: j19