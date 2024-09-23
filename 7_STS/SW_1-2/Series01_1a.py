import matplotlib.pyplot as plt
import numpy as np

xpoints = np.array([0,1,2,3,4,5,6])
ypoints = np.array([83,25,28,18,12,10,2])

plt.stem(xpoints, ypoints)
plt.show()
