bool isSubsequence(char * s, char * t){
    while (*t)
        s += *s == *t++;
    return !*s;
}