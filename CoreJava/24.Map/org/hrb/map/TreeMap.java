package org.hrb.map;

import java.util.HashMap;
import java.util.Map;

class MyCode implements Comparable<Code>{
	private String sectionNo;
	private String lectureNo;
	public MyCode(String sectionNo, String lectureNo) {
		super();
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}
	public String getSectionNo() {
		return sectionNo;
	}
	public String getLectureNo() {
		return lectureNo;
	}
	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}
	@Override
	public int compareTo(Code o) {
		String code1 = sectionNo.concat(lectureNo);
		String code2 = o.getSectionNo()+o.getLectureNo();
		return code1.compareTo(code2);
	}
	
}


public class TreeMap {
	
	public static void main(String[] args) {
		Map<MyCode,String> lectures = new HashMap<>();
		lectures.put(new MyCode("S01","L03"), "Generics");
		lectures.put(new MyCode("S01","L01"), "Files under Java");
		lectures.put(new MyCode("S02","L03"), "Network programming");
		lectures.put(new MyCode("S01","L07"), "OOPS");
		lectures.put(new MyCode("S01","L05"), "Methods");
		lectures.put(new MyCode("S01","L03"), "Expressions");
		
		for(Map.Entry<MyCode, String> entry: lectures.entrySet()){
		   System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}
 
	}

}
