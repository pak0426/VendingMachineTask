<img width="547" alt="image" src="https://github.com/user-attachments/assets/5d031652-671b-4e96-973b-9d07aa2a1cf6">

- 결제 수단 선택
  - 현금, 카드
- 상품 주문 요청
    - 콜라, 물, 커피
- 결제 요청
    - 결제 승인
        - 카드: 결제 승인 로그 반환
        - 현금: 거스름돈과 결제 승인 로그 반환
    - 결제 실패
        - 결제 실패 로그(잔액 부족) 반환
- 결과에 대한 로그 출력