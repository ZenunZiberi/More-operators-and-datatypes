package MoreDatatypesAndOperators;

public class Queue {

		int q[];
		int putloc, getloc;
		
		Queue (int size){
			this.q=new int[size];
			this.putloc=this.getloc=0;
		}
		
		void put(int ch){
			if(this.putloc==q.length){
				System.out.println("-Q is full");
				return;
			}
			q[this.putloc++]=ch;
		}
		int get(){
			if(this.getloc==this.putloc){
				System.out.println("- queue is empty");
				
				return 0;
			}
			return q[this.getloc++];
		}
}
