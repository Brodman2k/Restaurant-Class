
# Restaurant Class

## About the Project

For this project, I updated a Java program that stores information about a restaurant. The program asks the user to enter restaurant details, creates a Restaurant object with those values, saves it in an ArrayList, and displays the information in an organized way.

This assignment helped me practice working with classes, constructors, getters and setters, user input, and ArrayLists.

## The Properties of the Code

The Restaurant class has six private fields:

- `String name` - Stores the name of the restaurant.
- `int waitTime` - Stores the waiting time in minutes.
- `double rating` - Stores the restaurant's rating.
- `double avgPrice` - Stores the average price of the food.
- `double distance` - Stores the distance to the restaurant.
- `String hoursOpen` - Stores the restaurant's operating hours.

I added the name field to the Restaurant class and updated the constructor, getter, and setter methods to include it.

## Getters and Setters

I changed the Restaurant fields to private so they cannot be accessed directly from other classes.

I used getter methods to retrieve information and setter methods to change the information.

For example:
- `getName()` gets the restaurant's name.
- `setName()` changes the restaurant's name.

This helped me understand how to control access to an object's information.

## User Input

In the Main class, I used a Scanner to ask the user to enter information about a restaurant.

The program asks for:
- Restaurant name
- Wait time
- Rating
- Average price
- Distance
- Operating hours

I included examples in the prompts so the user knows what type of information to enter.

Once the user enters the information, the program uses those values to create a Restaurant object.

## ArrayList

I created an `ArrayList<Restaurant>` to store Restaurant objects.

After creating the Restaurant object, I used the `.add()` method to add it to the ArrayList.

This helped me understand how ArrayLists can store objects and how they can be used to organize information.

The ArrayList can also be used to store more restaurants if the program is expanded later.

## toString() Method

I added a `toString()` method to the Restaurant class.

This method returns the restaurant's information as a formatted String instead of displaying the object's default representation.

It makes the information easier to read by showing each field with a label.

## Example Output

An example of the restaurant information is:

    Restaurant: In-N-Out Burger
    Wait time: 10 minutes
    Rating: 3.9 stars
    Average price: $10.00
    Distance: 11.0 miles
    Hours open: 10:30 AM - 1:00 AM

## What I Learned

In this assignment, I learned how to add a new field to a class and update the constructor, getters, and setters.

I also learned how to use Scanner to collect information from the user and create an object using that information.

Using an ArrayList showed me how to store objects in a list, and the toString() method helped me understand how to display information in a cleaner format.

Overall, this assignment helped me better understand how Java classes, objects, methods, and ArrayLists work together.

## How to Run the Program

1. Open the project in IntelliJ IDEA.
2. Make sure Main.java and Restaurant.java are in the project.
3. Run the main method in Main.java.
4. Enter the restaurant information when prompted.
5. View the restaurant information in the console.
