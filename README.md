
# About Project
### E-commerce 온라인 쇼핑몰 웹 구축  
개인 프로젝트 / 풀스택 ( Angular & Java SpringBoot)
### 사용된 기술 ( 언어, 프레임워크, 툴)  
프론트: <img src="https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=Angular&logoColor=yellow">,, <img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=yellow">,<img src="https://img.shields.io/badge/css-006600?style=for-the-badge&logo=css&logoColor=black">, <img src="https://img.shields.io/badge/html5-000000?style=for-the-badge&logo=html5&logoColor=black">    
백엔드: <img src="https://img.shields.io/badge/JAVA-007396?style=for-the-badge&logo=JAVA&logoColor=black">, <img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=for-the-badge&logo=SpringBoot&logoColor=black"> ( using <img src="https://img.shields.io/badge/RESTapis-CC2927?style=for-the-badge&logo=RESTapis&logoColor=red"> and <img src="https://img.shields.io/badge/MySQL-CC2927?style=for-the-badge&logo=MySQL&logoColor=red"> )  
개발툴: IntelliJ, VScode, Maven, npm, git

### backend link: 
https://github.com/triptocode/e-commerce-portfolio-backend
### frontend link: 
https://github.com/triptocode/e-commerce-portfolio-front.git
### 블로그 - 상세기능 및 코드 설명
https://utopian-dresser-30e.notion.site/E-Commerce-Website-Angular-Java-Spring-Boot-09b4f47cb59e4a51b1e76aef782e6d5a


### 중요기능 상세설명 링크 ( 각 기능 구현 과정 및 자세한 설명은 각 링크 참조 ): 
1. 메뉴카테고리 :  하드코딩없이 Rest API 활용, category id로 동적 호출하여 표현  
https://www.notion.so/id-Rest-API-5acc33e877cf49629527d1347a8b6686
2. 상품 메인화면구현 : product-box로 상품정보를 묶고, 앵귤러반복문(ngFor)활용해 상품 모두출력
   각 카테고리에 해당하는 상품 route설정  
https://www.notion.so/product-box-ngFor-route-0379d7e88bfc42e5914b3e2da29b8739
3. 상품 검색창 구현: Spring Data REST 와 Spring Data JPA에서 제공하는 쿼리 메서드 findBy 활용   
https://www.notion.so/findBy-9e459a69166d4a83abd16a3010853fdf
4. 쇼핑카트 기능 구현 1 :  상품추가버튼 클릭시 상단의 쇼핑카트에 가격, 수량 반영되도록 한다.   
https://www.notion.so/1-562a7da393de4d11b52f75d662799712
5. 쇼핑카트 기능 구현 2 :  쇼핑카트에 담긴 상품의 수량 증감, 삭제 기능구현   
https://www.notion.so/2-5012efa38d894a5fab872d58b6b06ad8


# 주용기능 몇가지 요약화면 

## 쇼핑카트 
  
  ![1상품추가버튼클릭시 쇼핑카트변화](https://user-images.githubusercontent.com/84559988/148550331-89292e34-9670-4114-883d-00cd06d986db.gif)
  
  ![image](https://user-images.githubusercontent.com/84559988/148550285-6f2ec58a-f4f5-462c-a52c-bab8b0b7d17f.png)

  ![2 쇼핑카트담긴 상품 증감삭제](https://user-images.githubusercontent.com/84559988/148549226-5226eae7-c9c9-4c44-98cf-7d23324d7373.gif)  
   Add to cart 버튼클릭시 addToCart 메서드 실행하는 button 기능 구현  
   ![image](https://user-images.githubusercontent.com/84559988/148550116-1f06942c-f1c1-4c7b-9b96-5aa09dc92db4.png)

   handler 메서드 클릭시, ProductListComponent가 업데이트 되도록 한다.   
   ![image](https://user-images.githubusercontent.com/84559988/148550170-f3a6d830-fef0-466a-bc8a-afdc6dec6641.png)

 
## 카테고리 메뉴  - rest api, 카테고리 id 로 동적 구현 
![image](https://user-images.githubusercontent.com/84559988/148550497-54755c59-fb84-4cba-8398-dcb21c63babd.png)  
![image](https://user-images.githubusercontent.com/84559988/148550553-f0410bd9-30d9-4768-add7-96282d5113a0.png)


## 상품 검색창 기능구현   
- pring Data REST 와 Spring Data JPA는 쿼리 methods findBy 활용한 백엔드 코딩

![image](https://user-images.githubusercontent.com/84559988/148551273-a46882c1-cfac-4517-a403-639788d67dbf.png)


**/findByNameContaining?name=키워드  (입력하면 관련 제품이 검색되어 출력된다. )**

아래 백엔드코드 구현 : url에 findby키워드로 Beginner. Python 등을 입력하면 키워드와 관련된 제품 결과 출력
예:  /findByNameContaining?name=Beginner

![image](https://user-images.githubusercontent.com/84559988/148551539-5b92a3c0-e0ba-4eae-b1e3-05c2948c82ac.png)

![image](https://user-images.githubusercontent.com/84559988/148551893-165bc905-83fb-4f49-a96c-e606754bfdbd.png)




블로그 - 이커머스 웹 프로젝트 각 기능별 화면, 코드 설명 정리목록   
[https://www.notion.so/E-Commerce-Website-Angular-Java-Spring-Boot-09b4f47cb59e4a51b1e76aef782e6d5a](https://utopian-dresser-30e.notion.site/E-Commerce-Website-Angular-Java-Spring-Boot-09b4f47cb59e4a51b1e76aef782e6d5a)
  


 ##########################################  감사합니다 ######################################



  
  
