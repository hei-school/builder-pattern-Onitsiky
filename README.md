# <center> Builder Pattern - Java Implementation </center>

In this repository, I am implementing the *__Builder Design Pattern__* in _Java_.

## How to run tests locally

First, clone the project into your local machine, by running:
```shell
    git clone https://github.com/hei-school/builder-pattern-Onitsiky.git
```

Then you could directly run the tests. To do so, just run the following command:
```shell
    ./gradlew test
```

> At the first time it may take a little bit long time as it will have to download all the required dependencies,
> but from the second time you run it, it should be quicker than the first one

Or also, using you favorite IDE, you can directly run the tests.

## File structure
In the package *__src/main/java/org/example__*:
- the classes _Car_ and _Manual_ defines the car and manual objects.
- the interface _Builder_ defines the method which should be implemented to build an object
- the classes _CarBuilder_ and _ManualBuilder_ are implementing the _Builder_ interface, and defines how to build a _Car_ or _Manual_ object
- the class _Director_ is the one where we define how to build a specific type of car and/or manual

In the package *__src/test/java/org/example__*, we have the test class where we check our implementation.
The class _BuilderTest_ is the one which is run when running the command to launch the tests.


[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/eYTuOlgZ)
