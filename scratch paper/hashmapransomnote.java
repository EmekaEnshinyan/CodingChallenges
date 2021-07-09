
	public static boolean check(ArrayList<String> magazine, ArrayList<String> note) {
		HashMap<String, Integer> magWords = new HashMap<>();
		//loop through each word in magazine list, and place each word with its # of occurrences
		//as a key-value pair inside the HashMap magWords
		for (int i = 0; i < magazine.size(); i++){
			
			//the word to insert into the hashmap
			String word = magazine.get(i);
			System.out.println(word);
			//if the word is already inside of the hashmap, increment the value pair for this key
			//inside the hashmap, so that it's keeping track of the # of occurrences of this word inside
			//the magazine list
			if(magWords.containsKey(word)) {
				//retrieve the value for this word (key) inside the hashmap
				int currentEntriesForThisWord = magWords.get(word);
				//increment the value by 1
				currentEntriesForThisWord += 1;
				System.out.peintln(currentEntriesForThisWord);
				//update the key-value pair inside the hashmap
				//will overwrite the existing entry with the same key in the hashmap
				magWords.put(word, currentEntriesForThisWord);
			}
			//if the word is not inside the hashmap, insert it with a starting occurrence count of 1
			else {
				magWords.put(word, 1);
			}
		}
		
		//iterate through every word in the note list, and check if the word is in the magWords HashMap
		//if it is in the HashMap, then subtract it's occurrence count by 1 (removing it entirely if it hits 0)
		//if it is not in the HashMap, then return false
		for (int j = 0; j < note.size(); j++){
			//get the current word from the note list
			String noteWord = note.get(j);
			//find out if the current word from the note list is inside of the magWords HashMap
			boolean isInMap = magWords.containsKey(noteWord);
			
			//return false if it's ever detected that a word in the note list
			//doesn't have a match inside the magWords HashMap
			if(!isInMap) {
				return false;
			}
			//this note word is in the HashMap, subtract it's occurrence count by 1 (removing it entirely if it hits 0)
			else {
				int occurrences = magWords.get(noteWord);
				//if only 1 occurrence left, subtracting 1 will result in 0, remove from HashMap
				if(occurrences == 1) {
					magWords.remove(noteWord);
				}
				//if occurrence count is greater than 1, then subtract 1 from the occurrence count and overwrite the data
				//inside the magWords HashMap
				else {
					occurrences -= 1;
					magWords.remove(noteWord);
					magWords.put(noteWord, occurrences);
				}
			}
		}
		
		//if return false has not executed, then the test passed - return true
		return true;
	
	}
