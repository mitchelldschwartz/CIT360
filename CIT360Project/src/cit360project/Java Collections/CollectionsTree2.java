public class CollectionsTree2<T> implements Iterable<TreeRoot<T>> {

    T data;
    TreeRoot<T> parent;
    List<TreeRoot<T>> children;

    public TreeRoot(T data) {
        this.data = data;
        this.children = new LinkedList<TreeRoot<T>>();
    }

    public TreeRoot<T> addChild(T child) {
        TreeRoot<T> childNode = new TreeRoot<T>(child);
        childNode.parent = this;
        this.children.add(childNode);
        return childNode;
    }
}

TreeRoot<String> root = new TreeRoot<String>("root");
{
    TreeRoot<String> node0 = root.addChild("node0");
    TreeRoot<String> node1 = root.addChild("node1");
    TreeRoot<String> node2 = root.addChild("node2");
    {
        TreeRoot<String> node20 = node2.addChild(null);
        TreeRoot<String> node21 = node2.addChild("node21");
        {
            TreeRoot<String> node210 = node20.addChild("node210");
        }
    }
}