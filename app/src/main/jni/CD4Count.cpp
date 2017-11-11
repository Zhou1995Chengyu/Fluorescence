#include <jni.h>
#include "findpeakcore.h"
#include "fpeak.h"
#include <android/log.h>
#include <string.h>

#include <math.h>
#define   LOG_TAG    "LOG_TEST"
#define   LOGI(...)  __android_log_print(ANDROID_LOG_INFO,LOG_TAG,__VA_ARGS__)
#define   LOGE(...)  __android_log_print(ANDROID_LOG_ERROR,LOG_TAG,__VA_ARGS__)

#define N 200
/*
 const  float  xc[]= {	85.80,85.80,85.70,85.40,86.00,85.60,86.30,85.40,85.60,86.10,86.20,86.10,86.20,88.10,88.80,
 90.10,92.00,93.10,94.00,97.30,101.30,106.40,114.30,123.60,139.30,165.60, 196.80, 238.60, 303.20,370.90,
 454.80, 576.50,690.10,799.60,944.40,1058.70,1177.30,1299.00,1401.50,1488.70,1570.40,1671.10,1754.90,1851.00,1941.80,
 2002.80,2051.80,2089.50,2101.30,2097.30,2069.10,2022.20,1965.50,1877.40,1794.40,1699.90,1566.60,1450.20,1338.50,1207.00,
 1091.80,984.10,869.40,765.20,682.30,598.00,532.00,488.30,434.20,369.00,311.10,261.60,212.70,179.70,150.90,
 125.80,109.00,98.20,88.80,82.90,78.60,75.40,72.60,71.90,69.30,68.80,67.60,66.70,66.10,64.80,
 65.30,64.50,64.40,65.30,64.30,64.00, 63.30, 64.60, 64.00, 64.40,65.00,64.60, 64.90, 65.30,65.40,
 64.80,66.80,66.50,66.80,68.30,68.50,69.30,70.20,71.10,72.30,75.10,77.60,81.40,87.20,96.60,
 108.70,123.60,147.20,171.40,200.20,242.90,279.80,318.60,365.50,405.70,445.40,493.20,533.00,567.00,602.20,
 630.00,652.80,671.00,681.60,683.40,677.20,663.50,646.40,620.10,582.60,548.70,514.40,469.20,432.30,392.70,
 345.80,308.90,274.70,238.20,209.00,183.50,157.30,135.20,119.10,105.90,95.20,88.80,84.50,80.20,78.00,
 76.40,76.20,75.00,73.90,73.50,73.40,73.70,73.40,72.80,73.00,73.50,73.90,74.60,74.60,75.80,
 75.90,78.20,78.50,80.00,81.80,83.30,85.10,86.80,87.60,88.40,89.50,90.90,91.90,92.50,93.50,
 94.60,95.20,96.50,97.80, 98.20
 } ;*/

//double xi[200];
extern "C" {
struct {
	double my1;
	double my2;
} result;
JNIEXPORT jobject JNICALL Java_com_example_fragment_CheckFragment_CD4Count(
		JNIEnv* env, jobject obj, jobject disobj, jdoubleArray xi);
//jobject Java_com_example_chuankou_MyReceive_CD4Count(JNIEnv* env,jobject obj,jobject disobj,jdoubleArray xi);
JNIEXPORT jobject JNICALL Java_com_example_fragment_CheckFragment_CD4Count(
		JNIEnv* env, jobject obj, jobject disobj, jdoubleArray xi) {
	LOGI("woca");
	jdouble *cbuf;
	if (cbuf == NULL) {

	}
	LOGI("woca");

	//与java中 result类相关联
	//与java中 result类中字段对应；
	jclass objectclass = env->FindClass(
			"com/example/fragment/result");
	jfieldID HeightDiff = env->GetFieldID(objectclass, "HeightDiff", "D");
	jfieldID AreaDiff = env->GetFieldID(objectclass, "AreaDiff", "D");
	jfieldID Area1 = env->GetFieldID(objectclass, "Area1", "D");
	jfieldID Area2 = env->GetFieldID(objectclass, "Area2", "D");
	jfieldID Height1 = env->GetFieldID(objectclass, "Height1", "D");
	jfieldID Height2 = env->GetFieldID(objectclass, "Height2", "D");
	cbuf = env->GetDoubleArrayElements(xi, 0);
	LOGI("fff");
	double Height_Diff, Height_Same, Area_Diff, Area_Same;
	//int heightl,heightr,newheightl,newheightr;
	int j;
	double xi1[400];
	double difxi[N - 1];
	double heightl = 1, heightr = 2, newheightl = 3, newheightr, areal, arear,
			newareal, newarear;
	//float  x[N];
	//xi1=(double*)cbuf;
	for (j = 0; j < N; j++) {
		xi1[j] = cbuf[j]; //xi1[j]=xi[j]+(float)0.5;

	}
	LOGI("woca");
	double a = 85.8;
	if (a == xi1[1]) {
		LOGI("woca");
	}

	LOGI("HAHAHA");

	findpeakcore(N, xi1, difxi, &heightl, &heightr, &newheightl, &newheightr,
			&areal, &arear, &newareal, &newarear);
	LOGI("HAHAHA1");
	Height_Diff = heightl / heightr;
	Height_Same = newheightl / newheightr;
	Area_Diff = areal / arear;
	Area_Same = newareal / newarear;
	//return Height_Diff;
	if (heightl > 0)
		LOGI("HAHAHA2");
	env->SetDoubleField(disobj, HeightDiff, Height_Diff);
	env->SetDoubleField(disobj, AreaDiff, Area_Diff);
	env->SetDoubleField(disobj, Height1, heightl);
	env->SetDoubleField(disobj, Height2, heightr);
	env->SetDoubleField(disobj, Area1, areal);
	env->SetDoubleField(disobj, Area2, arear);
	return disobj;
}

}
