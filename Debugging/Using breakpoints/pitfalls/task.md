# Common Pitfalls
![](https://badgen.net/badge/level/basic/green?icon=awesome)

Breakpoints in Java can be considered controversial because they have the potential to disrupt the normal flow of execution and introduce unexpected behavior into the debugging process. However, they are a powerful feature if used correctly! Described below are several things to look out for!

## Developer's Breakpoint Fatigue

Method breakpoints can be overused, leading to "breakpoint fatigue." If breakpoints are set on numerous methods, it becomes challenging to manage and navigate through the paused code during debugging. It can make the debugging process overwhelming and less efficient. Makes sure to clean up your breakpoints after debugging process to avoid having them impact you in upcoming debugging flows. 
In IntelliJ, it is very easy to do this using the `View Breakpoints...` button.

## Side Effects

When a method breakpoint is triggered, the program pauses at the entry point of the method. This can interrupt the normal execution flow and cause side effects. If the paused method has critical side effects or is invoked frequently, pausing at every method entry can impact the program's behavior and performance.

## Concurrency Issues

In multithreaded programs, method breakpoints can introduce race conditions and other concurrency issues. Pausing the program at the entry of a method can disrupt the synchronization and ordering of threads, potentially leading to unexpected behavior or even deadlocks. Make sure to do the Advanced training topic on the matter before debugging multithreaded applications!

## Performance Impact

Setting numerous method breakpoints or placing them in frequently called methods can significantly impact the performance of the program. Pausing the execution at each method entry requires additional processing and can slow down the debugging process.

