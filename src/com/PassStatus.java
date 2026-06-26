package com;

public enum PassStatus {
    // enum 상수는 PASSED, FAILED 두 개를 둔다.

    PASSED("합격"),
    FAILED("불합격");

    private final String label;

    // 각 상수는 화면에 보여 줄 한글 값을 가진다.
    PassStatus(String label) {
        this.label = label;
    }

    //- 한글 값을 꺼내는 `getLabel()` 메서드를 둔다.
    public String getLabel() {
        return label;
    }


}