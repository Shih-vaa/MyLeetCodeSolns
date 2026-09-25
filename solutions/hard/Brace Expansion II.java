// Title: Brace Expansion II
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/brace-expansion-ii/

        // No braces left
        if (r == -1) {
            ans.add(s);
            return;
        }

        // Find matching '{'
        int l = s.lastIndexOf('{', r);

        String left = s.substring(0, l);
        String right = s.substring(r + 1);
