def power(n:Int, k:Int):Int={
    if(k==0)1;
    else if(n==1)n;
    else n*power(n,k);
}

power(2,4);