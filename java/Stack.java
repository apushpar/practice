class Stack {

		int size;
		int[] arr;
		int min;

		Stack(){
			arr = new int[100];
			min = Integer.MAX_VALUE;
			size = 0;
		}

		void push(int val){
			arr[size] = val;
			size++;
		}

		int pop(){
			int returnVal = arr[size-1];
			size--;
			return returnVal;
		}

		int peek(){
			if (size == 0) {
				return -1;
			}
			return arr[size-1];

		}

		void newPush(int val){
			if (val < min) {
				this.push(min);
				this.push(val);
				min = val;
			}else {
				this.push(val);
			}

		}

		int newPop(){
			if (this.peek() == min) {
				int returnVal = this.pop();
				min = this.pop();
				return returnVal;
			}else{
				return this.pop();
			}
		}

		/*String toString(){

			String result = "[ ";
			for (int i=0;i<size ;i++ ) {
				result += arr[i];
			}
			result += " ]";
			return result;
		}*/
	}