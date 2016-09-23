package chap8;

public class Lesson {
	private int year;
	private int month;
	private int day;
	public Lesson(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	String getZodiac(){
		String eto = "申";
		String[] Zodiac = {"申" , "酉" , "戌" , "亥" ,	"子" , "丑" , "寅" , "卯" , "辰" , "巳" , "午" , "未"};

		year %= 12;

		eto = Zodiac[year];

		return eto;
	}

	String getConstellation(){
		String Constellation = "牡羊";

		if((month == 4 && 20 <= day) || (month == 5 && day <= 20)){
			Constellation = "牡牛";
			}else if((month  == 5 && 21 <= day) || (month == 6 && day <= 21)){
				Constellation = "双子";
			}else if((month  == 6 && 22 <= day) || (month == 7 && day <= 22)){
				Constellation = "蟹";
			}else if((month  == 7 && 23 <= day) || (month == 8 && day <= 22)){
				Constellation = "獅子";
			}else if((month  == 8 && 23 <= day) || (month == 9 && day <= 22)){
				Constellation = "乙女";
			}else if((month  == 9 && 23 <= day) || (month == 10 && day <= 23)){
				Constellation = "天秤";
			}else if((month == 10 && 24 <= day) || (month == 11 && day <= 22)){
				Constellation = "蠍";
			}else if((month == 11 && 23 <= day) || (month == 12 && day <= 21)){
				Constellation = "射手";
			}else if((month == 12 && 22 <= day) || (month == 1 && day <= 19)){
				Constellation = "山羊";
			}else if((month  == 1 && 20 <= day) || (month == 2 && day <= 18)){
				Constellation = "水瓶";
			}else if((month  == 2 && 19 <= day) || (month == 3 && day <= 20)){
				Constellation = "魚";
			}

		return Constellation;
	}
}
