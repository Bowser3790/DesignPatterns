# Design Pattern Repository README

Welcome to the Design Pattern repository! This repository contains various design pattern implementations in Java. Each pattern demonstrates specific behaviors to solve common software design challenges. Whether you're learning about design patterns or seeking to apply them in your projects, this repository has you covered.

## Table of Contents

1. [Introduction](#introduction)
2. [Behavioral Design Patterns](#behavioral-design-patterns)
   - [Chain of Responsibility](#chain-of-responsibility)
   - [Mediator](#mediator)
3. [Creational Design Patterns](#creational-design-patterns)
   - [Abstract Factory](#abstract-factory)
   - [Factory Method](#factory-method)
   - [Singleton](#singleton)
4. [Structural Design Patterns](#structural-design-patterns)
   - [Composite](#composite)
   - [Decorator](#decorator)
   - [Facade](#facade)
   - [Proxy](#proxy)

## Introduction

Design patterns are proven solutions to recurring problems in software design. They provide a set of best 
practices that help improve code readability, maintainability, and scalability. In this repository, you'll 
find examples of various design patterns implemented in Java.

## Behavioral Design Patterns

### Chain of Responsibility

- `Approver.java`: An interface defining the handler's role in the chain of responsibility.
- `ChainOfRespRunner.java`: A runner class demonstrating the chain of responsibility pattern.
- `GeneralManager.java`: An implementation of the `Approver` interface representing a general manager.
- `Manager.java`: An implementation of the `Approver` interface representing a manager.
- `Officer.java`: An implementation of the `Approver` interface representing an officer.

### Mediator

- `Dispatcher.java`: An interface defining the mediator's role.
- `Expert.java`: An implementation of the `Dispatcher` interface representing an expert.
- `MessageDispatcher.java`: An implementation of the `Dispatcher` interface responsible for message dispatching.
- `MessageExpert.java`: An implementation of the `Dispatcher` interface representing a message expert.
- `MessageRunner.java`: A runner class demonstrating the mediator pattern.

## Creational Design Patterns

### Abstract Factory

- `abstractFactory` directory: Contains the abstract factory design pattern implementation.

### Factory Method

- `factoryDP` directory: Contains the factory method design pattern implementation.

### Singleton

- `singletonDP` directory: Contains the singleton design pattern implementation.

## Structural Design Patterns

### Composite

- `compositeDP` directory: Contains the composite design pattern implementation.
- `CompositeRunner.java`: A runner class demonstrating the composite pattern.
- `Department.java`: An interface representing a department.
- `Finance.java`, `HumanResource.java`, `RnD.java`, `Sales.java`: Classes representing specific departments.

### Decorator

- `decoratorDP` directory: Contains the decorator design pattern implementation.
- `DecoratorRunner.java`: A runner class demonstrating the decorator pattern.
- `Iphone.java`, `Iphone11.java`, `Iphone11Pro.java`, `Iphone11ProMax.java`: Classes representing different iPhone models.
- `IphoneDecorator.java`: An abstract class representing the iPhone decorator.
- `Phone.java`: An interface representing a phone.

### Facade

- `facadeDP` directory: Contains the facade design pattern implementation.
- `AESEncryptor.java`, `CustomEncryptor.java`, `FacadeEncryptor.java`, `MD5Encryptor.java`, `SHAEncryptor.java`: Classes representing various encryption methods.

### Proxy

- `proxyDP` directory: Contains the proxy design pattern implementation.
- `ImageGenerator.java`, `ImageProxyClass.java`, `ProxyRunner.java`, `RealImageClass.java`: Classes representing image generation and proxy.

---

I hope you find this Design Pattern repository helpful in understanding and applying various design patterns in your software development. If you have any questions or need further assistance, feel free to explore the individual pattern implementations or reach out through GitHub issues.

Happy coding and enjoy mastering the art of software design patterns!
