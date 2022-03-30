package submit04.model;

public class MemberVO {
	private String memId;
	private String memName;
	private String memPw;
	
	public MemberVO() {
		
	}
	
	
	public MemberVO(String memId, String memName, String memPw) {
		this.memId = memId;
		this.memName = memName;
		this.memPw = memPw;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "MemberVO [memId=" + memId + ", memName=" + memName + ", memPw=" + memPw + "]";
	}
	
	
	
	
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getMemPw() {
		return memPw;
	}
	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}
	
}
