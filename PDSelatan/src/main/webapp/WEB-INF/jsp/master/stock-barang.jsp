<h1>Stock BARANG</h1>
<hr/>
<br/>
<form>
<div class="filter">
	Kategori	:
</div>
<br/>
<h2>Daftar Stock Barang</h2>
<div class="result">
	<table id="result-table">
		<thead>
			<tr>
				<th>Nama Barang</th>
				<th>Stock Awal</th>
				<th>Stock Skrg</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Barang</td>
				<td>0</td>
				<td>5</td>
			</tr>
			<tr>
				<td>Barang 2</td>
				<td>0</td>
				<td>15</td>
			</tr>
			<tr>
				<td>Barang 3</td>
				<td>0</td>
				<td>25</td>
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