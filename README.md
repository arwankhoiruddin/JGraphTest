# JGraphTest

This is repository for creating a new tool for testing using Graph

The idea is to make tester works to be much easier. Rather than writing all test cases, they will need to simply write TestComponents and connect all the TestComponents using directed graph. This tool will traverse all the path from the connected TestComponents and perform the test automatically.

For example, 

```
addPath(dropbox, fillUsername)
addPath(gdrive, fillUsername)
addPath(fillUsername, fillPassword)
addPath(fillPassword, submit)
addPath(submit, windowA)
addPath(submit, windowB)
```

This library will list all the path from beginning to end, list them, and test all the paths. E.g. here

```
dropbox, username, password, submit, windowA: PASS
dropbox, username, password, submit, windowB: FAILED
gdrive, username, password, submit, windowA: PASS
gdrive, username, password, submit, windowB: PASS
```

If you are interested to contribute in this project, feel free to contact me (arwan.khoiruddin[at]gmail.com)
