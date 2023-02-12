# Lab 26/01 TDD Server Checker

Today we are working with different types of servers - we are being asked to write a piece of software able to check if a guest at our pub can be served or not!

The Guest class is very barebones, you need to add properties, getters, and optionally setters to pass the tests below.

The Server class has a canServeGuest method, that takes in a guest, and returns a boolean if the guest can be served or not!

The following criteria need to be met:

Guest must be over 18
Guest must have enough money (each drink should cost £5.00, if they have more, they can be served)
Guest must be sober enough (using an integer scale, 100-50 they are sober enough, under 50 refused!)
Guest must not be banned from the pub
Guest must have money in the local currency (Hint: Use a char for the currency symbol)

---

Using TDD, I wrote tests to meet all criteria, then wrote code to pass the tests.

