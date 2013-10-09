<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>Golongan Harga</h1>
<hr />
<br />
<div class="filter">
	<form action="golongan-harga">
		Kategori :
		<select name="filter">
			<c:forEach items="${form.kategories}" var="kategori">
				<option  value="${kategori.kategoriName}">${kategori.kategoriName}</option>
			</c:forEach>
		</select>
		<input type="submit" value="Submit" /> Cancel
	</form>
	<a href="${pageContext.request.contextPath}/master/tambah-kategori">Tambah Golongan</a>
</div>
<br />
<h2>Golongan Harga ${form.filter}</h2>
<div class="result">
	<table id="result-table">
		<thead>
			<tr>
				<th></th>
				<th>Golongan</th>
				<th>Hrg PL</th>
				<th>Hrg M</th>
				<th>Hrg R</th>
				<th>Hrg D</th>
				<th>Hrg P</th>
				<th>Modifier</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${form.hargaBarangs}" var="harga">
				<tr>
					<td>
						<form action="delete-hargaBarang">
							<input type="hidden" value="${harga.priceId}"
								name="deletedHargaBarang" /> <input type="submit" value="Del" />
						</form>
					</td>
					<td>${harga.priceName}</td>
					<td>${harga.pricePl}</td>
					<td>${harga.priceM}</td>
					<td>${harga.priceR}</td>
					<td>${harga.priceD}</td>
					<td>${harga.priceP}</td>
					<td>${harga.modifier.empName}</td>
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