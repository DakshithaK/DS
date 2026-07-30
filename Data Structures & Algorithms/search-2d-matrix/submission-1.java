class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS=matrix.length;
        int COLS= matrix[0].length;
        int l=0;
        int r=(ROWS * COLS)-1;
        while(l<=r){
            int mid= l+(r-l)/2;
            int rr=mid/COLS;
            int cc=mid%COLS;
            if(target>matrix[rr][cc]){
                l=mid+1;
            }
            else if(target<matrix[rr][cc]){
                r=mid-1;
            }
            else{
                return true;
            }
        }
        return false;
        
    }
}
