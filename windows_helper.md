It's clear that @[fcarsten](https://github.com/fcarsten) wrote codes in eclipse(can be seen from the .gitignore) and in linux(command `dot`,`agd_server`), after I tried to run in my desktop(win10_x64_intellij), I encounter some problems can be common:

## General [can be applied to all platforms] and should be OK with new `pom.xml` with Java8.

1.Error `Exception in thread "main" java.util.MissingResourceException: Can't find bundle for base name org.carsten.jjgraph.graph.Messages, locale**`:

`pom.xml` should make some change to applay to include `properties` into the classpath,to be specific,add these files in `<build>:<resources>`.This issue show up when I tried to run the `Main` and `App`,since eclipse and intellij treat `properties` a little different(one in the `.classpath` and one in `.idea/resourceBundles.xml`),so we can specify them in the `pom.xml`.

2.Since we use `java3d` libraries,maybe it's nice to invole them into the `pom.xml`(`j3d-core`,`j3d-core-utils`,`vecmath`) too.

## Platfom specific(Windows 10 x64 here)

3.Error like `Couldn't find agd server:java.io.IOException: Cannot run program "agd_server": CreateProcess error=2,**`

Just ignore it,if really want full function,change to linux should be better ^.^

4.Error like `Couldn't link 3D library` in windows.

Anyhow, We should `install` Java3d(If we want to use the `Tools->View 3D`).
[www.java3d.org/tutorial.html](http://www.java3d.org/tutorial.html) and [www.ntu.edu.sg/home/ehchua/programming/opengl/Java3D.html](https://www.ntu.edu.sg/home/ehchua/programming/opengl/Java3D.html) can be some help.Escepilly the latter one,we should download and install java3d first.(I thought just add jars through `pom.xml` is enough,well,too yong too simple -.-).

And in `toos->View 3D`,`Stereo vision not supported by hardware` can happen,this is because we didn't make the extra configuration,in `Java 3D 1.5.1 Release Notes`(can be seen after install) metioned that in windows OpenGl and DirectX can be used to enhance performace,we do not care it here.

For learnning java3d,[Java3D_2012](https://github.com/webkanin/Java3D_2012) seems like a good reference.

5.Some of the program require other libraries,and of course,they are not so friendly to windows.

* `dot`,is one of [`graphviz`](http://www.graphviz.org/) program,can be easily`apt-get install` in linux.
* `agd_server` should be of [`LEDA`](http://www.algorithmic-solutions.com/index.htm), which seems a high quality company, but their code is not free ~.~(free edition is available but not so efficient).