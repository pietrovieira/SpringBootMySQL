# Example the API REST with MySQL Connection.

POST - http://127.0.0.1:8080/user
<br/>
BODY:
```
{
	"name": "User 2",
	"memo": "User for test",
	"gender": "f",
	"birthday": "15/04/1994"
}
```

GET - http://127.0.0.1:8080/user
<br/>
RESPONSE:
```
[
  {
    "id": 5,
    "name": "User 1",
    "memo": "User for test",
    "gender": "m",
    "birthday": "13/03/1989"
  },
  {
    "id": 6,
    "name": "User 2",
    "memo": "User for test",
    "gender": "f",
    "birthday": "15/04/1994"
  }
]
```
