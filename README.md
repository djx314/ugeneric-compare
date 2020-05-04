ugeneric-compare
===============

Compile time compare between ugeneric and each framework itself.  

## Slick
Run
```scala
sbt>aclean
```
Run
```scala
sbt>slickRaw
```
and write the await time to txt.  

Run
```scala
sbt>slickCompare
```
and write the await time to txt.

Then get the slick module test result:
```scala
[slick module]
sbt>aclean
sbt>slickRaw
Takes 94s
sbt>slickCompare
Takes 24s
```
