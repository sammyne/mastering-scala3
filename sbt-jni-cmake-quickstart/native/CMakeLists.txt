cmake_minimum_required(VERSION 3.16)

project(helloworld C)

find_package(Java 1.8 REQUIRED)
find_package(JNI REQUIRED)

aux_source_directory(${CMAKE_CURRENT_SOURCE_DIR}/src srcs)

add_library(helloworld SHARED ${srcs})
target_include_directories(helloworld
  PUBLIC ${JNI_INCLUDE_DIRS})
install(TARGETS helloworld LIBRARY DESTINATION .)
