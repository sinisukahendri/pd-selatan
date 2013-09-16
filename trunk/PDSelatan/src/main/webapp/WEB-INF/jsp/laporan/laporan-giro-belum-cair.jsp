<h1>LAPORAN GIRO BELUM CAIR</h1>
<hr/>
<form>
	<div class="filter">
		Bank :<select><option>1. BCA 456789876</option></select>Submit Reset --
		Export to Excel
	</div>
	<br />
	<div class="result">
		<table id="result-table">
			<thead>
				<tr>
					<th>Tanggal</th>
					<th>No BK</th>
					<th>Tanggal BK</th>
					<th>Metode</th>
					<th>Bank</th>
					<th>Nominal</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>01 September 2013</td>
					<td>123434</td>
					<td>5 September 2013</td>
					<td>Giro</td>
					<td>1. BCA 3456787654</td>
					<td>3812000</td>
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