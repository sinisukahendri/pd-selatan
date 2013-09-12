<h2>laporan-pembelian-item</h2>
<form>
<div class="filter">
	Tanggal
</div>
<hr/>
<br/>
<div class="result">
	<table id="result-table">
		<thead>
			<th>Tanggal</th>
			<th>Invoice</th>
			<th>Supplier</th>
			<th>Barang</th>
			<th>Qty</th>
			<th>Price</th>
			<th>Subtotal</th>
		</thead>
		<tbody>
			<tr>
				<td>20 Aug 2013</td>
				<td>IN130841</td>
				<td>Restu Logam</td>
				<td>Aquaproof Abu-Abu Gln</td>
				<td>12</td>
				<td>0</td>
				<td>0</td>
			</tr>
			<tr>
				<td>20 Aug 2013</td>
				<td>IN130841</td>
				<td>Restu Logam</td>
				<td>Aquaproof Putih Gln</td>
				<td>4</td>
				<td>0</td>
				<td>0</td>
			</tr>
			<tr>
				<td>20 Aug 2013</td>
				<td>IN130841</td>
				<td>Restu Logam</td>
				<td>Aquaproof Abu-Abu Kg</td>
				<td>48</td>
				<td>0</td>
				<td>0</td>
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