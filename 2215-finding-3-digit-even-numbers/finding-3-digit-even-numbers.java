class Solution {
    public int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> ans = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        //  build frequency map
        for (int i = 0; i < digits.length; i++) {
            if (map.containsKey(digits[i])) {
                int freq = map.get(digits[i]);
                map.put(digits[i], freq + 1);
            } else {
                map.put(digits[i], 1);
            }
        }

        //  check all 3-digit numbers
        for (int j = 100; j <= 999; j++) {

            if (j % 2 != 0) continue; // even check

            int x = j;
            int c = x % 10;
            x = x / 10;
            int b = x % 10;
            x = x / 10;
            int a = x % 10;

            if (map.containsKey(a)) {
                int rep = map.get(a);
                if (rep == 1) map.remove(a);
                else map.put(a, rep - 1);

                if (map.containsKey(b)) {
                    int rep1 = map.get(b);
                    if (rep1 == 1) map.remove(b);
                else map.put(b, rep1 - 1);

                    if (map.containsKey(c)) {
                        ans.add(j);
                        // we are not checking anything not decreasing freq of c because c is the last element and after this nothing 
                        //to agar yeh hai to add krdo nhi hh to aage bhdjaoo 
                    }
                    map.put(b,rep1);
                }
                map.put(a,rep);
            }
        }

        //  convert to array
        int[] ans2 = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            ans2[i] = ans.get(i);
        }

        return ans2;
    }
}