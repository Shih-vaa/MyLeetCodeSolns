// Title: Reverse Substrings Between Each Pair of Parentheses
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/

            else {
                i = link[i];
                dir = -dir;
            }
        }
        
        return sb.toString();
    }
}
