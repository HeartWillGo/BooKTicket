package com.example.book_ticket2;


public class Candidate_ArrayList {

	private Candidate[] array; // ������������
	private int size = 0; // ����size���ԣ����ó�ʼֵΪ0

	/********* ���췽�� *************/
	public Candidate_ArrayList() {
		array = new Candidate[0]; // ��ʼ��
	}

	public Candidate_ArrayList(int size) {
		array = new Candidate[size];
	}
	

	/*
	 * ��������������Ԫ�أ�add()
	 */
	public void add(Candidate element) {
		// ����һ���µ�����
		Candidate[] newArray = new Candidate[size + 1];
		for (int i = 0; i < size; i++) {
			newArray[i] = array[i]; // ��ֵ

		}
		newArray[size] = element;// ���Ԫ�����������һλ
		size++; // ���ȼ�һ
		array = newArray;// ��newArray�ĵ�ַ��array

	}
	/*
	 * ������е�ɾ��������ɾ��ָ��������Ԫ��
	 */
	public Candidate delete(int index){
		if(index<0||index>=size){
			return null;
			
		}
		Candidate temp=array[index];//��Ҫɾ����Ԫ�ظ�����ʱ����temp
		Candidate[] newArray=new Candidate[size-1];
		
		for(int i=0;i<index;i++){
			newArray[i] =array[i];
		}
		for(int i=index;i<size-1;i++){
			array[i]=array[i+1];
			newArray[i]=array[i];
			
		}
		array=newArray;
		size--;
		return temp;
	}
	/*
	 * ������������Ԫ��
	 */
	public Candidate insert(int index,Candidate element){
		Candidate[] newArray=new Candidate[size+1];
		for(int i=0;i<index;i++){
			newArray[i]=array[i];
		}
		newArray[index] =element;
		for(int i=index;i<size;i++){
			newArray[i+1]=array[i];
		}
		array=newArray;
		size++;
		return element;
	}
	
	/*
	 * ��ȡ������еĳ���
	 */
	public int size(){
		return size;
	}
	public Candidate get(int index){
		if(index<0||index>=size){
			return null;
		}
		else 
			return (Candidate) array[index];
	}
	public Candidate find(Candidate obj){
		for(int i=0;i<size;i++){
			if(array[i].equals(obj)){
				return array[i];
			}
			
		}
		  
			return null;
	}
	
	/*
	 * �޸�ָ��������Ԫ��
	 * 
	 */
	public void  modify(Candidate element,int index){
		array[index]=element;
	}
 


}
