public class App{
    
    public class Data{
        String OwnerName;
        String Address;
        long Mobile;
        long Phone;
        float Value;
        
        public void setOwnerName(String OwnerName){
            this.OwnerName = OwnerName;
        }
          public void setAddress(String Address){
            this.Address = Address;
        } 
        public void setMobile(long Mobile){
            this.Mobile = Mobile;
        } 
        public void setPhone(long Phone){
            this.Phone = Phone;
        }  
        public void setValue(float Value){
            this.Value = Value;
        }
        
        
        public String getOwnerName(){
            return this.OwnerName;
        }
        public String getAddress(){
            return this.Address;
        }
        public long getMobile(){
            return this.Mobile;
        }
        public long getPhone(){
            return this.Phone;
        }
        public float getValue(){
            return this.Value;
        }
    }
    
    public class Node{
        Date date;
        Data data = new Data();
        int NodeNumber;
        int NodeId;
        Node ReferenceNodeId;
        int ChildNodeId;
        Node ReferenceChildNodeId;
        
        
        public void createNode(int j, int setNumber, String OwnerName, String Address, long Mobile, long Phone, float Value){
            this.date = new Date.getCurrentDate();
            this.NodeNumber = setNumber;
            this.NodeId = j;
            this.ChildNodeId = j + 1;
            if(j==1)
            this.ReferenceNodeId = null;
            else
            this.ReferenceNodeId = j - 1;
            data.setOwnerName(OwnerName);
            data.setAddress(Address);
            data.setMobile(Mobile);
            data.setPhone(Phone);
            data.setValue(Value);
        }
        
        public void createMultiSet(int setNumber)
        {
            ArrayList<Node> set = new ArrayList();
            for(i=0 ; i<totalNodes ; i++){
                if(node[i].NodeNumber == setNumber)
                 set.add(node);
            }
        }
        
        public int LongestChainOfMainNode(int NodeNumber){
            return NodeId;
        }
    }

     public static void main(String []args){
         //create node
           Node node[totalNodes] = new Node();
           for(int i=0; i<totalNodes; i++)
          node[i].createNode(//pass all the required values through user input)
          //create multiset (here i is the node you want to create set for)
          node[i].createMultiSet(//pass setnumber of node you want to craete set for )
          //find chain of node
          int chain = node[i].LongestChainOfMainNode(//pass nodenumber)
          Sytem.out.println(chain);
     }
}
