<H1>DATA SUPPLIER</H1>
<hr/>
<br/>
<form>
<div class="filter" >
	Nama Supplier	: <input type="text"/> Submit Reset 
	<a href="${pageContext.request.contextPath}/master/tambah-supplier">Tambah Supplier</a>
</div>
<br/>
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
			<tr>
				<td>edit</td>
				<td>Del</td>
				<td>Otto</td>
				<td>Jalan otista</td>
				<td>022 4567876</td>
				<td>Agus</td>
				<td>Yerin</td>
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