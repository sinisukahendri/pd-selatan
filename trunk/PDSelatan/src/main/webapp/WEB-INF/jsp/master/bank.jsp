<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript">
	$(document).ready(function() {
		$('#result-table').dataTable();
	});
</script>
<h1>BANK</h1>
<hr />
	<div class="filter">
		<form action="bank">
			Nama Bank <input type="text" name="filter"/> 
			<input type="submit" value="Submit"/>
			Reset 
		</form>
		<a href="${pageContext.request.contextPath}/master/tambah-bank">Tambah Data</a>
		
	</div>
	<br />
	<div class="result">
		<table id="result-table">
			<thead>
				<tr>
					<th></th>
					<th></th>
					<th>Bank</th>
					<th>Keterangan</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${form.banks }" var="bank">
					<tr>
						<td>Edit</td>
						<td>
							<form action="delete-bank">
								<input type="hidden" value="${bank.bankId }"
									name="deletedBank" /> <input type="submit" value="Del" />
							</form>
						</td>
						<td>${bank.bankName}</td>
						<td>${bank.bankNote }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>