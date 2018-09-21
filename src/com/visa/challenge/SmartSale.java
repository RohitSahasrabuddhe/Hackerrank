package com.visa.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SmartSale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(3);
		int m = 3;
		
		int solution = deleteProducts(list, m);
		
		System.out.println(solution);
	}

	
	public static int deleteProducts(List<Integer> items, int m) {
		int count = 0 ;
		
		LinkedList<Node> list = new LinkedList<Node>();
		
		list = listCreator(items);
		
		
		System.out.println("\nBefore Sorting");
		printList(list);
		
		Collections.sort(list, new Comparator<Node>() {
		    @Override
		    public int compare(Node n1, Node n2) {
		        return n1.count - n2.count;
		    }
		});
		
		System.out.println("\nAfter Sorting");
		printList(list);
		
		count = list.size();
		for(int i = 0 ; i < list.size() ; i++) {
			if(list.get(i).count < m) {
				m = m - list.get(i).count;
				count--;
			}
		}		
		return count;
	}
	
	public static void printList(LinkedList<Node> list) {
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
	}
	
	public static LinkedList<Node> listCreator(List<Integer> items){
		LinkedList<Node> list = new LinkedList<Node>();
		
		Node n = new Node(items.get(0));
		list.add(n);
		
		for(int i = 1 ; i < items.size(); i++) {
			if(itemIdExists(list,items.get(i))) {
				//do nothing count is already added
			}
			else {
				Node n1 = new Node(items.get(i));
				list.add(n1);
			}
			
		}		
		return list;
	}
	
	public static boolean itemIdExists(LinkedList<Node> list , int id) {
		
		for(int i = 0 ; i < list.size() ; i++) {
			if(list.get(i).id == id) {
				list.get(i).count++;
				return true;
			}
		}
		return false;
	}
}

class Node{
	int id;
	int count;
	
	Node(int id){
		this.id = id;
		this.count = 1;
	}
	
	private void increaseCount() {
		this.count++;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + " : " + this.count;
	}
}
