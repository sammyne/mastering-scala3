# call-cmake

Example calling library written by C and built with CMake.

## Environment
- sammyne/scala:2.12.15-jdk8-ubuntu20.04

## Quickstart

```bash
sbt core/run
```

Succeed with logs as 

```bash
Hello, World!
457
```

## Head Ups

- The [Canonical Use](https://github.com/sbt/sbt-jni#canonical-use) is broken for 
  - sbt@1.6.2
  - scala@2.12.15
  - cmake@1.16.3

## Reference
- [Scala and Rust interoperability via JNI](https://engineering.avast.io/scala-and-rust-interoperability-via-jni/)
