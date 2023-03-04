    public static String balancedSums(List<Integer> arr) {
    // Write your code here
String result = "NO";
int sum = 0;
int left = 0;
for(int asd: arr){
    sum+=asd;
}
   
for(int i=0;i<arr.size();i++){
    int current = arr.get(i);
    sum-=current;
    if(left == sum){
        result = "YES";
        break;
    }
    left+=current;
} 
    
    
    return result;
    }
