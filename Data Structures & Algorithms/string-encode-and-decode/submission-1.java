class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length());
            sb.append("#");
            sb.append(str);

        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;
        while(i < str.length()){
            int start = i;
            while(str.charAt(i) != '#' )
                i++;
            int len = Integer.parseInt( str.substring(start, i));
            i++;

            String s = str.substring(i, i+len );
            result.add(s);

            i = i+len;
        }
        return result;
    }
}
