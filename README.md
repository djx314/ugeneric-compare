ugeneric-compare
===============

Compile time compare between [ugeneric](https://github.com/scalax/ugeneric) and each framework itself.  

## Slick
1.Run
```scala
sbt>cleanAll
sbt>updateAll
```

2.Run
```scala
sbt>slickRaw
```
and write the waste time to txt.

3.Run
```scala
sbt>slickCompare
```
and write the waste time to txt.

Then get the slick module test result:
```scala
[slick module]
sbt>cleanAll
sbt>updateAll
sbt>slickRaw
Takes 94s
sbt>slickCompare
Takes 24s
```

## Circe
1.Run
```scala
sbt>cleanAll
sbt>updateAll
sbt>circePre
```

2.Run
```scala
sbt>circeRaw
```
and write the waste time to txt.

3.Run
```scala
sbt>circeDerivation
```
and write the waste time to txt.

4.Run
```scala
sbt>circeCompare
```
and write the waste time to txt.

Then get the slick module test result:
```scala
[circe module]
sbt>cleanAll
sbt>updateAll
sbt>circePre
sbt>circeRaw
Takes 48s
sbt>circeDerivation
Takes 6s
sbt>circeCompare
Takes 21s
```

## Circe-Fail
1.Run
```scala
sbt>cleanAll
sbt>updateAll
```
Change a file in https://github.com/djx314/ugeneric-compare/blob/master/modules/circe-fail/models/src/main/scala/ModelForFail.scala makes it compile failed in circe.  

Then run
```scala
sbt>circeFailPre
```

2.Run
```scala
sbt>circeFailRaw
```
and write the waste time to txt.

3.Run
```scala
sbt>circeFailDerivation
```
and write the waste time to txt.

4.Run
```scala
sbt>circeFailCompare
```
and write the waste time to txt.

Then get the slick module test result:
```scala
[circe fail module]
sbt>cleanAll
sbt>updateAll
Change the file to compile fail
sbt>circeFailPre
sbt>circeFailRaw
Takes 63s
sbt>circeFailDerivation
Takes 1s
sbt>circeFailCompare
Takes 1s
```