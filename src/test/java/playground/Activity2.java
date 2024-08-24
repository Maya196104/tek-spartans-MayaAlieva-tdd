package playground;

public class Activity2 {

    //Write a method that takes firstName and LastName  as parameters
    // and Return full name in format LASTNAME, Firstname
    // maya -> Maya

    //Step 2) Write A test in TestNG to test above method functionality

    public String getFullName(String firstName, String lastName) {
      if (firstName == null || lastName == null)
          throw new RuntimeException("FirstName or Last Name can not be null");

      if (firstName.isEmpty() || lastName.isEmpty())
          throw new RuntimeException("FirstName or Last Name can not be null");

      return lastName.toUpperCase() + ", " +
              firstName.substring(0, 1).toUpperCase() +
              firstName.substring( 1).toLowerCase();

    }
}
