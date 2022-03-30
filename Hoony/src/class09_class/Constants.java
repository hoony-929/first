package class09_class;

/*
 * 사전(Dictionary) 느낌으로 프로젝트에서 사용될 상수들을
 * 모아놓은 클래스
 */
public class Constants {
	
	public static final String welcome_cafe = "어서오세요. 카페 %s입니다. 주문히주세요\n";
	
	public static final int TYPE_WATER = 1;
	public static final int TYPE_FIRE = 2;
	public static final int TYPE_THUNDER = 3;
	public static final int TYPE_PLANT = 4;
	
	public static String typeToString(int type) {
		if(type == TYPE_WATER) return "물";
		if(type == TYPE_FIRE) return "불";
		if(type == TYPE_PLANT) return "풀";
		if(type == TYPE_THUNDER) return "전기";
		
		return "알 수 없음";
	}
	
	
}
