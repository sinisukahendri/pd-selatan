<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1>TAMBAH PEGAWAI</h1>
<hr/>
<form method="post" id="AddOrEditEmployee" action="saveEmployee">
	
<%-- 	<input type="hidden" value="${form.userAddOrUpdate}" name="userAddOrUpdate"/>
 --%>
	<table>
		<tr>
			<td>Nama</td>
			<td>:</td>
			<td>
				<input type="text" value="${form.empNameNew}" name="empNameNew"
				size="30" maxlength="12"/>
			</td>
		</tr>
		
		<tr>
			<td>Alamat</td>
			<td>:</td>
			<td>
				<input type="text" value="${form.empAddressNew }" name="empAddressNew" size="50" maxlength="50"/>				
			</td>
		</tr>
		
		<tr>
			<td>Telepon</td>
			<td>:</td>
			<td>
				<input type="text" value="${form.empPhoneNew}" name="empPhoneNew" 
				size="30" maxlength="12"/>
			</td>
		</tr>
		<tr>
			<td>Username</td>
			<td>:</td>
			<td>
				<input type="text" value="${form.userNameNew}" name="userNameNew"
				size="30" maxlength="12"/>
			</td>
		</tr>
		<tr>
			<td>Password</td>
			<td>:</td>
			<td>
				<input type="password" value="${form.passwordNew}" name="passwordNew" 
				size="30" maxlength="12"/>
			</td>
		</tr>
		
	</table>
	
	<div class="role">
		<table id="role-table">
			<thead>			
				<tr>
				<c:forEach items="${form.roleList}" var="roleCurr">					
					<th>${roleCurr.roleDesc }</th>					
				</c:forEach>	
				</tr>
				
			</thead>
			<tbody>
				<c:forEach items="${form.roleList}" var="roleIter">
					<%-- <c:forEach items="${attr.rolesSelected}" var="role">	
						<c:if test="${roleIter.roleId == role}"> --%>
						<td>
						<form:checkbox path="form.rolesSelected" value="${roleIter.roleId}"/>
						 </td>
						 <%-- </c:if>
					</c:forEach> --%>	
				</c:forEach>
													
			</tbody>
		</table>


	</div>
	<input type="hidden" id="empIdSelected" value="${form.userIdSelected}"/>
	<input type="submit" id="nextBtn" value="Submit" />
	<input type="button" name="cancelBtn" value="Cancel" onclick="window.location='pegawai'" />	 
	
</form>

<script type="text/javascript">
	$(document).ready(function() {
		$('#role-table').dataTable();
	});
</script>