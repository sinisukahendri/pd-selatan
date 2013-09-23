<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<H1>DATA SUPPLIER</H1>
<hr />
<br />
<div class="filter">
	<form action="supplier">
		Nama Supplier : <input type="text" name="filter" /> <input
			type="submit" value="Submit" /> Reset
	</form>
	<a href="${pageContext.request.contextPath}/master/tambah-supplier">Tambah
		Supplier</a>
</div>
<br />
<div class="result">
	<table id="result-table">
		<thead>
			<tr>
				<th></th>
				<th></th>
				<th>Supplier</th>
				<th>Alamat</th>
				<th>Telepon</th>
				<th>Kontak</th>
				<th>Modifier</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${form.suppliers }" var="supplier">
				<tr>
					<td>edit</td>
					<td><form action="delete-supplier">
							<input type="hidden" value="${supplier.supplierId }"
								name="deletedSupplier" /> <input type="submit" value="Del" />
						</form></td>
					<td>${supplier.supplierName}</td>
					<td>${supplier.supplierAddress}</td>
					<td>${supplier.supplierPhone}</td>
					<td>${supplier.supplierContact}</td>
					<td>${supplier.modifier.empName}</td>
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