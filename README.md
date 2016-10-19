# jjgraph, a rather old graph drawing and algorithm library.

There are probably better ones out there these days, but it may contain some useful algorithms or approaches not covered anywhere else.

(c) Carsten Friedrich with contributions by Falk Schreiber, Francois Bertault, Damian Merrick, and others

# Update 20161018,[MiaoDX](https://github.com/MiaoDX)

## ![One screenshot of the software](pics/demo.png)
This pic is porduced by the software with `gml/dolphins.gml` and change the layout by `Cicular layout` and `Cicular layout + Orthogonal`.(Seems nice,right?)


A pretty good job,thanks a lot,there are lots of pretty good softwares just fade away because no one care.It's clear that @[fcarsten](https://github.com/fcarsten) wrote codes in eclipse(can be seen from the .gitignore) and in linux(command `dot`,`agd_server`),and after I tried to run in my desktop(win10_x64_intellij),I hope to improve this job a little:


## General[can be applied to all platforms]

1.Error `Exception in thread "main" java.util.MissingResourceException: Can't find bundle for base name org.carsten.jjgraph.graph.Messages, locale**`:


`pom.xml` should make some change to applay to include `properties` into the classpath,to be specific,add these files in `<build>:<resources>`.This issue show up when I tried to run the `Main` and `App`,since eclipse and intellij treat `properties` a little different(one in the `.classpath` and one in `.idea/resourceBundles.xml`),so we can specify them in the `pom.xml`.

2.Since we use `java3d` libraries,maybe it's nice to invole them into the `pom.xml`(`j3d-core`,`j3d-core-utils`,`vecmath`) too.


## Platfom specific(Windows 10 x64 here)

3.Error like `Couldn't find agd server:java.io.IOException: Cannot run program "agd_server": CreateProcess error=2,**`

Just ignore it,if really want full function,change to linux should be better ^.^

4.Error like `Couldn't link 3D library` in windows.

Anyhow,We should `install` Java3d(If we want to use the `Tools->View 3D`).
[www.java3d.org/tutorial.html](http://www.java3d.org/tutorial.html) and [www.ntu.edu.sg/home/ehchua/programming/opengl/Java3D.html](https://www.ntu.edu.sg/home/ehchua/programming/opengl/Java3D.html) can be some help.Escepilly the latter one,we should download and install java3d first.(I thought just add jars through `pom.xml` is enough,well,too yong too simple -.-).

And in `toos->View 3D`,`Stereo vision not supported by hardware` can happen,this is because we didn't make the extra configuration,in `Java 3D 1.5.1 Release Notes`(can be seen after install) metioned that in windows OpenGl and DirectX can be used to enhance performace,we do not care it here.

For learnning java3d,[Java3D_2012](https://github.com/webkanin/Java3D_2012) seems like a good reference.

5.Some of the program require other libraries,and of course,they are not so friendly to windows.

* `dot`,is one of [`graphviz`](http://www.graphviz.org/) program,can be easily`apt-get install`.
* `agd_server` should be of [`LEDA`](http://www.algorithmic-solutions.com/index.htm),which seems a high quality company,but their code is not free ~.~(free edition is avaliable but not so efficient).


## A little more

I upload some `.gml` files in dictionary `gml` to make a fast try,thanks [datamining1](http://blog.sciencenet.cn/blog-2358872-949978.html).

## Statement 

I(MiaoDX) look into this project because my visual analysis course teacher assign some papers to read,to be specific,I choose the shortest one,[The Metro Map Layout Problem](http://link.springer.com/chapter/10.1007%2F978-3-540-31843-9_50):
```
@inproceedings{hong2004metro,
  title={The metro map layout problem},
  author={Hong, Seok-Hee and Merrick, Damian and Do Nascimento, Hugo AD},
  booktitle={International Symposium on Graph Drawing},
  pages={482--491},
  year={2004},
  organization={Springer}
}
```

Since this is `a rather old graph drawing and algorithm library`,great chances are that I won't pay too much attention after the class(-.-).

SO Good Luck & Have Fun.