public class Tree {
    private int root;
    private Tree[] subtrees;

    public Tree(int root, Tree[] subtrees) {
        //Initialize a new Tree with the given root value and subtrees.
        this.root = root;
        this.subtrees = subtrees;
    }

    public boolean isEmpty(){
        return (root == 0);
    }

    public int treeLength(){
        if (this.isEmpty()){
            return 0;
        }
        else{
            int size = 1;
            for (Tree subtree: subtrees){
                size += subtree.treeLength();
            }
            return size;
        }
    }

    public int count(int item){
        if (this.treeLength() == 0){
            return 0;
        }

        else{
            int num = 0;
            if (root == item){
                num += 1;
            }
            for (Tree subtree : subtrees) {
                num += subtree.count(item);
            }
            return num;
        }
    }

    public String treeStrIndented(int depth){
        if (this.isEmpty()){
            return "";
        }

        else{
            // Spaces for depth
            String s = " ".repeat(depth) + this.root + "\n";
            for (Tree subtree: subtrees){
                s += subtree.treeStrIndented(depth + 1);
            }
            return s;
        }
    }

    public String treeStr(){
        return this.treeStrIndented(0);
    }

    /*
    public float average(){
        if (this.isEmpty()){
            return 0.0;
        }
        else{

        }
    }

    public
    */

}
