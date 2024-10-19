# Method breakpoints
![](https://badgen.net/badge/level/intermediate/yellow?icon=awesome)

## THEORY

A method breakpoint is a type of breakpoint that is set on a specific method in your code. When the execution reaches that method during debugging, the program pauses, allowing you to inspect the method's behavior, its arguments, and its return values.
It is particularly useful in scenario's where you see a failure in an interface method.
You simply put a method breakpoint there and all implementations will be breaking. 

> In particular more experienced/older developers will not be really fond of this feature. They will often be afraid of the performance impact of these breakpoints.
> This feature exists in "plain java debugging process" also, where it used to cause significant impact, but is implemented differently in IntelliJ.

## OVER TO YOU!

In this example we have created a really simple filter chain. 
This filter chain will filter each request which comes in and send it through multiple filters.
We will put a breakpoint on the `Filter` interface's `doFilter` method and see it triggered for every invocation. 
Especially for complexer flows (eg Spring's filter chain, Spring's startup hooks/lifecycle), it might be a useful feature.

- Looking at the code, there is a main with a simple request being filtered.
- Run it in debug mode
- Code will fail
- Put a breakpoint on line 22
- Run it again
- You can really trace the request through all Filter integrations. Even the chain itself is a filter in this case.
- Can you spot/fix all the mistakes?
