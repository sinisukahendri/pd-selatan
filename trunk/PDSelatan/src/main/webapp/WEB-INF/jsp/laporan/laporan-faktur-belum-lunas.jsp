<h1>LAPORAN FAKTUR BELUM LUNAS</h1>
<hr/>
<form>
	<div class="filter">
		Bulan :<select><option>September</option></select> 
		Tahun <input type="text"/> 
		Customer <select><option></option></select> Submit Reset
		<br/>
		Export to Excel
	</div>
	<br />
	<div class="result">
		<table id="result-table">
			<thead>
				<tr>
					<th>Tanggal</th>
					<th>No Faktur</th>
					<th>Customer</th>
					<th>Total</th>
					<th>Sisa</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>01 September 2013</td>
					<td>123434</td>
					<td>Customer 1</td>
					<td>1</td>
					<td>1</td>
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