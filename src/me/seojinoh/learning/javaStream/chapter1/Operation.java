package me.seojinoh.learning.javaStream.chapter1;

import java.util.Arrays;
import java.util.List;

public class Operation {

	public static void main(String[] args) {
		// Stream API 3단계
		// 1. 생성: 배열, 컬렉션, 파일 등으로 Stream 객체를 생성하며, 연산 이후 Stream이 닫히기 때문에 재사용이 불가능하다.
		// 2. 가공: 데이터를 가공하기 위한 중간 연산을 수행하며, 중간 연산은 Stream을 반환하므로 필요한 중간 연산을 연결하여 사용할 수 있다.
		// 3. 결과: 가공된 데이터로 결과를 만드는 최종 연산을 수행하며, Stream을 소모하여 연산을 수행하므로 1번만 처리가 가능하다.
		
		// Stream 연산
		// 1. Stream 연산이 연결된 것을 연산 파이프라인이라고 한다.
		// 2. 최종 연산은 count()와 같이 값을 반환하는 연산과 forEach()와 같이 값을 반환하지 않는 연산이 있다.
		// 3. 매개변수로 함수형 인터페이스를 받는다.

		// Stream API 연산 예시
		runStreamApiExample();
	}

	public static void runStreamApiExample() {
		System.out.println("Stream API 연산 예시");

		List<String> nameList = Arrays.asList("KIM YUNA", "kim yu-na", "SON HEUNGMIN", "son heung-min");

		long count = nameList.stream()
			.map(String::toUpperCase)
			.filter(name -> name.startsWith("KIM"))
			.count();

		System.out.println("김씨의 수: " + count);
	}

}
