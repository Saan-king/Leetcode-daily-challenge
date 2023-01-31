## 787. Cheapest Flights Within K Stops <br/>
There are n cities connected by some number of flights. You are given an array flights where flights[i] = [fromi, toi, pricei] indicates that there is a flight from city fromi to city toi with cost pricei.

You are also given three integers src, dst, and k, return the cheapest price from src to dst with at most k stops. If there is no such route, return -1.

### Example 1:

![image](https://user-images.githubusercontent.com/58635762/214841724-b645f981-2320-439c-b8de-f938c06ca966.png)

Input: n = 4, flights = [[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]], src = 0, dst = 3, k = 1 <br />
Output: 700<br />
Explanation:
The graph is shown above.
The optimal path with at most 1 stop from city 0 to 3 is marked in red and has cost 100 + 600 = 700.
Note that the path through cities [0,1,2,3] is cheaper but is invalid because it uses 2 stops.

### Example 2:

![image](https://user-images.githubusercontent.com/58635762/214841693-621695ad-3bb8-4b13-969e-007b22f9676a.png)

Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 1 <br />
Output: 200 <br />
Explanation:
The graph is shown above.
The optimal path with at most 1 stop from city 0 to 2 is marked in red and has cost 100 + 100 = 200.

### Example 3:

![image](https://user-images.githubusercontent.com/58635762/214841655-3b44b2c8-a6c4-428c-b27d-7460b17706c0.png)


Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 0 <br />
Output: 500 <br />
Explanation:
The graph is shown above.
The optimal path with no stops from city 0 to 2 is marked in red and has cost 500.
