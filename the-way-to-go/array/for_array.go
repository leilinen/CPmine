package main 

import "fmt"
func main(){
	var arr [15]int
	for var i :=1; i<=15 i++{
		arr[i-1] = i
	}

	fmt.Println(arr)
}