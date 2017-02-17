# FreezeTag

A simple yet intuitive tag-based query language. FreezeTag is designed to be composable: you can retrieve, add, and remove information as you please.

## The Basics

### Creating New Entities
Suppose one wishes to store information about a person named Holly Smith that lives in Seattle. To store entity-related information, the following syntax is used.
```
@person +firstName Holly +lastName Smith +city Seattle
```
The characters following the `@` symbol indicates the type of entity to store; in this case we want to create a new `person`. This is followed by one or more `+` properties, which consist of two parts: the *type* of information you want to store (e.g., `firstName`), and the *value* of that type, (e.g., `Holly`). The `+` is the first kind of property, the *create* property that will store the information we want. Note that the type must not have any spaces (but anything in the value may have spaces).

The property type does not need to be unique. One can have multiple items associated with a type. Take this example, for instance.
```
@animal +name monkey +has head +has body +has tail
```
We have specified `has` multiple times, indicating that it can have multiple values of our choosing.

### Searching for Entities
Now suppose we forgot the city this person lived in. We can query for that information, given we know at least one property about the entity we just created.
```
@person #firstName Holly
```
Note that instead of a `+`, we see a `#`, which means we want to *search* instead of create. This statement will find all `person` entities with a `firstName` of `Holly`, and retrieve them. Since we created only one person, we will retrieve just that person. But, if we so happen to create multiple persons with the first name of `Holly`, all of those persons will be retrieved. In that case, it is beneficial to be more specific.
```
@person #firstName Holly #lastName Smith
```
This statement is less ambiguous, so it is less likely that you will get multiple results that match. In general, a rule of thumb is to be more specific if you get too many results that come back.

### Adding Properties to Existing Entities
What do we do if we found out that Holly has a middle name of Emily, and we wish to add that information to the system?
```
@person #firstName Holly #lastName Smith +middleName Emily Echo
```
Here we have used a combination of the `#` and `+` properties. As with the previous examples, the `#` properties mean that we wish to find an entity that has the name of Holly Smith. Then, the `+middleName Emily Echo` will append new information (i.e., the middle name) to the person. Note that if there exist multiple Holly Smith persons, then they will all update with the new middle name information, so be mindful of what entities match the `#` properties. One can always check by simply omitting the `+` properties to just find out what entities are being matched.

### Removing Properties to Existing Entities
If we made a mistake on a property, or we no longer deem it relevant, we can remove it in the same manner as we created it, except using the `-` symbol.
```
@person #firstName Holly #lastName Smith -middleName Emily Echo
```

## Omitted Expressions
To increase flexibility, the `@` property and name can be omitted, creating a more general statement. For instance, we can find any entity with the first name of Holly.
```
#firstName Holly
```
The search will not omit results based on whether the entity is a `@person`, `@place`, `@animal`, etc.

## Relations (COMING SOON)

**Relations are not completed yet, so skip this section.**

~~More advanced statements can be constructed to indicate relationships between entities. Suppose Holly Smith knows John 
Wilkins.~~
```
@person +firstName Holly +lastName Smith
@person +firstName John +lastName Wilkins

@person #firstName Holly #lastName Smith +knows @person #firstName John #lastName Wilkins

@person #firstName John #lastName Wilkins #knows
```
~~The last statement above will search for anyone John Wilkins knows.~~


