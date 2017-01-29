# FreezeTag

A simple yet intuitive tag-based query language

## The Basics

Suppose one wishes to store information about a person named Holly Smith that lives in Seattle. To store object-related 
information, the following syntax is used.
```
@person +firstName Holly +lastName Smith +city Seattle
```
The characters following the `@` symbol indicates the type of object to store, in this case `person`. This is followed 
by one or more properties (key-value pairs), all prefixed with the `+` symbol to indicate their creation.

Now suppose we forgot the city this person lived in. We can query for that information as follows.
```
@person #firstName Holly #lastName Smith #city?
```
If we simply want all available properties for a person with first name Holly, we can do:
```
@person? #firstName Holly
```
What do we do if we want to append properties to an existing object? We do this:
```
@person #firstName Holly +middleName Emily
```
And we can also remove properties.
```
@person #firstName Holly -middleName
```
Note that objects can have multiple properties with the same key. Thus, queries of that property will yield multiple 
values.
```
@animal #name monkey +has tail +has head +has body
@animal #name monkey has?
```

## Relations

More advanced statements can be constructed to indicate relationships between objects. Suppose Holly Smith knows John 
Wilkins.
```
@person +firstName Holly +lastName Smith
@person +firstName John +lastName Wilkins

@person #firstName Holly #lastName Smith +knows @person #firstName John #lastName Wilkins

@person #firstName John #lastName Wilkins #knows?
```
That last statement queries for anyone John Wilkins knows.

## Omitted Expressions

To increase flexibility, the `@` symbol and name can be omitted, creating a more general statement. For instance, 
we can query for the last name of any object with the first name of Holly.
```
#firstName Holly #lastName?
```
Or return all objects that have the property key `knows`:
```
#knows?
```
