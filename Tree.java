import java.util.*;

public class Tree {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    //递归前序遍历s
    public static void pre(TreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.val);
        pre(node.left);
        pre(node.right);
    }
    //非递归前序遍历
    public static List<TreeNode> nonpre(TreeNode root){
        List<TreeNode> list=new ArrayList<TreeNode>();
        Stack stack=new Stack();
        if (root == null){
            return list;
        }
        stack.push(root);
        while(!stack.isEmpty()){
           Tree.TreeNode node=(TreeNode)stack.pop();
           if (node!=null){
               list.add(node);
               stack.push(node.right);
               stack.push(node.left);
           }
        }
        return list;
    }
//递归中序遍历
//    public static void middle(Tree.TreeNode node){
//        if(node==null){
//            return;
//        }
//        middle(node.left);
//        System.out.print(node.val);
//        middle(node.right);
//    }
    //非递归中序遍历
public List<Integer> nonMiddle(TreeNode root){
        List<Integer> list=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack();
       Tree.TreeNode cur=root;
       while(cur!=null || !stack.isEmpty()){
           while(cur!=null){
               stack.push(cur);
               cur=cur.left;
           }
           cur = stack.pop();
           list.add(cur.val);
           cur=cur.right;
       }

     return list;
}

    //递归后序遍历
    public static void middle(TreeNode node){
        if(node==null){
            return;
        }
        middle(node.left);
        middle(node.right);
        System.out.print(node.val);
    }
    //非递归后序遍历
    public  static List<Integer> nonafter(TreeNode root){
        List<Integer>  list=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode tempnode=stack.pop();
            while(tempnode!=null){
                list.add(tempnode.val);
                stack.push(tempnode.left);
                stack.push(tempnode.right);

            }


        }


        Collections.reverse(list);
        return list;
    }
    //层次遍历
//    public static void levelTrav(TreeNode root) {
//        if (root == null)
//            return;
//        Queue<TreeNode> q = new LinkedList<TrTreeNode>();
//        q.add(root);
//        TreeNode cur;
//        while (!q.isEmpty()) {
//            cur = q.peek();
//            System.out.print(cur.val + " ");
//            if (cur.left != null)
//                q.add(cur.left);
//            if (cur.right != null)
//                q.add(cur.right);
//            q.poll();
//        }
//    }
}
