#include <iostream>
int main ()
{
    int ans,count=0; 
    //std::cout << " Enter a number :";
    std::cin >>ans;
  std::cout<<ans<<"\n";
  if(ans>1){
    while ( ans != 1 ){
        if ( ans % 2 == 1){
            ans = (3 * ans) + 1;
            count++;
        }
        else{
            ans /= 2;
            count++;
        }
    std::cout << ans << "\n";
     } 
     std::cout<<count;
   }
  else
 std::cout<<"0"<<"\n";
    return 0;
}