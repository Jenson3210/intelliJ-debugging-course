# Set value

The "setValue" feature in IntelliJ IDEA allows you to modify the value of variables during a debugging session. It provides a convenient way to change variable values on-the-fly without having to recompile or restart your program. This feature can be particularly useful for testing different scenarios, correcting erroneous values, or experimenting with different inputs.

This feature can be used on primitives and complex types.

To use the "setValue" feature in IntelliJ IDEA's debugger, follow these steps:

- Start a debugging session by running your program in debug mode.
- Set breakpoints at appropriate locations in your code where you want to modify variable values.
- When the debugger pauses at a breakpoint, navigate to the Variables panel in the Debugger panel. This panel displays the variables in the current scope.
- Locate the variable you want to modify and right-click on it. Select the "Set Value" option from the context menu.
- In the "Set Value" dialog, enter the desired new value for the variable and click "OK". IntelliJ IDEA will update the variable's value to the one you specified.
- Resume program execution by clicking the "Resume Program" button or using the appropriate keyboard shortcut.

> It is important to realize that by doing this you might be testing scenario's that are never going to happen. 
> This should only be used if you need to analyze behaviour which is hard to replicate or want your later code to end up in different branches of the code.

## OVER TO YOU!

- In the previous exercise you could have a setter call in evaluate expression to bypass the "bug"
- Since the class now has @Value, it does not have setters. 
- However, by putting a breakpoint on the `successMessageOrThrow` first line, you can still overwrite the value using the setValue feature
- Use it to avoid the exception being thrown by setting the success variable. 
