# Language operations #

There are only two operations in Humo language:
  1. Production definition
  1. Production substitution

  * ## Production definition ##


---

Defining a production p1 with value v1
```js

p1{v1}
```

---


Production values may contain other production definitions inside.

Defining a production p2 whose content is a definition of other production p3 with value v3.
```js

p2{p3{v3}}
```

---



  * ## Production substitution ##

---

When production p1 is found it's replaced by its value v1.

Before execution:
```js

p1{v1}
result{p1}
```
After execution:
```js

p1{v1}
result{v1}
```

---


When production p2 is found it's replaced by its value that is another definition.

Before execution:
```js

p2{p3{v3}}
result{p2}
```
After execution:
```js

p2{p3{v3}}
result{v3{v3}}
```

---

MoreDetails