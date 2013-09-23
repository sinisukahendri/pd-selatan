<h1>LAPORAN BANK</h1>
<hr/>
<form>
<div>
	Bulan : <select><option>September</option></select>
	Tahun : <input type="text"/>
	Bank  : <select><option>BCA 0986523457</option></select>
	Submin Reset
</div>
<div class="result">
	<table id="result-table">
		<thead>
			<tr>
				<th>Tanggal</th>
				<th>Keterangan</th>
				<th>Nominal</th>
				<th>Saldo</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>12 September 2013</td>
				<td>Pembayaran lalala</td>
				<td>10000000</td>
				<td>20384892</td>
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