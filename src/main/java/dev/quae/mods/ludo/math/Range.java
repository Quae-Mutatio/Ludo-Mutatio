package dev.quae.mods.ludo.math;

public class Range{
	private final int begin;
	private final int end;
	
	public Range(int begin, int end){
		this.begin = begin;
		this.end = end;
	}
	
	public Range(int end){
		this(0, end);
	}
	
	public int getBegin(){
		return begin;
	}
	
	public int getEnd(){
		return end;
	}
}
