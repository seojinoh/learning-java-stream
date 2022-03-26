package me.seojinoh.learning.javaStream.chapter1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class introduction {

	public static void main(String[] args) {
		// Stream API 소개
		// 1. 객체지향 언어인 Java는 기본적으로 함수형 프로그래밍이 불가능하였으나, JDK8부터 Stream API, 람다식, 함수형 인터페이스 등으로 함수형 프로그래밍을 지원한다.
		// 2. Stream API는 데이터를 추상화하여, 데이터 종류에 상관없이 정의되어 있는 데이터 처리 함수를 사용할 수 있다.

		// Stream API 특징
		// 1. 원본 데이터로 Stream을 생성하면, 정렬, 필터링 등 처리는 별도의 Stream에서 이루어지기 때문에 원본 데이터는 변경되지 않는다.
		// 2. 일회용이므로, 한번 사용이 끝난 Stream을 재사용 시 IllegalStateException이 발생한다.
		// 3. 내장된 forEach() 함수로 반복 작업 처리가 가능하여, 코드가 간결해진다.

		// Stream API 사용 전
		beforeUsingStreamApi();

		// Stream API 사용 전
		afterUsingStreamApi();
	}

	public static void beforeUsingStreamApi() {
		System.out.println("Stream API 사용 전");

		String[] nameArray = {"Kim", "Lee", "Park", "Choi"};
		List<String> nameList = Arrays.asList(nameArray);

		Arrays.sort(nameArray);
		Collections.sort(nameList);

		for(String name : nameArray) {
			System.out.println(name);
		}

		for(String name : nameList) {
			System.out.println(name);
		}
	}

	public static void afterUsingStreamApi() {
		System.out.println("Stream API 사용 후");

		String[] nameArray = {"Kim", "Lee", "Park", "Choi"};
		List<String> nameList = Arrays.asList(nameArray);

		Stream<String> arrayStream = Arrays.stream(nameArray);
		Stream<String> listStream = nameList.stream();

		arrayStream.sorted().forEach(System.out::println);
		listStream.sorted().forEach(System.out::println);
	}

}
