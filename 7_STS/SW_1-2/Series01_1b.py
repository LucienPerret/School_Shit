import matplotlib.pyplot as plt
import numpy as np

xpoints = np.array([0,1,2,3,4,5,6])
absolutepoints = np.array([83,25,28,18,12,10,2])
ypoints = np.array([])
i = 0
for integer in absolutepoints:
    ypoints[i]=absolutepoints[i]
    i = i + 1

plt.stem(xpoints, ypoints)
plt.show()
