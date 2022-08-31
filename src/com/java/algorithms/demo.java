package com.java.algorithms;
import java.util.*;
import java.util.Map.*;
public class demo {
    public static void main(String[] args) {

        
        demo d=new demo();
        String dost[][]={{"A","B"},{"C"},{"B","C"},{"D"}};
        int friends[][] = {{1,2},{0,3},{0,3},{1,2}};
        List<List<String>> watchedVideos = new ArrayList<>();
        for(String a[]:dost){
            watchedVideos.add(Arrays.asList(a));
        }
        int id = 1, level = 1;
        List<String> ls=d.watchedVideosByFriends(watchedVideos,friends,id,level);
        for(String a:ls)
            System.out.print(a+" ");
    }
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {


        int n=friends.length;

        Map<String,Integer> map=bfs(friends,id,n,level,watchedVideos);
        return movies(sortMap(map));

    }
    public Map<String,Integer> bfs(int graph[][],int id,int n,int level,List<List<String>> watchedVideos){

        boolean vis[]=new boolean[n];
        vis[id]=true;
        Queue<Integer> q=new LinkedList<>();
        Map<String,Integer> map=new TreeMap<>();
        q.add(id);
        while(q.size()!=0){

            int node=q.poll();
            for(int i:graph[node]){

                if(!vis[i]){

                    vis[i]=true;
                    if(level<=1){
                        for(String str:watchedVideos.get(i))
                            map.put(str,map.getOrDefault(str,0)+1);
                    }
                    else
                        q.add(i);
                }
            }
            level--;
        }
        return map;
    }
    public List<String> movies(Map<String,Integer> map){

        List<String> temp=new ArrayList<>();
        for(Map.Entry<String,Integer> mp:map.entrySet()){

            System.out.println(mp.getKey()+" "+mp.getValue());
            temp.add(mp.getKey());
        }
        return temp;
    }
    public Map<String,Integer> sortMap(Map<String,Integer> map){

        List<Entry<String,Integer>> temp= new LinkedList<>(map.entrySet());

        Collections.sort(temp,(l1,l2)->l1.getValue()-l2.getValue());
        Map<String,Integer> result=new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : temp) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;

    }
}
