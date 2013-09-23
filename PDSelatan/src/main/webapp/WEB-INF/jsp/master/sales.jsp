<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>DATA Salesman</h1>
<hr />
<div class="filter">
	<form action="sales">
		Nama Salesman : <input type="text" name="filter" /> 
		<input type="submit" value="Submit" /> Reset
	</form>
	<a href="${pageContext.request.contextPath}/master/tambah-sales">Tambah Salesman</a>
</div>
<br />
<div class="result">
	<table id="result-table">
		<thead>
			<tr>
				<th></th>
				<th></th>
				<th>Nama</th>
				<th>Modifier</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${form.salesmans}" var="salesman">
				<tr>
					<td>edit</td>
					<td>
						<form action="delete-sales">
							<input type="hidden" value="${salesman.salesmanId}"
								name="deletedSalesman" /> 
							<input type="submit" value="Del" />
						</form>
					</td>
					<td>${salesman.salesmanName}</td>
					<td>${salesman.modifier.empName}</td>
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