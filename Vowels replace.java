A group of people are playing a game based on vowels. If a person among them says a word or sentence others should tell the word immediately. Where while telling the word they just want to replace each vowel with the next immediate vowel lexicographical order i.e. 'a’ will be replaced by ‘e’, ‘e’ will be replaced by ‘i’, ‘i’ will be replaced by ‘o’, ‘o’ will be replaced by ‘u’, ‘u’ will be replaced by ‘a’. The person who says the word first with the mentioned changes is the winner of the game. Sonu is failing all the time. He is good in English but he couldn't do it properly for a lengthy sentence. Help him to win the game by writing a program implementing the same.

Input Format

Read a string

Constraints

string

Output Format

print output

Sample Input 0

I am a legend
Sample Output 0

I em e ligind
================================================================================
public class Solution {

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char ch[]=s1.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='a')
                ch[i]='e';
            else if(ch[i]=='e')
                ch[i]='i';
            else if(ch[i]=='i')
                ch[i]='o';
            else if(ch[i]=='o')
                ch[i]='u';
            else if(ch[i]=='u')
                ch[i]='a';
        }
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]);
        }
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
