package main 

// import "fmt"

var s1 int = 10
var s2 int = 20

func main(){
	println(mult_add(s1, s2))
	println(mult_diff(s1, s2))
	println(mult_acc(s1, s2))
}

func mult_add(s1 int, s2 int)(int){
	return s1 + s2
}

func mult_diff(s1 int, s2 int)(int){
	return s1 - s2
}

func mult_acc(s1 int, s2 int)(int){
	return s1 * s2
}
