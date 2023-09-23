def isValid(s: str) -> bool:
    stack = []
    open = "({["
    close = ")}]"
    for c in s:
        if c in open:
            stack.append(c)
        if c in close:
            if not stack:
                return False

            top = stack.pop()
            if open.index(top) != close.index(c):
                return False
    return not stack
