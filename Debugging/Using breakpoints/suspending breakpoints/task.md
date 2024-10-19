# Suspending breakpoints
![](https://badgen.net/badge/level/basic/green?icon=awesome)

## THEORY

In IntelliJ IDEA, a suspending breakpoint is a type of breakpoint that pauses the code execution when it's hit. 
These breakpoints can be configured with conditions or hit counts, allowing you to control when the breakpoint should pause the program.

You can put a breakpoint on a line (circles) or on a method (squares).
Breakpoints are set by clicking next to the line number of the line you want to initiate debugging. 

Remember to remove breakpoints when you no longer need them to avoid unnecessary interruptions in your program's execution.

## OVER TO YOU!

Remember that `RuntimeException`? The stacktrace gives you a hint on where to put your breakpoint: 

![Exception details](../../../images/exception.png)

The greyed out `RuntimeException` is not part of our own code. That's why it is greyed out. 

The blue `Main` indications are the 'stack' of your code at the moment of the exception.  
Generally speaking, you will find the root cause of the exception at the highest line in the stack which is blue. 
This can be different if you have error handling with catches and wrapping exceptions. But at least, the blue parts should always be something to look at. 

We will try to analyse the root cause by putting a breakpoint on line 21 as that line is mentioned in the stacktrace. 

Now run the code again.

Your IDEA will show a debug bar at the bottom and the line will turn blue indicating that you have reached this point of the code.

The bottom section will show the values of all variables at this moment in execution. 
By now you will probably have spotted that "SUCCESS" is not equal to "TRUE". 

![Debug session 1](../../../images/debug_1.png)

Congrats!

