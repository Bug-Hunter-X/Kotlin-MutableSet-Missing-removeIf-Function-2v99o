# Kotlin MutableSet Missing removeIf Function

This example demonstrates a subtle difference in the behavior of the `removeIf` function across different Kotlin collection types. While `removeIf` works seamlessly with `MutableList` and `MutableMap`, it's notably absent from `MutableSet`, resulting in a compilation error if used directly.

This is a potential source of unexpected errors for developers who assume consistent behavior across all collection types.

## Solution

The solution involves using the `removeAll` function along with a predicate to achieve the same effect as `removeIf` on `MutableSet`.