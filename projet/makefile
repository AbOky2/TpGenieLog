all : main.o function.o
		gcc main.o function.o -o example

main.o : main.c
		gcc -c main.c -o main.o

function.o : function.c
		gcc -c function.c -o function.o


clean : 
		rm -rf *.o example