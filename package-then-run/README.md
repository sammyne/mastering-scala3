# package-then-run

## Quickstart

```bash
docker run -it --rm -v $PWD:/hello -w /hello sammyne/scala:2.12.15-jdk8-ubuntu20.04 bash

# within container
sbt assembly

java -jar target/scala-2.12/hello-world-assembly-1.0.jar
```
