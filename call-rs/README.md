# call lib written in Rust

## Prerequisite
- sammyne/scala:2.12.15-jdk8-rs1.60-ubuntu20.04

## Quickstart

```bash
cd $(dirname $0)

workdir=$PWD

cd $workdir/helloworld-rs
cargo build --release
cd $workdir

libpath=$workdir/helloworld-rs/target/debug/libhelloworld.so

sbt "run $libpath"
```

## Tips
### Check JNI header file
```bash
src=$PWD/src/main/scala/HelloWorld.scala

pkg=$(cat $src | grep package | awk '{print $2}')

scalac $src

javah -o _helloworld_HelloWorld.h helloworld.HelloWorld

rm -rf $pkg
```

The output header file is `_helloworld_HelloWorld.h`.

## References
- [crate jni](https://docs.rs/jni/0.19.0/jni/)
