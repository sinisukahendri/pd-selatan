<h1>LAPORAN HUTANG</h1>
<hr/>
div class="filter">
		Nama Supplier :<input type="text"/>Submit Reset
	</div>
	<br />
	<div class="result">
		<table id="result-table">
			<thead>
				<tr>
					<th>Supplier</th>
					<th>Hutang</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Supplier 1</td>
					<td>0</td>
				</tr>
				<tr>
					<td>Otto</td>
					<td>1000000</td>
				</tr>
				<tr>
					<td>Supplier 2</td>
					<td>0</td>
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