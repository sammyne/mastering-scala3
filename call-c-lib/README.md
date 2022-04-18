# call lib written in C

## Prerequisite

- OpenJDK 8
- Scala 2.12

## Quickstart

```bash
workdir=$PWD
cc_dir=$workdir/cc

cd $cc_dir

rm -rf build
cmake -B build
cmake --build build -j

lib=$cc_dir/build/libhelloworld.so

cd $workdir
sbt "run $lib"
```
