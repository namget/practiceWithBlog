package com.example.myapplication.dagger


/**
 *
 * #######Inject########
 * @Inject 키워드를 통해 외부 클래스를 주입함
 *
 *
 * 예를들면
 *
 * * #example
 * class RegistrationViewModel @Inject constructor(val userManager: UserManager)
 *
 * 이런식으로 RegistrationViewModel을 주입가능하다는 것을 명시
 *
 * #example
 * class UserManager @Inject constructor(private val storage: Storage)
 * 이렇게 UserManager를 주입한다.
 * 여기서 Storage는 Interface 이므로 후에 대거의 동작법을 배운후 왜 주입하지 않아도 되는지 확인
 *
 * 위를 통해 주입한 RegstrationViewModel은
 *
 * #example
 * @Inject
 * lateinit var registrationViewModel: RegistrationViewModel
 * 이런형태의 키워드를 통해 주입이 가능하다.
 *
 *
 * #######Component#########
 * @Componet 키워드
 * interface 에 Component Annotation을 통해 생성하면 Dagger가 자체적으로 기본적 DI가 되는 Container를 생성한다.
 * 여기서 생성된 컴포넌트의 인터페이스는 컴파일 타임에서 필요한 정보를 대거에게 준다.
 *
 * #example
 *  // Definition of a Dagger component
 * @Component
 * interface AppComponent {
 * // Classes that can be injected by this Component
 * fun inject(activity: RegistrationActivity)
 *  }
 *
 */

class DaggerTest {


}