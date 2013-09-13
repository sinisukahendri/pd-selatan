<h1>DATA BARANG</h1>
<form>
<hr/>
<br/>
<div class="subMenuBarang">
	<a href="${pageContext.request.contextPath}/master/kategori">Kategori Barang</a>
	<a href="${pageContext.request.contextPath}/master/data-barang">Edit Barang</a>
	<a href="${pageContext.request.contextPath}/master/stock-barang">Edit Stock Awal</a>
</div>
	<br/>
<div class="filter" style="border:solid thin;">
	Kategori	:
</div>
<br/>
<div class="result">
	<table id="result-table">
		<thead>
			<tr>
				<th></th>
				<th></th>
				<th>Stok</th>
				<th>PL</th>
				<th>M</th>
				<th>R</th>
				<th>D</th>
				<th>P</th>
				<th>Modifier</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>edit</td>
				<td>Del</td>
				<td>Aquaproof - Abu Muda Gln</td>
				<td>6</td>
				<td>0</td>
				<td>160.000</td>
				<td>160.000</td>
				<td>160.000</td>
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