<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>DATA CUSTOMER</h1>
<hr />
<div class="filter">
	<form action="customer">
		Nama Customer : <input type="text" / name="filter"> Kategori :
		<select><option>1</option>
			<option>2</option></select> 
		<input type="submit" value="Submit" /> Cancel
	</form>
	<a href="${pageContext.request.contextPath}/master/tambah-customer">Tambah
		Customer</a>
</div>
<br />
<div class="result">
	<table id="result-table">
		<thead>
			<tr>
				<th></th>
				<th></th>
				<th>Nama</th>
				<th></th>
				<th>Alamat</th>
				<th>Telepon</th>
				<th>Modifier</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${form.customers }" var="customer">

				<tr>
					<td>Edit</td>
					<td>
						<form action="delete-customer">
							<input type="hidden" value="${customer.customerId }"
								name="deletedCustomer" /> <input type="submit" value="Del" />
						</form>
					</td>
					<td>${customer.customerName }</td>
					<td>N</td>
					<td>${customer.customerAddress1}</td>
					<td>${customer.customerPhone}</td>
					<td>${customer.modifier.empName}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
]

<script type="text/javascript">
	$(document).ready(function() {
		$('#result-table').dataTable();
	});
</script>