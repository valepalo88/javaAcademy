
# Welcome

---

## Refactoring

A change made to the internal structure of software to make it easier to understand and cheaper to modify without changing its observable behavior

Note: 
 - ask if they already know it
 - how they approach it

---

## Why

 - Make software easier to understand
 - Make the software easier to change and modify
 - Improve design of your software
 - Helps you find bugs
 - Performance optimization

---

## When

 - When you add a function
 - When you need to fix a bug
 - When you do a code review

> Do it even when you think you don't have time

Note: 
 - Do you know what is a code review?

---

## When it's difficult

 - Application coupled to database schema
 - Change of already exposed interfaces

---

## When you should not do it

 - When you are close to a deadline
 - When you should rewrite from scratch

---

# Some examples 
## ...of code smells...

> This list is not a comprehensive list

---

## Primitive Obsession

> When an object can represent a domain concept better than a Primitive Type

``` 
Int age = person.age()
if (isAdult(age)) {
  // do something
}
```

+++

### Primitive Obsession Solution

Move the method into the appropriate class

``` 
Age age = person.age()
if (age.isAdult()) {
  // do something
}

class Age {
	public bool isAdult() { ... }
}
```

---

## Duplicated Code

> When code fragments are repeated

```                                        
if (creditCard.Number.length() > 16) {      
  // do something because it's valid       
}                                          
...                                        
if (creditCard.Number.length() > 16) {     
  // do something else because it's valid  
}                                          
```

+++

### Duplicated Code Solution

Don't Repeat Yourself! Extract method

```                                        
if (creditCard.Number.isValid()) {      
  // do something because it's valid       
}                                          
...                                        
if (creditCard.Number.isValid()) {     
  // do something else because it's valid  
}                                          
```

---

## Long Method

> When methods are so long and do so many things that you can't keep it in your mind while reading

+++

### Long Method Solution

Split the method into multiple sub methods, each one with one single purpose

---

## Large Class

> When a class solves too many problems or has too many fields/methods/lines of code

+++

### Large Class Solution

Restructure the class to identify different classes to create, or move methods into other more appropriate classes

---

## Long Parameter List

> When the number of parameters increase the complexity exponentially

+++

### Long Parameter Solution

Aggregate parameters into objects or reduce parameters by moving logic into smaller methods

---

## Switch Statements

> When too many switch and ifs are used instead of polymorphism

```
class DataPlan {
  int limit() {
    switch (type) {
      case BASIC:
        return baseLimit();
      case PRO:
        return baseLimit() * 3;
    }
  }
}
```

+++

### Switch Statements Solution

Replace Type Code with Subclasses and Polymorphism

```
abstract class DataPlan {
  abstract int limit();
}

class Basic extends DataPlan {
  int limit() {
    return baseSpeed();
  }
}
class Pro extends DataPlan {
  int limit() {
    return baseLimit() * 3;
  }
}

...

limit = plan.limit();
```

---

## Data  Clumps

> When more parameters or fields usually goes around together

``` 
verify(String cardNumber, String cvv, Date expiration, Date paymentDate)

pay(String cardNumber, String cvv, Date expiration)
```

+++

### Data Clumps solution

Don't be shy! Extract a class...

``` 
class CreditCard {
    public String cardNumber() { ... }

	public String cvv() { ... }

	public Date expiration() { ... }
}

verify(CreditCard creditCard, Date paymentDate)

pay(CreditCard creditCard) 
```

---

## Feature Envy

> When a method is more interested in a class other than the one it is in

```
public class Phone {
   public String prefix() {
      return completeNumber.substring(0,3);
   }
   public String number() {
      return completeNumber.substring(3,10);
   }
}

public class Customer {
   private Phone phone;
   public String phoneNumber() {
      return phone.prefix() + "-" + phone.number();
   }
}
```

+++

### Feature Envy Solution

Move the method to appropriate place!

```
public class Phone {
	private String prefix() { ... }
	private String number() { ... }
	public String formattedPhone() {
		return prefix() + "-" + number();
	}
}

public class Customer {
   private Phone phone;
   public String phoneNumber() {
      return phone.formattedPhone();
   }
}
```

---

# Thank you!

## References
 - The great book by Martin Fowler ["Refactoring: Improving the Design of Existing Code"](https://www.amazon.it/Refactoring-Improving-Design-Existing-Code/dp/0201485672/ref=sr_1_1?ie=UTF8&qid=1522257609&sr=8-1&keywords=Refactoring%3A+Improving+the+Design+of+Existing+Code)
 - [8th light post by Georgina](https://8thlight.com/blog/georgina-mcfadyen/2017/01/19/common-code-smells.html)
 - [Source Making](https://sourcemaking.com)
