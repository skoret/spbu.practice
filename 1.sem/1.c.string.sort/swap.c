/* File c_swap.c */

#include "swap.h"

void swap(char** a, char** b)
 {
	 char* tmp = *a;
	 *a = *b;
	 *b = tmp;
 }
