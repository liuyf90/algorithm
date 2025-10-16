1. 填函数风格
	方法名，参数都给出，只要填函数逻辑即可。
	不能修改类名、方法名、参数类型
	可以修改参数名称
	```
	public int sumOfSubMatrix(int[][] mat, int n){
		//write code here
	}
	```
2. acm 风格（笔试、比赛最常见）
		ACM 风格的算法编程比赛要求选手以标准输入输出方式处理数据，输入严格按照题目描述的格式读取，通常涉及多组测试用例；输出也需完全匹配题目的格式要求，包括对空格和换行的精确处理，确保程序遵循格式以避免错误，使选手专注于算法实现。
	1. 规定数据量（BufferedReader、Streamtokenizer、PrintWriter)，其他语言有对等的写法
	2. 按行读（BufferedReader、PrintWriter),其他语言有对等的写法
	3. 不要用 Scanner、System.out, IO效率慢
```
//把文件里的内容，Load 进来，保存在内存里，很高效，很经济，托管很好。
BufferedReader br=new BufferedReader(new InputStreamReader(system.in)) 
//一个一个读数字
StreamTokenizer in = new StreamTokenizer(br)

while(in.nextToken!=StreamTokenizer.TT_EOF)//文件没有结束就继续{
   //n,二维数组的行
   int n= (int)in.nval
   in.nexttoken()
   //m,二维数组的列
   int m=(int)in.nval


}
```
	
4. 不推荐：临时动态空间
5. 推荐：全局静态空间
	一般题目会给范围，直接构造空间
	```
	public static in[][]mat=new int[MaxN][MAXM]
	```