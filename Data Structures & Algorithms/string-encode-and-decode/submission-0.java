class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length());
            sb.append('#');
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int hashId = str.indexOf('#',i);
            int strLength = Integer.parseInt(str.substring(i,hashId));
            String decodedString = str.substring(hashId+1, hashId+1+strLength);
            result.add(decodedString);
            i = hashId + 1 + strLength;
        }
        return result;
    }
}
