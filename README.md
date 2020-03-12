# java-blackjack
블랙잭 게임 미션 저장소

## 우아한테크코스 코드리뷰
* [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## 기능 요구사항
* 블랙잭 게임을 변형한 프로그램을 구현한다. 블랙잭 게임은 딜러와 플레이어 중 카드의 합이 21 또는 21에 가장 가까운 숫자를 가지는 쪽이 이기는 게임이다.

* 플레이어는 게임을 시작할 때 배팅 금액을 정해야 한다. 카드의 숫자 계산은 카드 숫자를 기본으로 하며,
 예외로 Ace는 1 또는 11로 계산할 수 있으며, King, Queen, Jack은 각각 10으로 계산한다.

* 게임을 시작하면 플레이어는 두 장의 카드를 지급 받으며, 두 장의 카드 숫자를 합쳐 21을 초과하지 않으면서 21에 가깝게 만들면 이긴다.
 21을 넘지 않을 경우 원한다면 얼마든지 카드를 계속 뽑을 수 있다. 단, 카드를 추가로 뽑아 21을 초과할 경우 배팅 금액을 모두 잃게 된다.

* 딜러는 처음에 받은 2장의 합계가 16이하이면 반드시 1장의 카드를 추가로 받아야 하고, 17점 이상이면 추가로 받을 수 없다.

* 게임을 완료한 후 각 플레이어별로 승패를 출력한다.

## 프로그래밍 요구사항
* 딜러와 플레이어에서 발생하는 중복 코드를 제거해야 한다.

## 구현할 기능목록
* [x] 카드를 만드는 기능

* [x] 게임에 참여할 플레이어의 이름을 입력받는다.(쉼표 기준으로 분리)
    * [x] **예외** 이름이 중복인 경우
    * [x] **예외** 이름이 공백인 경우
    * [x] **예외** 플레이어 수가 5명 초과인 경우

* [x] 딜러와 플레이어에게 카드를 2장씩 나누어준다.
    * [x] 받은 카드를 출력해주는 기능
        * [x] **예외** 딜러 카드 한 장은 hidden
        
* [x] 카드의 총 점수를 계산하는 기능 

* [x] 버스트인지 확인하는 기능

* [x] 블랙잭인지 확인하는 기능

* [x] ACE 유무 확인하는 기능

* [x] 플레이어 별로 카드를 더 받거나 안받는다.(예는 y, 아니오는 n)
    * [x] **에외** y나 n이 아닌 문자를 입력하는 경우

* [x] 받은 카드를 보여주는 기능

* [x] 딜러의 카드 합이 16이하면 계속 받는다.

* [x] 게임 점수를 알려준다

* [x] 게임 승패를 알려준다.