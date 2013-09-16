<h1>LAPORAN DO</h1>
<hr />
<form>
	<div class="filter">
		Tanggal :<input type="text"/> - <input type="text"/> Status <select><option>Semua</option></select>
		<br/>
		DO :<input type="text"/> Supplier <input type="text"/> Submit Reset
	</div>
	<br />
	<div class="result">
		<table id="result-table">
			<thead>
				<tr>
					<th></th>
					<th>Tanggal</th>
					<th>DO</th>
					<th>Faktur / No Retur</th>
					<th>Category</th>
					<th>Supplier</th>
					<th>Status</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Del</td>
					<td>01 September 2013</td>
					<td>DO</td>
					<td>FK13414</td>
					<td>Penjualan</td>
					<td>Otto</td>
					<td>X</td>
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