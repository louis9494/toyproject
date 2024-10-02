package com.project.dto;

import java.util.Objects;
import java.util.Set;

public class Gundam { // 건담(건프라)를 만드는 일종의 가상 회사에서 모든 종류의 건담공장에서 제조된 을 보기 쉽게 정리한 문서
	
	// 필드
	private String name; // 장난감 이름
	private int scale; // 사용 가능 연령
	private int price; // 가격
	private String type; // 타입
	
	/*타입 설명
	 * 1) B- club  
	 * 반다이의 레진 킷 전용 브랜드.
	 * 건프라 컨버전 킷 뿐만 아니라, 풀 레진 킷, 피규어 또한 담당한다. 옵션파츠인 무장이나 핸드파츠등도 판매를 했었다.
	 * 정식 건프라 발매로 인해 특유의 프로포션과 디테일 등이 마음에 들어서 구매하는게 아닌 이상 꼭 구매할 필요가 없는 
	 * 킷들은 취소선 처리.
	 * 현재는 기존에 나온 킷에서 신규 부품을 추가하여 나오는 프리미엄 반다이 웹한정이 활발하게 출시되면서,
	 * 신규 킷들의 발매로 구매할 필요가 없는 것이 많아졌고, 더 이상의 신규 라인업도 출시하지 않는 것으로 보인다.
	 * 
	 * 2) CGS 모빌워커
	 * 기동전사 건담 철혈의 오펀스에 등장하는 모빌워커로, 
	 * 동력원으로는 내연기관인 수소 엔진을 사용하며 희귀한 모빌슈트와 달리 각 세력에 많이 배치되어 있는 기동병기이다.
	 * CGS가 보유하고 있는 것은 모빌워커 중에서도 구식으로 무장, 성능이 크게 떨어지지만 작중 언급을 보면 맷집은 오히려
	 * 신형기인 걀라르호른 모빌워커를 상회하는건지 대응방어가 더 잘 되는 편인 듯 하다.
	 * 
	 * 탑재하고 있는 무장은 기본적으로는 30mm 머신건이지만 8연장 미사일 런처를 장비하거나 유탄발사기를 장비한 사양도 일부
	 * 존재하며 1화에서 보여준 모의전에서는 페인트탄을 사용했다. 이러한 무장들 이외에도 콕핏 양사이드에 연막탄발사기도 장비가능.
	 * 
	 * 주행용 바퀴를 장비한 지상형 외에도, 우주공간에서 운용하기 위해 바퀴 대신 스러스터를 장비한 우주형도 존재한다. 우주형 역시 탑재한
	 * 무장은 지상형과 동일한 스펙이다.
	 * 
	 * 복좌형 구조를 갖추고 있어 2명의 승무원을 탑승시킬 수 있지만, 기본저긍로는 전방 콕핏에 탑승하는 1명의 승무원만으로도 충분한 것 같으며
	 * 후방석에는 반드시 승무원을 태울 필요가 없는 것 같다.
	 * 
	 * 작중의 모습을 보면 지휘관용 정도만이 복좌기로 운용되고 나머지는 그냥 단좌기로 운용되는 듯 하다.
	 * 여담으로 형식번호의 'TK'는 디자이너인 테라오카 켄지 씨의 이니셜이다.
	 * 
	 * 3) EX 모델
	 * 
	 * 반다이 스피리츠의 건프라·프라모델 브랜드로, 건담 시리즈에 등장하는 서포트 비히클(탱크, 전투기, 차량), 우주선, 전함, 등이 상품화되었다.
	 * 
	 * 4) RE/100
	 * MG와 같은 사이즈의 1/100 스케일이면서, 세련된 파츠 설계로, 조립 용이성과 압도적인 박력을 양립하는 브랜드.
	 * 
	 * */
	private String manufactureDate; // 작품(시리즈)
	private Set<String> materials;  // 재료
	

	
	// 메서드
	public Gundam() {}

	public Gundam(String name, int scale, int price, String type, String manufactureDate, Set<String> materials) {
		super();
		this.name = name;
		this.scale = scale;
		this.price = price;
		this.type = type;
		this.manufactureDate = manufactureDate;
		this.materials = materials;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getscale() {
		return scale;
	}

	public void setscale(int scale) {
		this.scale = scale;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String gettype() {
		return type;
	}

	public void settype(String type) {
		this.type = type;
	}

	public String getmanufactureDate() {
		return manufactureDate;
	}

	public void setmanufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public Set<String> getMaterials() {
		return materials;
	}

	public void setMaterials(Set<String> materials) {
		this.materials = materials;
	}
	
	/** 아래 toString() 에서 재료명 표기 시 사용함
	 * materials 안에 있는 모든 재료를 문자열 형태로 만들어 반환하는 메서드
	 * @return
	 */
	public String getMaterialsAsString() {
		StringBuilder sb = new StringBuilder(); // 가변 문자열 객체(비동기)
		
		if(materials.size() == 0) {
			return "없음";
		}
		
		for(String material : materials) {
			sb.append(material).append(", "); // 문자열 뒤에 이어쓰기
		}
		

		sb.setLength(sb.length() - 2);
		
		return sb.toString();
		
	}


	@Override
	public String toString() {
		return String.format("이름 : %s / 가격 : %d / 기체 타입 : %s / 사용가능연령 : %d "
				+ "/ 제조년월일 : %s / 재료 : %s", 
				name, price, type, scale, manufactureDate, getMaterialsAsString()
				);
	}

	@Override
	public int hashCode() {
		return Objects.hash(scale, type, manufactureDate, materials, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gundam other = (Gundam) obj;
		return scale == other.scale && Objects.equals(type, other.type)
				&& Objects.equals(manufactureDate, other.manufactureDate) && Objects.equals(materials, other.materials)
				&& Objects.equals(name, other.name) && price == other.price;
	}
	
	
	
	
}