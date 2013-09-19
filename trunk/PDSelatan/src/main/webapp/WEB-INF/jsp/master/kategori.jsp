<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>KATEGORI BARANG</h1>
<form>
<hr/>
<div class="filter" style="border:solid thin;">
	<form action="kategori">
		Nama Kategori :<input type="text" name="filter"/> 
		<input type="submit" value="Submit"/>
		Reset 
	</form>
	<a href="${pageContext.request.contextPath}/master/tambah-kategori">Tambah Kategori</a>
</div>
<br/>
<div class="result">
	<table id="result-table">
		<thead>
			<tr>
				<th></th>
				<th></th>
				<th>Nama</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${form.kategories }" var="kategori">
					<tr>
						<td>Edit</td>
						<td>
							<form action="delete-kategori">
								<input type="hidden" value="${kategori.kategoriId }"
									name="deletedKategori" /> <input type="submit" value="Del" />
							</form>
						</td>
						<td>${kategori.kategoriName}</td>
					</tr>
				</c:forEach>
		</tbody>
	</table>
	</div>
</form>

<script type="text/javascript">
$(document).ready(function() {
	$('#result-table').dataTable();
} );
</script>