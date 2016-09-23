package chap10;

public class Day {
	private int year;
	private int month;
	private int date;
	
	

//	クラスメソッド
	public static boolean isLeap(int y){
		return y % 4 == 0 && y % 100 != 0 || y % 400 ==0;
	}

//	コンストラクタ
	public Day(){
		set(1 , 1 ,1);
	}

	public Day(int year) {
		set(year , 1 ,1);
	}

	public Day(int year, int month) {
		set(year , month , 1);
	}

	public Day(int year, int month, int date) {
		set(year , month , date);
	}

	public Day(Day d){
		set(d.year , d.month , d.date);
	}


	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public void set(int year , int month , int date){
		this.year  = year;
		this.month = month;
		this.date  = date;
	}

	public int dayOfWeek(){
		int y = year;
		int m = month;
		if( m == 1 || m == 2){
			y--;
			m +=12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	public static boolean compare( Day day1, Day day2) {
		boolean ret = true;
		if (day1.getYear() != day2.getYear() ||
				day1.getMonth() != day2.getMonth() ||
				day1.getDate() != day2.getDate()) {
			ret = false;
		}
		return ret;
	}


//	インスタンスメソッド
	public boolean isLeap(){
		return year % 4 == 0 && year % 100 != 0 || year % 400 ==0;
	}


	/**	日付dと等しいか	*/
	public boolean equalTo(Day d){
		return year == d.year && month == d.month && date == d.date;
	}

	/**	文字列表現を返却	*/
	public String toString(){
		String[] wd = {"日" , "月" , "火" , "水" , "木" , "金" , "土"};
		return String.format("%04d年%02d月%02d日(%s)", year , month , date , wd[dayOfWeek()]);

	}

}
