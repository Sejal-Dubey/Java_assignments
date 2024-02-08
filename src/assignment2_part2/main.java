package assignment2_part2;

public class main {
    public static void main(String[] args) {
        input userInput = new input(); 
        int[] array = userInput.inputData(); 

        int index = shortest_neighbor_distance.findneighbors(array);
        
        if (index != -1) {
            System.out.println("The two neighboring numbers with the smallest distance are :" + array[index]+"and"+array[(index+1)] );
        } else {
            System.out.println("The array has less than two elements.");
        }

    }

}
