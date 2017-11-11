LOCAL_PATH := $(call my-dir)
LOCAL_LDLIBS += -latomic
include $(CLEAR_VARS)
LOCAL_MODULE :=serialport
LOCAL_SRC_FILES :=prebuilt/libserialport.so

LOCAL_LDLIBS    += -lm -llog -ljnigraphics
LOCAL_MODULE := FLOURColloidalGold
LOCAL_SRC_FILES :=CD4Count.cpp fpeak.cpp findpeakcore.cpp rt_nonfinite.cpp rtGetInf.cpp rtGetNaN.cpp
include $(BUILD_SHARED_LIBRARY)