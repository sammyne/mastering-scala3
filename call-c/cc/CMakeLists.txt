cmake_minimum_required(VERSION 3.16)

project(helloworld C)

find_package(Java 1.8 REQUIRED)
find_package(JNI REQUIRED)

add_custom_target(generate_header ALL
  COMMAND scalac ${CMAKE_CURRENT_SOURCE_DIR}/../src/main/scala/HelloWorld.scala
  BYPRODUCTS HelloWorld.h
  COMMAND javah HelloWorld
)

aux_source_directory(${CMAKE_CURRENT_SOURCE_DIR}/src srcs)

add_library(helloworld SHARED ${srcs})
add_dependencies(helloworld generate_header)
target_include_directories(helloworld
  PUBLIC ${CMAKE_CURRENT_BINARY_DIR}
  PUBLIC ${JNI_INCLUDE_DIRS})
