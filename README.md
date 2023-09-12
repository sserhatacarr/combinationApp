# Combination Calculator

## Introduction

This Java program calculates the number of combinations (subsets) of elements in a cluster. It prompts the user to enter the number of elements in the cluster and the number of element subsets they want to calculate. Then, it uses the combination formula to compute the result.

## Usage

1. Clone this repository or download the `Main.java` file.
2. Compile the Java program using `javac Main.java`.
3. Run the program using `java Main`.

## How It Works

1. The program prompts the user to enter the number of elements in the cluster (n) and the desired number of element subsets (r).
2. It calculates the factorials of n, r, and (n - r) using iterative loops.
3. It uses the combination formula to calculate the number of subsets: C(n, r) = n! / (r! * (n - r)!).
4. The result is displayed to the user.

## Example

Enter the number of cluster elements : 5
How many element subsets do you want : 2
Number of subsets: 10

## Author

- Serhat Acar

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
