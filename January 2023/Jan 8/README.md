![image](https://user-images.githubusercontent.com/58635762/211203658-ccf3fa41-3898-4bb0-ab53-021cc6a75a94.png)

In this example, three interesting lines contain the point (4,1)(4, 1)(4,1) – the first line contains the points (4,1)(4, 1)(4,1) and (5,3)(5, 3)(5,3), the second one contains (4,1)(4, 1)(4,1), (3,2)(3, 2)(3,2), (2,3)(2, 3)(2,3) and (1,4)(1, 4)(1,4) and the third one contains (4,1)(4, 1)(4,1) and (1,1)(1, 1)(1,1). The angles between the X axis and the vectors from (4,1)(4, 1)(4,1) to the points (3,2)(3, 2)(3,2), (2,3)(2, 3)(2,3) and (1,4)(1, 4)(1,4) are equal (denoted with the green arc in the picture). In other words, all these vectors have the same atan2. 

the function atan2 is the 2-argument arctangent. By definition, {\displaystyle \theta =\operatorname {atan2} (y,x)}{\displaystyle \theta =\operatorname {atan2} (y,x)} is the angle measure (in radians, with {\displaystyle -\pi <\theta \leq \pi }{\displaystyle -\pi <\theta \leq \pi }) between the positive {\displaystyle x}x-axis and the ray from the origin to the point {\displaystyle (x,\,y)}{\displaystyle (x,\,y)} in the Cartesian plane. Equivalently, {\displaystyle \operatorname {atan2} (y,x)}{\displaystyle \operatorname {atan2} (y,x)} is the argument (also called phase or angle) of the complex number {\displaystyle x+iy.}{\displaystyle x+iy.}

cnt.merge(Math.atan2(points[j][1] - points[i][1],
                    	points[j][0] - points[i][0]), 1, Integer::sum);
