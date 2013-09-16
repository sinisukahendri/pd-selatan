<h1>LAPORAN PIUTANG</h1>
<br />
<form>
	<div class="filter">
		Customer :<input type="text" /> Submit Reset
	</div>
	<br />
	<div class="result">
		<table id="result-table">
			<thead>
				<tr>
					<th>Customer</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Customer 1</td>
				</tr>
				<tr>
					<td>Customer 2</td>
				</tr>
				<tr>
					<td>Customer 3</td>
				</tr>
				<tr>
					<td>Customer 4</td>
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