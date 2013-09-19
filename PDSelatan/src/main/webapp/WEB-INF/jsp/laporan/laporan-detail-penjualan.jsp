<h1>DETAIL PENJUALAN</h1>
<hr/>
<table>
	<thead>
		<tr>
			<th colspan="3">Form Penjualan</td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>Tgl Penjualan : 2 sept 2013</td>
			<td>Faktur : FK098765</td>
			<td>Customer : cust1</td>
		</tr>
		<tr>
			<td colspan="3">Keterangan : BODOGOL</td>
		</tr>
	</tbody>
</table>
<div class="result">
		<table id="result-table">
			<thead>
				<tr>
					<th>Barang</th>
					<th>Qty</th>
					<th>Harga</th>
					<th>Subtotal</th>
					<th>Supplier</th>
					<th>No. DO</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Barang 1</td>
					<td>2</td>
					<td>50.000</td>
					<td>100.000</td>
					<td>Otto</td>
					<td>DO2345</td>
				</tr>
				<tr>
					<td>Barang 2</td>
					<td>5</td>
					<td>20.000</td>
					<td>100.000</td>
					<td>Otto</td>
					<td>DO2345</td>
				</tr>
				<tr>
					<td>Barang 3</td>
					<td>10</td>
					<td>10.000</td>
					<td>100.000</td>
					<td>Otto</td>
					<td>DO2345</td>
				</tr>
				<tr>
					<td colspan ="3">Total</td>
					<td>300.000</td>
					<td></td>
					<td></td>
				</tr>
			</tbody>
		</table>
	</div>

<form>
	Print & Close - Print Invoice ke Uci - Print DO ke Uci
</form>

<script type="text/javascript">
	$(document).ready(function() {
		$('#result-table').dataTable();
	});
</script>