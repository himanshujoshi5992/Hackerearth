// I have given O(n) solution to this problem >> https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/my-girlfriend-and-her-love-for-cats-1/description/
#include <stdio.h>

int main() {
    int n = 0;

    scanf("%d", &n);
    int a[1000001];
    int b[1000001];

    // Initialize the two arrays
    for(int i = 0;i < 1000001;i++) {
        a[i] = 0;
        b[i] = 0;
    }
    // Hash the values into the arrays
    for(int i = 0;i < n;i++) {
        int num;
        scanf("%lld", &num);
        a[num]++;
    }
    for(int i = 0;i < n;i++) {
        int num;
        scanf("%lld", &num);
        b[num]++;
    }
    int i = 1000000,j = 1000000;
    unsigned long long sum = 0;
    unsigned long long int n1 = 0,n2 = 0;

    // Evaluating the arrays from right end and multiplying the numbers
    while (i > 0 && j > 0) {

        // Evaluating 'a' array
        while (i > 0) {
            if (a[i] != 0) {
                n1 = i;
                a[i]--;
                break;
            } else
                i--;
        }

        // Evaluating 'b' array

        while (j > 0) {

            if (b[j] != 0) {
                n2 = j;
                b[j]--;
                break;
            } else
                j--;
        }

        // Adding the multiplied value to sum
        sum += (long long)(n1*n2);
        n1 = 0;
        n2 = 0;
    }

    printf("%lld", sum);

    return 0;
}
