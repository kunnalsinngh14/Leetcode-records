class Solution {
    public void swap(int[]nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> pos = new LinkedList<>();
        Queue<Integer> neg = new LinkedList<>();
        for(int n : nums){
            if(n>0){
                pos.offer(n);
            }
            else{
                neg.offer(n);
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(i%2==0){
                nums[i] = pos.poll();
            }
            else{
                nums[i] = neg.poll();
            }
        }
        // while(p<q && q<nums.length){
        //    if(p==0&&nums[p]>0){
        //     p++;
        //     q++;
        //    }
        //    else if(p==0 && nums[p]<0){
        //     if(nums[q]>0){
        //         swap(nums,p,q);
        //         p = q;
        //         p++;
        //         q = p;
        //         q++;
        //     }
        //     else{
        //         while(nums[q]<0){
        //             q++;
        //         }
        //         swap(nums,p,q);
        //         p++;
        //         q++;
        //     }
        //    }
           
            // if(p==0 && nums[p]>0){
            //     p++;
            //     q++;
            // }

            // else if(nums[p]<0 && nums[q]>0){
            //     swap(nums,p,q);
            //     p++;
            //     q++;
            // }
            // else if(nums[p]<0 && nums[q]<0){
            //     while(nums[q]>0){
            //         q++;
            //     }
            //     swap(nums,p,q);
            //     p++;
            //     q++;
            // }
            // else if(nums[p]>0 && nums[q]<0){
            //     p++;
            //     q++;
            // }
            // else{
            //     while(nums[q]>0){
            //         q++;
            //     }
            //     swap(nums,p,q);
            //     p++;
            //     q++;
            // }
        // }
        return nums;
    }
}