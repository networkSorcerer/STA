<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
	<div class="container">
		<div class="text-center"><h3 class="mb-2">입양공고</h3></div>
			<div id="list">
					<c:choose>
						<c:when test="${not empty animalList }">
							<c:forEach var="animal" items="${animalList }" varStatus="status">
								<tr class = "text-center" data-num="${ animal.animalID}">
									<td>${animal.animalID }</td>
									<td class="goDetail text-start">
									${animal.boardTitle}
									<c:if test="${board.replyCnt > 0 }">
										<span class="reply_count">[${board.replyCnt}]</span>
									</c:if>
									</td>
									<td class="name">${board.boardName }</td>
									<td class="text-start">${board.boardDate }</td>
									<td class ="text-center">${board.readcnt }</td>
								</tr>
							</c:forEach>
						</c:when>
						<c:otherwise>
						<tr>
							<td colspan="5" class ="text-center">등록된 게시물이 존재하지 않습니다</td>
						</tr>
						</c:otherwise>
					</c:choose>	
				</div>
			
			<!-- <div class="list" >
   				 <div class ="container py-4" id="media-template">
   				 	<div class="p-5 mb-4 bg-body-tertiary rounded-3">
      					<img class="item-image rounded" width="1200" height="628"/>
    				</div>

    				<div class="row align-items-md-stretch">
     					<div class="col-md-6">
        					<div class="h-100 p-5 text-bg-dark rounded-3">
          						<h2 class="item-heading-species"></h2>
          						<p class="item-age"></p>
          						<p class="item-color"></p>
          						<p class="item-weight"></p>
          						<button class="btn btn-outline-light" type="button">Example button</button>
        					</div>
      					</div>
      					<div class="col-md-6">
       						 <div class="h-100 p-5 bg-body-tertiary border rounded-3">
          						<h2 class="item-headiing-status"></h2>
          						<p class="item-gender"></p>
          						<p class="item-status"></p>
          						<p class ="item-memo"></p>
        					</div>
      					</div>
    				</div>
  				</div> -->
			</div>
			<!-- <div class="text-end">
				<button type="button" class="btn btn-primary" id="animalListBtn">목록</button>
			</div> -->
		</div>
	
</body>
</html>