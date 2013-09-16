<h1>DETAIL PIUTANG</h1>
<hr>
<div class="result">
	<table id="result-table">
		<thead>
			<tr>
				<th></th>
				<th>Tanggal</th>
				<th>Faktur</th>
				<th>Customer</th>
				<th>Note</th>
				<th>Total</th>
				<th>Bayar</th>
				<th>Sisa</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>01 September 2013</td>
				<td>FK13414</td>
				<td>OTTo</td>
				<td>note 1</td>
				<td>10000000</td>
				<td>0</td>
				<td>10000000</td>
			</tr>
			<tr>
				<td>02 September 2013</td>
				<td>FK16414</td>
				<td>OTTo</td>
				<td>note 1</td>
				<td>1000000</td>
				<td>0</td>
				<td>1000000</td>
			</tr>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="6">Total Piutang</td>
				<td>1100000</td>
			</tr>
		</tfoot>
	</table>
</div>
<script type="text/javascript">
	$(document).ready(function() {
		$('#result-table').dataTable();
	});
</script>