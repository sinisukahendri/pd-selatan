<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1>DATA PEGAWAI</h1>
<hr />
	<form method="post" id="searchEmployee" action="searchEmployee">
	<div class="filter">
		Nama Pegawai : <input type="text" name ="userNameSearch"/> 
		<input type="submit" id="searchEmp" value="Search" /> 
		<input type="button" name="resetBtn" value="Reset" onclick="window.location='pegawai'" /> 		
	</div>
	</form>
	<form method="post" id="AddOrEditEmployee" action="tambah-pegawai?action=add">
		<input type="submit" id="addEmp" value="Tambah Pegawai" />
		</form>
	<br />
	<div class="result">
		<table id="result-table">
			<thead>
				<tr>
					<th></th>
					<th></th>
					<th>Nama</th>
					<th>Address</th>
					<th>Telepon</th>
					<th>Username</th>
					<th>Password</th>
				</tr>
			</thead>
			<tbody>		
				
				<c:forEach items="${form.userList}" var="empIdCurr">
					<tr>
						<td>							
							<a href="tambah-pegawai?id=${empIdCurr.userId}&action=edit"><img width="30" height="30" alt="edit" src="../assets/img/edit.png"></a>																			
						</td>
						<td><a href="pegawai?id=${empIdCurr.userId}&action=delete"><img width="30" height="30" alt="delete" src="../assets/img/delete.jpg"></a></td>
						<td>${empIdCurr.empName}</td>
						<td>${empIdCurr.empAddress}</td>
						<td>${empIdCurr.empPhone}</td>
						<td>${empIdCurr.username}</td>
						<td>${empIdCurr.password}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>


	</div>

<script type="text/javascript">
	$(document).ready(function() {
		$('#result-table').dataTable();
	});
</script>