# Matrix multiplication with Markov Chain Analysis

__*The following is the instructions supplied for the project.*__

In this assignment, we explore the transition probabilities of Markov Chains. We focus on two different algorithms for solving this problem with matrixmultiplication algorithm. 

## History and Background

In 1907, A. A. Markov began the study of chance processes for which the knowledge of each outcome is relevant only in predicting next outcome. This study has come to be known as the Markov chains and found in large number of areas like marketing, health services, finance, production and accounting.

Assume we have set of states, ```S = {S1, S2, S3, ......, Sk}```. The process starts in one of the states at time, ```T=0```, and moves successively from one state to another at unit time intervals.

```Time T = 0 T = 1 T = 2 ................... T = k```
```State S1 S2 S3 ................... Sk```

Each move is called a step. The probability ```Pij``` that the process moves from state ```Si``` to state ```Sj``` depends only on the state ```Si``` occupied before the step. In another words, the probability distribution of the state at time ```T+1``` depends on the state at time ```T``` and does not depend on the states the chain passed through on the way.

The probabilities ```Pij``` are called transition probabilities.

Suppose the entire cola industry produces only three colas ```[cola1, cola2, cola3]```. Given that a person last purchased ```cola1```, there is a 90% chance that his/her next purchase will be ```cola1```. Given that a person last purchased ```cola2```, there is a 90% chance that his/her next purchase will be ```cola2```. Also, given that a person last purchased ```cola3```, there is a 90% chance that his/her next purchase will be ```cola3```.

Now we can define the initial probability distribution for this example. Werepresent this in a transition probability matrix Q:

Q | cola1 | cola2 | cola3
--|--|--|--|
cola1 | 0.9  | 0.05  | 0.05
cola2 | 0.05 | 0.9   | 0.05
cola3 | 0.05 | 0.05  | 0.9

In this example, each entry in the matrix Q must be non-negative and the entries in each row must sum to 1 (special case of Markov chains). We view each person's purchase as a Markov chain with the state at any given time being the type of cola the person last purchased. So, how do we answer the question, if a person is currently a ```cola2``` consumer, what is the probability that he/she will purchase ```cola1``` ```N (where n > 0)``` purchases from now on?

Let’s solve this problem for two purchases from now on, 

__*I am unsure what this is even supposed to be...is it a matrix? If so where do you split the thing into rows? The text below is supplied as is...so, so major confusion here.*__

```
Q2
0.9 0.05 0.05 * 0.9 0.05 0.05 = 0.815 0.092 0.092
0.05 0.9 0.05 0.05 0.9 0.05 0.092 0.815 0.092
0.05 0.05 0.9 0.05 0.05 0.9 0.092 0.092 0.815
```

So the probability of purchasing a ```cola1``` in two purchases from now on by the ```cola2``` consumer is ```.092``` or ```9.2%```.

You are supposed to implement two algorithms to solve this problem, and compare the results for efficiency of the algorithms. We have already implemented matrixmultiplication in Lab 1, use the same matrix multiplication algorithm when implementing following two algorithms. Use the given initial Q matrix to test your programs

| Algorithm 1 | Algorithm 2 |
| -- | -- |
| Q * Q = Q2 | Q * Q = Q2 |
| Q2 * Q = Q3 | Q2 * Q = Q3 |
| Q3 * Q = Q4 | Q3 * Q2 = Q5 |
| Q4 * Q = Q5 | Q5 * Q3 = Q8 |
| Q5 * Q = Q6 | Q8 * Q5 = Q13 |

You may observe the convergence property of these transition matrixes, with increasing ```N```, where ```N``` is the number of times the matrixes are multiplied, NOT the power of the matrix Q. The Algorithm 1 may require ```N``` to be 40-50 for the convergence property to be effective, and for the Algorithm 2, ```N``` would be around 10. By looking at how fast or slow these two algorithms converge, we can predict their efficiency.

### What to Turn in: (All typed and printed)

### Cover page (page 1): 

Your name, assignment number, assignment title, and due date.

### One page abstract (page 2): 

Describe the problem (description is given above), then explain the two algorithms (do not get in to implementation details), finally explain your observations and the results of the algorithms. Make sure to check spelling and grammar. The abstract should be typed in Times New Roman style font with single spacing and the font size of 12.

### Printed Source Program(s): 

Turn in Java source codes for both algorithms. All programs should be properly indented and commented.

### Printed Outputs: 

Partial outputs of the first 5 Q matrices and the last 5 Q matrices for both algorithms. Do not print all 50 of them. All outputs should be properly labeled.
