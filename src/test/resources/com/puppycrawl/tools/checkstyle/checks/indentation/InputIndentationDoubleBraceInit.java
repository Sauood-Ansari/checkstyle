package com.puppycrawl.tools.checkstyle.checks.indentation.indentation;

import java.util.HashMap;

public class InputIndentationDoubleBraceInit {
    void test() {
        var map = new HashMap<>() {{
            put("KEY1", "VALUE1");
            put("KEY2", "VALUE2");
        }};
    }
}