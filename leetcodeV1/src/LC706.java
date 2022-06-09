import java.util.Arrays;

public class LC706 {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(22, 11);
        myHashMap.get(22);
        System.out.println(myHashMap.get(22));
        System.out.println(myHashMap.get(9));

    }
}

class MyHashMap {
    // private List<EachList> highList;
    EachList[] highList;

    public MyHashMap() {
        this.highList = new EachList[1000];
    }

    public void put(int key, int value) {
        int[] seperatedKey = seperate(key);
        if (highList[seperatedKey[0]] == null) {
            highList[seperatedKey[0]] = new EachList();
            highList[seperatedKey[0]].amount = 1;
        } else {
            if (highList[seperatedKey[0]].numbers[seperatedKey[1]] == -1) {
                highList[seperatedKey[0]].amount++;
            }
        }
        highList[seperatedKey[0]].numbers[seperatedKey[1]] = value;
    }

    public int get(int key) {
        int[] seperatedKey = seperate(key);
        EachList eachList = highList[seperatedKey[0]];
        if (eachList == null) {
            return -1;
        } else {
            if (eachList.amount == 0) {
                remove(-1);
            } else {
                if (eachList.numbers[seperatedKey[1]] == -1) {
                    return -1;
                } else {
                    return eachList.numbers[seperatedKey[1]];
                }
            }
        }
        return -1;
    }

    // 移除要置为-1
    public void remove(int key) {
        int [] seperatedKey = seperate(key);
        if(highList[seperatedKey[0]] != null){
            if(highList[seperatedKey[0]].amount > 0){
                if(highList[seperatedKey[0]].numbers[seperatedKey[1]] != -1){
                    highList[seperatedKey[0]].numbers[seperatedKey[1]] = -1;
                }
            }
        }
    }

    private int[] seperate(int key) {
        int[] seperatedKey = { key / 1000, key % 1000 };
        return seperatedKey;
    }
}

class EachList {
    int amount = 0;
    int[] numbers = new int[1000];

    public EachList() {
        Arrays.fill(numbers, -1);
    }
}