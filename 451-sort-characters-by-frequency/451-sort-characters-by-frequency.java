class Solution {
    public String frequencySort(String s) 
    {
        char ch[]=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:ch)
        {
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator<Character>()
                         {

            @Override
            public int compare(Character c1, Character c2) 
            {
                int comparison = map.get(c2).compareTo(map.get(c1));
                return comparison;
            }
            
        });
        
        String ans = "";
        for (int i = 0; i < list.size(); i++) {
            char c = list.get(i);
            for (int j = 0; j < map.get(c); j++) {
                ans+=c;
            }
        }
        return ans;
        
    }
}