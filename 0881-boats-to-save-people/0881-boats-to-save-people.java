
class Solution {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int s = 0;
        int l = people.length - 1;
        int c = 0;

        while (s <= l) {

            
            if (people[s] + people[l] <= limit) {
                s++;
            }

            
            l--;

            c++;
        }

        return c;
    }
}

