package ua.artcode.algo.rec.dynamic;

/**
 * Created by serhii on 07.02.16.
 */
public class NodeUtils {


    public static Node addToHead(Node newNode, Node chainHead){
        return newNode.next = chainHead;
    }


    public static void addToTail(Node newNode, Node chainHead){
        if(chainHead.next == null){
            chainHead.next = newNode;
            return;
        }

        addToTail(newNode, chainHead.next);
    }

    public static String toString(Node chain){
        return chain != null ? chain.value + "->" + toString(chain.next) : "";
    }

    public static Node[] toArray(Node chain){
        if(chain == null){
            return new Node[]{};

        } else {
            Node[] ret = toArray(chain.next);
            Node[] res = new Node[ret.length + 1];
            res[0] = chain;
            System.arraycopy(ret, 0, res, 1, ret.length);
            return res;
        }
    }

    public static Node insertByIndex(int index, Node newNode, Node chain){

        if(index <= 0){
            newNode.next = chain;
            return newNode;
        }


        Node iter = chain;
        while(index != 1){
            iter = iter.next;
            index--;
        }

        newNode.next = iter.next;
        iter.next = newNode;

        return chain;
    }

    public static Node remove(int index, Node chain){
        return null;
    }

    // use equals method
    public static int indexOf(Object target, Node chain){
        if(chain == null){
            return -1;
        }

        if(chain.value.equals(target)){
            return 1;
        }

        int res = indexOf(target, chain.next);
        if(res != -1){
            return 1 + res;
        } else {
            return res;
        }

    }

    // 1,2,3,4,5 - 5,4,3,2,1
    // create new
    // use existed, one loop
    // advanced *
    public static Node reverse(Node chain){
        return null;
    }

}
