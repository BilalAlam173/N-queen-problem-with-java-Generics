N-queen-problem with java Generics
N-Queen problem solved efficiently using Java Generics, what generics do in the code is it allows us to design the chessboard with whatever datatype we want, for example a typical 4x4  chessboad using boolean will look like this 

[{false,false,false,false},
{false,false,false,false},
{false,false,false,false},
{false,false,false,false}]  

similarly using integer we can build a chessboard like this:  

[{0,0,0,0},
{0,0,0,0},
{0,0,0,0},
{0,0,0,0}] 

The code works for any custom type as well , we just have to define two values one for the square with queen placed e.g (true or 1) and one for without queen e.g (0 or false)
