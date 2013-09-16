<h1>LAPORAN OMSET</h1>
<hr />
<form>
	<div class="filter">
		Tanggal :<input type="text"/> - <input type="text"/> Customer <select><option>            </option></select>
		<br/>
		Category <select><option>            </option></select>Barang :<input type="text"/> Sales<select><option>            </option></select> Submit Reset
	</div>
	<br />
	<div class="result">
		<table id="result-table">
			<thead>
				<tr>
					<th>Tanggal</th>
					<th>Invoice</th>
					<th>Customer</th>
					<th>Barang</th>
					<th>Qty</th>
					<th>Price</th>
					<th>Subtotal</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>01 September 2013</td>
					<td>IV13414</td>
					<td>Customer 1</td>
					<td>Barang 1</td>
					<td>1</td>
					<td>112200</td>
					<td>112200</td>
				</tr>
				<tr>
					<td>02 September 2013</td>
					<td>IV23414</td>
					<td>Customer 1</td>
					<td>Barang 1</td>
					<td>3</td>
					<td>112200</td>
					<td>338800</td>
				</tr>
			</tbody>
			<tfoot>
			<tr>
				<td colspan="6">Total</td>
				<td>451000</td>
			</tr>
			</tfoot>
		</table>
	</div>
</form>
<script type="text/javascript">
	$(document).ready(function() {
		$('#result-table').dataTable();
	});
</script>