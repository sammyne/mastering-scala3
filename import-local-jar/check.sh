#!/bin/bash

cd $(dirname $0)

workdir=$PWD
libdir=$workdir/lib

rm -rf $libdir
mkdir $libdir

cd $workdir/../pack-as-jar

artifact=target/scala-3.1.1/pack-as-jar_3-0.1.0.jar
if [[ ! -f $artifact ]]; then
  sbt package
fi

cp $artifact $libdir

cd $workdir

sbt run

rm -rf $libdir
