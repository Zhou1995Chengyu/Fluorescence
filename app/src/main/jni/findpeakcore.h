#ifndef __FINDPEAKCORE_H__
#define __FINDPEAKCORE_H__
#include <math.h>
#include <stddef.h>
#include <stdlib.h>

#define NumPoint 600
extern void findpeakcore(double N, const double *x, double *difx, double *heightl, double *heightr, double *newheightl, double *newheightr, double *areal, double *arear, double *newareal, double *newarear);
#endif
