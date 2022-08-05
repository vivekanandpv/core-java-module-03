//  In Java, the classes can be generalized
//  (as in taking the common factor)
//  This allows specializing them in different ways
//  Thus we keep the features of generalized class
//  and specialized class in different silos
//  This makes it easy to modularize code.
//  Modular design leads to easy scaling, ease of maintenance,
//  and a rational design (the design that is easy to reason about)

//  A generalized version of a class is called a superclass
//  A specialization of this class is called a subclass

//  Here the intention is to generalize the features of different shapes
//  in the Shape superclass. Specializations of this would be Circle or Triangle
//  subclasses

//  We say, Circle (or Triangle) "extends" or "inherits" from Shape
//  The syntax is: subclass extends superclass

//  Please note that, in Java, a class implicitly extends from Object superclass
//  if no explicit superclass is defined (such as for Shape class down here)

public class Shape {
}
