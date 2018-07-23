Consider a Restaurant which wants to calculate the amount to be paid to each of its employees for a particular pay period.
A casual employee is described by her `name` (`String`), `hourlyPay` (`double`), the number of service hours in the pay period
`numOfHours` (`int`) and whether or not she is applicable to a weekend loading rate `worksOvertime` (`boolean`).

Since some of them have been working over weekends and public holidays, their overtime pay will also have to be computed.
For this, We'll make a `WeekendPayCalculator` class.

Two reasons as to why this is a good candidate for a `static nested class` are:
1. It has limited use in any other context.
2. Restaurants use it frequently whilst issuing staff paychecks.

In short, we require `WeekendPayCalculator` only when we are using the employee's data, therefore it makes sense to
logically group them together.

Within the `comp1110.homework.J08` package of the `comp1110-homework` project,
create a class `Staff` that stores information about an employee including: `name`, `hourlyPay`, `numOfHours` and `worksOvertime`.
* The class should have a constructor `Staff(String name, double hourlyPay, int numOfHours, boolean worksOvertime)`.
* The class should have a public instance method, `getName()` that returns a `String` reflecting the employee's name.
* The class should have a public instance method, `double getTotalPay(double extraPay)` that takes in the extra Pay 
  earned by the employee and returns her total pay for the period based on whether they have been working overtime or
  not

Also create a public nested class `WeekendPayCalculator` which stores information about the weekend loadingRate (`double`)
The class should have a public instance method, `void setLoadingRate(double rate)` that enables us to assign a value to loadingRate.

The class should have a public instance method, `double calcOvertime(double hourlyPay)` that takes in the basic hourlyPay of an
employee and returns the extra pay that she is entitled to based on the `loadingRate`. The overtime pay is calculated as 
`loadingRate * hourlyPay`

Test your solution using the `J08` test.

Once you have it working, add and commit your work.
