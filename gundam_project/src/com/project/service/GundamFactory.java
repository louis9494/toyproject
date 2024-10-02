package com.project.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.project.dto.Gundam;

public class GundamFactory {



	private Scanner sc = new Scanner(System.in);
	
	
	private Set<Gundam> gundamSet = new HashSet<Gundam>();
	
	
	private Map<Integer, String> materialMap = new HashMap<Integer, String>();


	public GundamFactory() { 
		// 기본 등록된 재료
		materialMap.put(1, "도색(모든재료 및 색상 포함)");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "강철");
		materialMap.put(4, "레진");

		// 현재 제작된 건프라


		gundamSet.add(new Gundam("MSV", 12, 3600, "B-Club", "19950805", addMaterials(1, 4)));
		gundamSet.add(new Gundam("MS 08소대", 5, 1200, "B-Club", "19940312", addMaterials(1, 2)));
		gundamSet.add(new Gundam("0080", 12, 1500, "B-Club", "19940505", addMaterials(1, 2)));
		gundamSet.add(new Gundam("0083", 15, 2700, "B-Club", "19960128", addMaterials(1, 2)));
		gundamSet.add(new Gundam("블루 데스티니", 12, 5700, "B-Club", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("크로스 디멘션", 12, 5700, "a", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("Z", 12, 5000, "B-Club", "19931225", addMaterials(1, 2, 3, 4)));
		gundamSet.add(new Gundam("ZZ", 12, 5500, "B-Club", "19931225", addMaterials(1, 2, 3, 4)));
		gundamSet.add(new Gundam("ZZ", 12, 5300, "B-Club", "19931225", addMaterials(1, 2, 3, 4)));
		gundamSet.add(new Gundam("역습의 샤아", 12, 6700, "B-Club", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("V", 12, 4300, "B-Club", "19931225", addMaterials(1, 2, 3, 4)));
		gundamSet.add(new Gundam("00", 12, 4500, "B-Club", "19931225", addMaterials(1, 2, 3, 4)));
		gundamSet.add(new Gundam("지상형 모빌워커", 12, 3500, "CGS 모빌워커", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("우주형 모빌워커", 12, 4000, "CGS 모빌워커", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("수송용 모빌워커", 12, 6000, "CGS 모빌워커", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("연방군용 건담 트레일러", 12, 3000, "a", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("도다이 II", 12, 3000, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("레이버 지휘차", 12, 3000, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("돕 파이터", 12, 3500, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("S 건담 어태커", 12, 3500, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("레드 테일", 12, 3500, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("제트 코어 부스터", 12, 3500, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("가르마 돕", 12, 1200, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("건페리", 12, 6500, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("슈퍼실프 유키카제", 12, 2800, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("전투용 로봇 탱크 익스톨레이버", 12, 2800, "a", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("메이브 유키카제", 12, 3200, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("모빌 쉽 알비온", 12, 3500, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("레이프", 12, 3500, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("아가마", 12, 3500, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("아크엔젤", 12, 4500, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("무사이", 12, 2800, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("이터널", 12, 3500, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("모빌아머 이그자스", 12, 3200, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("살라미스&마젤란", 12, 4500, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("메이브 유키카제 (잼 센스재머 사양)", 12, 3500, "a", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("그레이 실프", 12, 4500, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("미네르바", 12, 4000, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("팔켄", 12, 3500, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("마젤라 어택", 12, 3500, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("삼손 트레일러", 12, 3500, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("라비앙 로즈", 12, 6500, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("화이트 베이스", 12, 3500, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("코스모 제로", 12, 3500, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("블랙 타이거", 12, 3200, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("힐돌브", 12, 3500, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("구축 모빌포드 옥고", 12, 3500, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("코스모 타이거 II", 12, 5500, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("산카 마크 B (2기 세트)", 12, 3200, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("스카이리 J2", 12, 2800, "EX 모델", "19931225", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("Re/100", 12, 3500, "Re/100", "19931224", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("이프리트 改", 12, 3500, "Re/100", "19931224", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("짐 스나이퍼 II ", 12, 3500, "Re/100", "19931224", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("바잠", 12, 3500, "Re/100", "19931224", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("제간", 12, 3500, "Re/100", "19931224", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("크샤트리아", 12, 3500, "Re/100", "19931224", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("크시 건담", 12, 3500, "Re/100", "19931224", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("리그 콘티오", 12, 3500, "Re/100", "19931224", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("리오", 12, 3500, "Re/100", "19931224", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("가이아 건담", 12, 3500, "Re/100", "19931224", addMaterials(1, 2, 4)));
		gundamSet.add(new Gundam("리본즈 건담", 12, 3500, "Re/100", "19931224", addMaterials(1, 2, 4)));


	}

	/**
	 * 
	 * 
	 * 
	 * 
	 * @return
	 */
	public Set<String> addMaterials(Integer... materials /* List<Integer> materials */ /* int[] materials */) {

		// 매개변수로 전달받은 재료를 저장하여 반환할 Set객체를 생성
		Set<String> addedMaterials = new HashSet<String>();

		for (Integer meterialKey : materials) {

			// Map에서 재료 고유 번호(key)에 대응하는 재료명(value)을 가져와서
			// addedMaterials에 추가
			String materialValue = materialMap.get(meterialKey);



			if (materialValue != null) { // 재료 목록에 있을 때
				addedMaterials.add(materialValue);
			}

		}

		return addedMaterials;
	}

	
	public void displayMenu() {

		int menuNum = 0;

		do {
			System.out.println("\n<< 건프라(Gunpra) 공장 >>\n");
			System.out.println("1. 전체 건프라(Gunpra) 조회하기");
			System.out.println("2. 새로운 건프라(Gunpra) 만들기");
			System.out.println("3. 건프라(Gunpra) 삭제하기");
			System.out.println("4. 시리즈별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("5. 재료 추가");
			System.out.println("6. 재료 제거");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");

			try {

				menuNum = sc.nextInt();

				switch (menuNum) {
				case 1: displayAllgundams(); break;
				
				case 2: createNewgundam(); break;
				
				case 3: deletegundam(); break;
				
				case 4: displaygundamsBymanufactureDate(); break;
			
				case 5:
					addMaterial();
					break;
				case 6:
					removeMaterialByName();
					break;
				
				case 0:
					System.out.println("프로그램을 종료합니다");
					break;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요!");

				}

			} catch (Exception e) {
				System.out.println("알맞은 입력을 해라...(경고)..");
				e.printStackTrace();

				sc.nextLine(); // 입력 버퍼에 남은 잘못된 문자 비우기

				menuNum = -1;
				// 첫 반복에서 예외 발생 시 종료되지 않도록 menuNum 값을 임의의 값으로 세팅
			}

		} while (menuNum != 0);

	}
	
	/** 전체 장난감 조회하기
	 * 
	 */
	public void displayAllgundams() {
		System.out.println("<전체 장난감 목록>");
		
		int index = 1;
		for(Gundam gundam : gundamSet) {
			System.out.println(index + ". " + gundam);
			index++;
		}
	}
	
	
	/** 새로운 장난감 만들기
	 * 
	 */
	public void createNewgundam() throws Exception{
		System.out.println("<새로운 장난감 추가>");
		
		// 장난감 이름 입력받음
		// -> 이미 존재하는 장난감인지 이름으로 확인
		System.out.print("장난감 이름 : ");
		String name = sc.next();
		
		for(Gundam existinggundam : gundamSet) {
			
			if(existinggundam.getName().equals(name)) {
				System.out.println("이미 같은 이름을 가진 장난감이 존재합니다.");
				return;
			}
		}
		
		System.out.print("사용 가능 연령 : ");
		int scale = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("색상 : ");
		String type = sc.next();
		
		System.out.print("제조일 (YYYYMMDD 형식으로 입력) : ");
		String manufactureDate = sc.next();
		
		Set<String> materials = new HashSet<String>(); // 재료 저장할 Set 객체 생성
		
		System.out.println("사용 가능한 재료 목록");
		
		//System.out.println(materialMap.entrySet()); 
		// [1=면직물, 2=플라스틱, 3=유리, 4=고무]
		// Set <Entry<K, V> > Map.entrySet() : key=value 한 쌍으로 이루어진 Entry 객체를 
		// Set 객체로 반환
		
		// Entry.getKey() : Entry 객체의 key 반환
		// Entry.getValue() : Entry 객체의 value 반환
		for( Entry<Integer, String> entry  : materialMap.entrySet() ) {
			System.out.println( entry.getKey() + " : " + entry.getValue() );
			// 1 : 면직물
			// 2 : 플라스틱
			// 3 : 유리
			// 4 : 고무

		}
		
		while(true) {
			System.out.print("추가할 재료의 번호를 입력하세요 (종료하려면 'q'를 입력하세요) : ");
			
			try {
				String input = sc.next();
				
				if(input.equals("q")) { // 종료 시
					break;
				}
				
				// String 형인 input을 int형 정수값으로 변환(Integer Wrapper 클래스 이용)
				int materialKey = Integer.parseInt(input); // "1" -> 1
				String material = materialMap.get(materialKey); // "면직물"
				// 입력받은 재료고유번호(key)로
				// map에 저장된 재료명(value)를 얻어옴
				
				if(material != null) { // 재료명이  null 이 아니라면
					
					// materials Set객체에 해당 재료명이 존재하는지
					if(materials.contains(material)) {
						System.out.println("이미 추가된 재료입니다. 다른 재료를 선택하세요");
					
					} else { // Set에 중복된 재료가 없으면 새로 추가
						materials.add(material);
						System.out.println("재료가 추가되었습니다 : " + material);
					}
					
				} else { // 재료명이 null == 없는 재료고유번호를 입력했다는 의미
					System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				}
				
			} catch(NumberFormatException e) { // 재료번호 입력 시 숫자나 q 가 아닌 경우 예외처리 바로 함
				System.out.println("숫자를 입력하거나 q를 입력하세요.");
			}
			
		}
		
		Gundam newgundam = new Gundam(name, scale, price, type, manufactureDate, materials);
														// 추가할 재료 저장된 새로운 Set객체
		
		gundamSet.add(newgundam);
		System.out.println("새로운 장난감이 추가되었습니다!");
		
		
	}
	
	
	/** 장난감 삭제하기
	 * 
	 */
	public void deletegundam() throws Exception{
		System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
		String gundamName = sc.next();
		
		boolean flag = false;
		
		for(Gundam gundam : gundamSet) {
			
			if(gundam.getName().equals(gundamName)) {
				gundamSet.remove(gundam);
				// Set.remove(Object);
				flag = true;
				break; // java.util.ConcurrentModificationException
				// 1. 효율 향상을 위해 break;
				// 2. 순회중인 컬렉션 객체가 수정되어 충돌한다는 예외 발생
				// -> 예외 방지 및 효율을 위해서 작성
			}
			
		}
		
		if(flag) {
			System.out.println("장난감이 삭제되었습니다.");
		} else {
			System.out.println("해당하는 이름의 장난감을 찾을 수 없습니다.");
		}
		
	}
	
	
	/** 재료 추가하기
	 * @throws Exception
	 */
	public void addMaterial() throws Exception{
		
		System.out.println("<재료 추가>");
		System.out.println("---현재 등록된 재료---");
		
		for(Entry<Integer, String> entry : materialMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("-------------------------------------");
		
		System.out.print("재료 고유번호(Key) 입력 : ");
		int key = sc.nextInt();
		
		System.out.print("재료명 입력 : ");
		String material = sc.next();
		
		if(materialMap.containsKey(key)) { // materialMap에 이미 존재하는 Key 인지 확인 
			
			System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
			System.out.print("덮어쓰시겠습니까? (Y/N) : ");
			String input = sc.next();
			
			if(input.equalsIgnoreCase("Y")) {
				// equalsIgnoreCase : 대문자인지 소문자인지 구분하지 않고 문자열 값 자체만 비교
				materialMap.put(key, material); // 같은 key로 추가 시 value 덮어쓰기함
			} else {
				System.out.println("재료 추가가 취소되었습니다.");
			}
			
		} else {
			materialMap.put(key, material);
			System.out.println("새로운 재료가 성공적으로 등록되었습니다.");
		}
		
		
	}
	
	
	/** 재료명으로 재료 삭제하기
	 * @throws Exception
	 */
	public void removeMaterialByName() throws Exception{
		
		System.out.println("<재료 삭제>");
		System.out.println("---현재 등록된 재료---");
		
		for(Entry<Integer, String> entry : materialMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("-------------------------------------");
		
		System.out.print("삭제할 재료명 입력 : ");
		String materialName = sc.next();
		
		boolean flag = false;
		
		
		for(Entry<Integer, String> entry : materialMap.entrySet()) {
			
			if(entry.getValue().equals(materialName)) {
				materialMap.remove(entry.getKey());
				
				System.out.println("재료 '" +  materialName + "' 가 성공적으로 제거되었습니다.");
				flag = true;
				break;
			}
			
		}
		
		if(!flag) {
			System.out.println("해당 이름의 재료가 존재하지 않습니다.");
		}
		
		
		
	}
	
	
	
	/** 제조일자별로 장난감 조회하기
	 * 
	 */
	public void displaygundamsBymanufactureDate() {
		System.out.println("<제조일자 순으로 장난감을 조회하기>");
		
		List<Gundam> gundamList = new ArrayList<Gundam>(gundamSet);
		
		gundamList.sort(Comparator.comparing(Gundam::getmanufactureDate));
		
		int index = 1;
		for(Gundam gundam : gundamList) {
			System.out.println(index + ". " + gundam);
			index++;
		}
		
	}
	

	
}
	