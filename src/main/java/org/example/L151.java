package org.example;

class L151 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] array = s.split(" ");

        for (int i = array.length - 1; i >= 0; i--) {
            if (!array[i].isEmpty()) {
                sb.append(array[i]);
                sb.append(" ");
            }
        }

        return sb.toString().trim();
    }
}