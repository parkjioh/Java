# Java
###### 문제 풀면서 헷갈리는 것들
- static 관련 (public static ... ? )
- Classroom에서 findbyid를 static으로 했을 경우에 (import로 불러서 바로 사용 가능했으니까 그렇게 했었음 ) => Optional<Student>로 바꿧을 때 오류가 생김
- 있을수도 없을수도 있다는 조거늘 걸었으니... 하하? 
- Optional일 땐 setter 사용 못하나/?
+ 조건에 setScore하라는 것 없엇고, 점수 수정 메서드를 사용하라고 해서 updateScore ->를 점수수정 메서드로 처리 해야함 -> Optional 고려 일단 배제 ... 
- 약간 어느 파일에 어떤 걸 둬야할까에 관한 문제 
- new는 새로운 객체를 할당하는 것 -> 험 .
- getStudents()는 students 필드 자체를 그대로 돌려주지 않습니다.
  밖에서 강의실 안의 목록을 직접 비우거나 삭제하지 못하게 새 목록으로 감싸서 돌려줍니다. 이말도 헷갈렸음  ㅠㅠ 