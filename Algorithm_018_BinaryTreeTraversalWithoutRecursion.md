 ### 1、用栈实现二叉树的先序遍历
弹出打印，先压右再压左
```
   if(head!=null){
	   stack= new Stack<>()
	   stack.push(head)
	   while(stack is not empty){
	      //弹出就打印
		   head=stack.pop()
		   print(head.val)
		   if(head.right != null){
				stack.push(head.right)		   
		   }
		   if(head.left !=null){
			   stack.push(head.left)
		   }
	   }
   }
```
 ### 2、用栈实现二叉树的中序遍历
	1. 子树的头，所有左边界进栈
	2. 栈弹出节点打印，节点右树重复 1.
	3. 没子树且栈是空的。
```
if(head!=null){
	Stack<TreeNode> stack=new Stack<>()
	while(stack is not empty or head is not null){
		if(head !=null){
			stack.push(head)
			head=head.left
		}else{
			head=stack.pop()
			print(head.val)
			head=head.right
		}
	}
}

```
	

### 3、用两个栈实现二叉树后序遍历，好写但是不推荐，因为需要收集所有节点，最后逆序弹出，额外空间复杂度为 O(n)

	先序遍历    中 左 右（先压右在压左）
	先序遍历改： 中 右 左（改变为先压左再压右）
	             ↕️ 反转
	后序遍历：   左 右 中 
  先序遍历的打印改成第二个栈压入。
```
     if(head!=null){
	   stack= new Stack<>()
	   collect= new Stack<>()
	   stack.push(head)
	   while(stack is not empty){
	      //弹出就打印
		   head=stack.pop()
		   //print(head.val)
		   collect.push(head)
		
		  //先左后右
		   if(head.left !=null){
			   stack.push(head.left)
		   }
		   
			if(head.right != null){
				stack.push(head.right)		   
		   }
	   }
   }
```

  
  

4、用一个栈实现二叉树后序遍历

	如果始终没有打印过的节点，h 就一直是头节点
	 一旦打印过节点,h就变成打印节点
	 之后 h 的含义：上一次打印的节点（标志）
```
 if(head is not null){
	 stack=new Stack();
	 stack.push(head);
	 while(stack is not empty){
		 TreeNode cur= stack.peek();
		 if(cur.left!=null and head!=cur.left and head!=cur.right){
		     //有左树，且左树没有处理过
		     stack.push(cur.left);
		 }else if(cur.right!=null and head!=cur.right){
		     //有右树，且右树没有处理过
		     stack.push(cur.right);
		 }else{
		 //左树、右树 没有或者都处理过了
		     System.out.print(cur.val+" ");
		     head=stack.pop(); 
		 }
	 }
 
 
 
 }
```





5、遍历二叉树复杂度分析：
	1. 时间复杂度 O(n), 递归和非递归都是每个节点遇到有限几次，当然 O(n)
	2. 额外空间复杂度O(h)树的高度, 递归和非递归都需要二叉树高度 h 的空间来保存路径，方便回到上级去
	3. 存在时间复杂度 O(n), 额外空间复杂度 O(1)的遍历方式：Morris 遍历
	4. Morris 遍历比较难，也比较冷门，会在【扩展中介绍】
