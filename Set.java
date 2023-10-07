import java.util.Scanner;

public class Set {
    private int[] set;

    public Set() {
        set = new int[10];
    }

    public Set(int length) {
        set = new int[length];
    }

    public boolean isContains(int element) {
        for (int i : set) {
            if (i == element) {
                return true;
            }
        }
        return false;
    }

    public boolean isExists() {
        return set.length > 0;
    }

    public Set intersection(Set secondSet) {
        Set intersectionSet;
        int countOfCommonNumbers = 0;
        for (int i : set) {
            if (secondSet.isContains(i)) {
                countOfCommonNumbers++;
            }
        }
        intersectionSet = new Set(countOfCommonNumbers);
        // int index = 0;
        for (int i : set) {
            if (secondSet.isContains(i)) {
                intersectionSet.addIntoSet(i);
                // index++;
            }
        }
        return intersectionSet;
    }

    public int fetchIndex(int element) {
        int index = 0;
        for (int i : this.set) {
            if (i == element) {
                break;
            } else {
                index++;
            }
        }
        return index;
    }

    public int fetchAt(int index) {
        try {
            return this.set[index];
        } catch (IndexOutOfBoundsException iBoundsException) {
            System.out.println(iBoundsException.getMessage());
            return 0;
        }
    }

    public int countOfElementInSet(Set set, int element) {
        int count = 0;
        for (int i = 0; i < set.length(); i++) {
            if (set.fetchAt(i) == element) {
                count++;
            }
        }
        return count;
    }

    public Set removeDuplicateElements(Set set) {
        Set uniqueSet = new Set(this.set.length);
        for (int i = 0; i < set.length(); i++) {
            if (!uniqueSet.isContains(set.fetchAt(i))) {
                uniqueSet.addIntoSet(set.fetchAt(i));
            }
        }
        return uniqueSet;
    }

    public Set add(Set secondSet) {
        Set combinationSet = new Set(this.set.length + secondSet.length());
        // int index = 0;
        for (int i : this.set) {
            combinationSet.addIntoSet(i);
            // index++;
        }

        for (int i = 0; i < secondSet.length(); i++) {
            if (!combinationSet.isContains(secondSet.fetchAt(i))) {
                combinationSet.addIntoSet(secondSet.fetchAt(i));
                // index++;
            }
        }

        return combinationSet;
    }

    public Set subtract(Set secondSet) {
        Set differenceSet = new Set(this.set.length > secondSet.length() ? this.set.length : secondSet.length());
        if (this.set.length > secondSet.length()) {
            // int index = 0;
            for (int i : set) {
                if (countOfElementInSet(secondSet, i) <= 1) {
                    differenceSet.addIntoSet(i);
                    // index++;
                }
            }
        } else {
            // int index = 0;
            for (int i = 0; i < secondSet.length(); i++) {
                if (countOfElementInSet(secondSet, secondSet.fetchAt(i)) <= 1) {
                    differenceSet.addIntoSet(secondSet.fetchAt(i));
                    // index++;
                }
            }
        }
        return differenceSet;
    }

    public Set unionSet(Set secondSet) {
        Set union = add(secondSet);
        return removeDuplicateElements(union);
    }

    public int length() {
        return this.set.length;
    }

    public String toString() {
        StringBuilder setString = new StringBuilder("{");
        int count = 0;
        for (int i : this.set) {
            count++;
            if (count == this.set.length) {
                setString.append(i).append("}");
            } else {
                setString.append(i).append(",");
            }
        }
        return setString.toString();
    }

    public void addIntoSet(int element) {
        int index = 0;
        while (index < this.set.length) {
            if (this.set[index] == 0) {
                this.set[index] = element;
                break;
            }
            index++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first set
        System.out.print("Enter the size of the first set: ");
        int size1 = scanner.nextInt();
        Set set1 = new Set(size1);

        for (int index = 0; index < size1; index++) {
            System.out.print("Enter an element for the first set: ");
            int elementToAdd = scanner.nextInt();
            set1.addIntoSet(elementToAdd);
        }

        // Input for the second set
        System.out.print("Enter the size of the second set: ");
        int size2 = scanner.nextInt();
        Set set2 = new Set(size2);

        for (int index = 0; index < size2; index++) {
            System.out.print("Enter an element for the second set: ");
            int elementToAdd = scanner.nextInt();
            set2.addIntoSet(elementToAdd);
        }

        System.out.println("Union of the two sets: ");
        System.out.println(set1.unionSet(set2));
        System.out.println("Intersection of the two sets: ");
        System.out.println(set1.intersection(set2));

        scanner.close();
    }
}
