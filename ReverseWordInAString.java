class ReverseWordInAString{
    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }

    // Optimized
    public static String reverseWords(String s){
        int n = s.length();
        StringBuilder result = new StringBuilder();

        int i = n - 1;
        while (i >= 0) {
            // Skip trailing spaces
            while (i >= 0 && s.charAt(i) == ' ') i--;

            if (i < 0) break;

            int j = i;
            // Find start of the word
            while (i >= 0 && s.charAt(i) != ' ') i--;

            // Append the word
            result.append(s.substring(i + 1, j + 1)).append(" ");
        }

        // Remove the trailing space if any
        return result.toString().trim();

    }

    // Not Optimized but batter
    /*public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int wStartIdx = -1; // word start Index
        int wEndIdx = - 1; // word end Index
        for (int i = s.length() - 1; i > -1; i--) {
            if (s.charAt(i) != ' ') {
                if (wEndIdx != -1) {
                    wStartIdx = i;
                }else{
                    wEndIdx = i;
                    wStartIdx = i;
                }
            } else if(wStartIdx != -1 && wEndIdx != -1) {
                if(sb.length()!=0){
                    sb.append(' ');
                }

                while (wStartIdx <= wEndIdx) {
                    sb.append(s.charAt(wStartIdx));
                    wStartIdx++;
                }
                wStartIdx = -1;
                wEndIdx = -1;
            }
        }

        if(wStartIdx != -1 && wEndIdx != -1){
            if(sb.length()!=0){
                sb.append(' ');
            }
            while (wStartIdx <= wEndIdx) {
                sb.append(s.charAt(wStartIdx));
                wStartIdx++;
            }
            wStartIdx = -1;
            wEndIdx = -1;
        }

        if(wEndIdx != -1){
            if(sb.length()!=0){
                sb.append(' ');
            }
            sb.append(s.charAt(wEndIdx));
        }

        return sb.toString();
    }*/
}
