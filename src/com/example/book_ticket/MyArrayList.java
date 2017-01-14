package com.example.book_ticket;

public class MyArrayList {
	private Message[] array; // ������������
	private int size = 0; // ����size���ԣ����ó�ʼֵΪ0

	/********* ���췽�� *************/
	public MyArrayList() {
		array = new Message[0]; // ��ʼ��
	}

	public MyArrayList(int size) {
		array = new Message[size];
	}
	

	/*
	 * ��������������Ԫ�أ�add()
	 */
	public void add(Message element) {
		// ����һ���µ�����
		Message[] newArray = new Message[size + 1];
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
	public Message delete(int index){
		if(index<0||index>=size){
			return null;
			
		}
		Message temp=array[index];//��Ҫɾ����Ԫ�ظ�����ʱ����temp
		Message[] newArray=new Message[size-1];
		
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
	public Message insert(int index,Message element){
		Message[] newArray=new Message[size+1];
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
	public Message get(int index){
		if(index<0||index>=size){
			return null;
		}
		else 
			return (Message) array[index];
	}
	public Message find(Message obj){
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
	public void  modify(Message element,int index){
		array[index]=element;
	}
 

}
