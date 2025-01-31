# University of Maryland High School Programming Competition (HSPC) 2019
Repository of problems and their full solutions from the 2019 UMD High School Programming Competition ([website](http://www.cs.umd.edu/Outreach/hsContest19/), [final scoreboard](http://contest.cs.umd.edu/hscontest/summary.html)).  

## `/docs`
* 2019-problem-writeup.pdf: a whitepaper describing each of eight competition problems, along with input/output format and some sample input/output.
* 2019-solutions.pptx/pdf: high-level solutions for the problems; full Java implementations can be found in `/src` below.
* 2019-introduction.pptx: intro presentation given to students before the practice round.


## `/src`
This is a single Eclipse project containing eight packages, one per problem used in the main competition.  Note that the actual Java files used in the competition were slightly modified (to remove the leading package statement at the header of each Java file).  The files are otherwise unchanged.  To run each problem, either:

* Run the Java file as-is in Eclipse, and feed in a file or manual input via STDIN; or
* Compile with `javac ProblemName.java` and then run with `java ProblemName < Input.in` from the command line (this is more in line with how the competition tested solutions).

Problems contain both the test skeleton (`ProblemName.java`) given to teams and a solution (`ProblemName_solution.java`) created by one of the competition judges.  Caveat emptor on the solutions.

## `/tests`
Secret test inputs and matching outputs that were run through PC2 during the actual competition.  We note that a few problems were graded mostly manually - specifically PX, PX, and PX, due to some issues with diffing their outputs.

## Acknowledgments

Problem Creators, Solution Fixers, and Judges:

* [John P Dickerson](http://jpdickerson.com/)
* [Tom Goldstein](https://www.cs.umd.edu/~tomg/)
* [Evan Golub](http://www.cs.umd.edu/~egolub/professional.shtml)

Motivation for some of the Problems and Solutions:

* [LeetCode](https://leetcode.com/)
* [Goutham Vidya Pradhan](https://github.com/gouthampradhan)
* [Project Euler](https://projecteuler.net)
