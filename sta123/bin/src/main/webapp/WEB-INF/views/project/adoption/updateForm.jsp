<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
  <div class="container">
    <div class = "text-center"><h1>입양 공고 수정 화면</h1></div>
    <form action="/update" method="post" id="f_updateForm">
    	<input type="hidden" name="adoptionNumber" value="${updateData.adoptionId }" id="adoptionId">
    	<input type="hidden" name="adoptionFile" name="adoptionFile" value="${updateData.adoptionFile }"/>
      		<div class ="text-center">
      		<table class="table table-striped">
      			<thead>
        		<tr>
          			<td class="col-3">공고 번호</td>
          			<td class="col-3">${updateData.adoptionId }<span>(조회수: ${updateData.adoptionCnt })</span></td>
          			<th >작성일</th>
          			<td >${updateData.adoptionDate }</td>
        		</tr>
        		</thead>
        		<tbody>
        		<tr>
        			<td colspan="4">
        			<table class="table mb-0">
		        <tr>
		          	<td class="col-3">공고 제목</td>
		          	<td class="text-start">
		          	<input type="text" value="${updateData.adoptionTitle }" class="form-control" id="adoptionTitle"
                        name="adoptionTitle" placeholder="제목을 입력하세요."
                        data-type="CDATA"> 
                    </td>
		        </tr>
		         <tr>
		          	<th>공고 내용</th>
		          	<td class="text-start">
		            <textarea name="animalContent" id="animalContent"  class="form-control">${updateData.animalContent }</textarea>
		          	</td>
		        </tr>
		        <tr>
		          	<th class="col-md-1">공고 상태</th>
		          	<td class="text-start">
		          		<select name="animalStatus" id="animalStatus" value="${updateData.animalStatus }" class="form-control">
		          			<option>1.공고 중</option>
		          			<option>2.상담 중</option>
		          			<option>3.입양 완료</option>
		          		</select>
		          	</td>
		        </tr>
		        <tr>
		          	<th>비밀번호</th>
		          	<td class="text-start">
		          	<input type="password" name="adoptionPasswd" id="adoptionPasswd"
		          	class="form-control" placeholder="기존의 비밀번호가 아니라 수정할 비밀번호를 입력해 주세요"></td>
		      	
		        </tr>
		        <tr>
		          	<th>이미지 파일첨부</th>
		          	<td class="text-start">
		          		<input type="file" name="file" id="file"class="form-control">
		          	</td>
		        </tr>
		      </table>
		   </td>
		   </tr>
		</tbody>
		</table>
		</div>
    </form>
    <div class="text-end">
    	<button type="button" id="animalUpdateBtn" class="btn btn-success btn-sm">수정</button>
    	<button type="button" id="animalCancelBtn" class="btn btn-success btn-sm">취소</button>
    	<button type="button" id="animalListBtn" class="btn btn-success btn-sm">목록</button>
    </div>
  </div>
  <script src="/resources/include/js/adoptionUpdateForm.js"></script>
</body>
</html>