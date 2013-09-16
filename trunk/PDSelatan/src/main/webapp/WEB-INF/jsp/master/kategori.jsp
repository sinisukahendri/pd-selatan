<h1>KATEGORI BARANG</h1>
<form>
<hr/>
<div class="filter" style="border:solid thin;">
	Nama Kategori	:<input type="text"/> Submit Cancel
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
			<tr>
				<td>edit</td>
				<td>Del</td>
				<td>Accessories 1</td>
			</tr>
			<tr>
				<td>edit</td>
				<td>Del</td>
				<td>Accessories 2</td>
			</tr>
			<tr>
				<td>edit</td>
				<td>Del</td>
				<td>Accessories 3</td>
			</tr>
		</tbody>
	</table>
	</div>
</form>

<script type="text/javascript">
$(document).ready(function() {
	$('#result-table').dataTable();
} );
</script>