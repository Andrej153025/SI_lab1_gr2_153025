class Student {
	String index;
	String firstName;
	String lastName;
	int[] grades;

	public Student(String index, String firstName, String lastName, int[] grades) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;

		public String getIndex() {
			return index;
		}

		public void setIndex(String index) {
			this.index = index;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int[] getGrades() {
			return grades;
		}

		public void setGrades(int[] grades) {
			grades = grades;
		}

		public double getAverage() {
			int a=0;
			for (int p: grades) {
				a+=p;
			}

			return a/grades.length;
		}

		public int ECTSCredits() {
			int pom = 0;
			if (grades.length > 6)
			{
				pom++
			}
			pom*6;
			return pom;
		}
}












