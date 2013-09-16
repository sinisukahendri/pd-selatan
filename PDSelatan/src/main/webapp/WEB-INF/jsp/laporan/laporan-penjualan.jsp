<h1>laporan-penjualan</h1>
<hr />
<form>
	<div class="filter">
		Tanggal :<input type="text"/> - <input type="text"/> Pembayaran <select><option>Semua</option></select>
		Kategori <select><option>Semua</option></select>
		<br/>
		Faktur :<input type="text"/> Retur <input type="text"/> Customer <input type="text"/> Submit Reset --- Print Export to Excel
	</div>
	<br />
	<div class="result">
		<table id="result-table">
			<thead>
				<tr>
					<th></th>
					<th></th>
					<th>Tanggal</th>
					<th>Print</th>
					<th></th>
					<th>Faktur</th>
					<th>Customer</th>
					<th>Total</th>
					<th>Sisa</th>
					<th>Modifier</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td></td>
					<td></td>
					<td>01 September 2013</td>
					<td>v</td>
					<td></td>	
					<td>FAK13414</td>
					<td>Customer 1</td>
					<td>100000</td>
					<td>10000</td>
					<td>A</td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td>02 September 2013</td>
					<td>v</td>
					<td></td>	
					<td>FAK23414</td>
					<td>Customer 1</td>
					<td>200000</td>
					<td>20000</td>
					<td>A</td>
				</tr>
			</tbody>
		</table>
	</div>
</form>
<script type="text/javascript">
	$(document).ready(function() {
		$('#result-table').dataTable();
	});
</script>