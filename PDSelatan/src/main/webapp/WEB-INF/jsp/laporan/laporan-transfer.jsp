<h1>LAPORAN TRANSFER</h1>
<hr/>
<form>
<div class="filter">
		Tanggal :<input type="text"/> - <input type="text"/> No Transfer :<input type="text"/> Submit Reset -- Tambah Data Transfer
	</div>
	<br />
	<div class="result">
		<table id="result-table">
			<thead>
				<tr>
					<th></th>
					<th>Tanggal</th>
					<th>No. Transfer</th>
					<th>Tujuan</th>
					<th>Modifier</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Del</td>
					<td>01 September 2013</td>
					<td>13414</td>
					<td>Otto</td>
					<td>---</td>
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