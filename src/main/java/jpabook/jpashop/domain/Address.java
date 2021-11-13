package jpabook.jpashop.domain;

import javax.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter // 값 타입은 변경 불가능하게 설계해야함, @Setter를 제거하고 생성자에서 값을 모두 초기화해서 변경 불가능한 클래스를 만들자.
public class Address {

  private String city;
  private String street;
  private String zipcode;

  protected Address() { //임베디드 타입은 자바 기본 생성자를 public 또는 protected로 설정해야함

  }

  public Address(String city, String street, String zipcode) {
    this.city = city;
    this.street = street;
    this.zipcode = zipcode;
  }
}
