package com.example.book_ticket2;

import com.example.book_ticket.User_msg;

public class User_ArrayList {

	private User_msg[] array; // ������������
	private int size = 0; // ����size���ԣ����ó�ʼֵΪ0

	/********* ���췽�� *************/
	public User_ArrayList() {
		array = new User_msg[0]; // ��ʼ��
	}

	public User_ArrayList(int size) {
		array = new User_msg[size];
	}
	

	/*
	 * ��������������Ԫ�أ�add()
	 */
	public void add(User_msg element) {
		// ����һ���µ�����
		User_msg[] newArray = new User_msg[size + 1];
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
	public User_msg delete(int index){
		if(index<0||index>=size){
			return null;
			
		}
		User_msg temp=array[index];//��Ҫɾ����Ԫ�ظ�����ʱ����temp
		User_msg[] newArray=new User_msg[size-1];
		
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
	public User_msg insert(int index,User_msg element){
		User_msg[] newArray=new User_msg[size+1];
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
	public User_msg get(int index){
		if(index<0||index>=size){
			return null;
		}
		else 
			return (User_msg) array[index];
	}
	public User_msg find(User_msg obj){
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
	public void  modify(User_msg element,int index){
		array[index]=element;
	}
 


}
