package com.company;

import java.util.Stack;

public class ValidParenthesisString678 {
    public boolean checkValidString(String s) {
        Stack<Character> st = new Stack<>();
        int countLeft=0;
        int countRight = 0;
        int starStatus = 2;
        for (int i=0; i < s.length(); i++) {
            if (s.charAt(i) == ')') countRight++;
            if (s.charAt(i) == '(') countLeft++;
        }
        int diff = 0;
        if (countLeft > countRight) {
            starStatus = 1;
            diff = countLeft - countRight;
        } else if (countLeft < countRight) {
            starStatus = -1;
            diff = countRight - countLeft;
        } else if (countLeft == countRight) {
            starStatus = 0;
            diff = countRight - countLeft;
        }

        for (int i=0; i < s.length(); i++) {
            if (starStatus == -1) {
                if (s.charAt(i) == '(' || s.charAt(i) == '*') {
                    if (s.charAt(i) == '*') diff--;
                    if (diff < 0) return false;
                    st.push('(');
                }
                if (s.charAt(i) == ')') {
                    if (st.isEmpty()) return false;
                    st.pop();
                }
            } else if (starStatus == 1) {
                if (s.charAt(i) == ')' || s.charAt(i) == '*') {
                    if (s.charAt(i) == '*') diff--;
                    if (diff < 0) return false;
                    if (st.isEmpty()) return false;
                    st.pop();
                }
                if (s.charAt(i) == '(') {
                    st.push('(');
                }
            } else if (starStatus == 0) {
                if (s.charAt(i) == ')') {
                    if (st.isEmpty()) return false;
                    st.pop();
                }
                if (s.charAt(i) == '(') {
                    st.push('(');
                }
            }
        }

        return st.isEmpty();

    }
}
