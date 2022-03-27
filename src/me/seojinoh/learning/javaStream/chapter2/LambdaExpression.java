package me.seojinoh.learning.javaStream.chapter2;

import java.lang.FunctionalInterface;

public class LambdaExpression {

	public static void main(String[] args) {
		// Stream 연산과 람다식의 관계
		// 1. Stream 연산은 매개변수로 함수형 인터페이스를 받고, 람다식은 함수형 인터페이스를 반환한다.

		// 람다식이란?
		// 1. 함수를 하나의 식(expression)으로 표현한 메서드 이름이 필요 없는 익명 함수(Anonymous Function)의 한 종류이다.
		// 2. 익명 함수는 일급 객체이므로, 변수처럼 사용 가능하여 매개변수로 전달할 수 있다.

		// 람다식 특징
		// 1. 람다식 내의 지역변수는 final이 붙지 않아도 상수로 간주된다.
		// 2. 람다식으로 선언된 변수명은 다른 변수명과 중복될 수 없다.

		// 람다식 장점
		// 1. 코드가 간결해지며, 개발자의 의도가 분명해 가독성이 높아진다.
		// 2. 함수를 작성하는 과정이 없어 생산성이 높아진다.
		// 3. 병렬 프로그래밍에 용이하다.

		// 람다식 단점
		// 1. 람다 무명 함수는 재사용이 불가능하다.
		// 2. 디버깅이 어렵다.
		// 3. 남용하면 비슷한 함수가 중복되어 되려 코드가 지저분해진다.
		// 4. 재귀에 부적합하다.

		// 람다식 사용 전
		beforeUsingLambdaExpression();

		// 람다식 사용 후
		afterUsingLambdaExpression();
	}

	public static void beforeUsingLambdaExpression() {
		System.out.println("람다식 사용 전");

		HelloWorld helloWorld = new HelloWorld();
		System.out.println(helloWorld.hello());
	}

	public static void afterUsingLambdaExpression() {
		System.out.println("람다식 사용 후");

		HelloLambda helloLambda = () -> "Hello, World!";
		System.out.println(helloLambda.hello());
	}

}

class HelloWorld {
	String hello() {
		return "Hello, World!";
	}
}

@FunctionalInterface
interface HelloLambda {
	String hello();
}
