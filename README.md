# address-parser

[http://www.juso.go.kr/addrlink/addressBuildDevNew.do?menu=rdnm](http://www.juso.go.kr/addrlink/addressBuildDevNew.do?menu=rdnm)  
위 링크에서 txt 기반 DB 다운로드 가능

주소 데이터 추출을 위해 코드 작성  

전체 DB 다운로드 후에 프로젝트 루트경로에 jibun 폴더를 만들어 'jibun_' 로 시작하는 txt 파일들만 담아 실행  
(용량상의 문제로 db 파일은 커밋하지 않음)  

참고로 DB 데이터 파일은 EUC-KR 로 작성되어 있음  

## 실행 예시
```bash
addressList.size()::192
부산광역시 중구 중앙동7가
부산광역시 중구 동광동1가
부산광역시 중구 중앙동6가
부산광역시 중구 중앙동2가
부산광역시 중구 중앙동5가
부산광역시 중구 중앙동4가
부산광역시 중구 대창동1가
부산광역시 중구 대창동2가
부산광역시 중구 부평동2가
부산광역시 중구 부평동3가

<!-- ... 중략 ... -->

울산광역시 울주군 온양읍
울산광역시 울주군 온산읍
total::5002
```
