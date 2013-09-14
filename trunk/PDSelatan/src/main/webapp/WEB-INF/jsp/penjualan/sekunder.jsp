<h2>Penjualan Sekunder</h2>
<table>
<tr>
	<td>Tanggal Penjualan</td>
	<td>:</td>
	<td> <input type="text" class="datepicker" /></td>
</tr>
<tr>
	<td>Customer</td>
	<td>:</td>
	<td>
		<select>
			<option>Customer A</option>
			<option>Customer B</option>
			<option>Customer C</option>
		</select>
	</td>
</tr>
<tr>
	<td>No Faktur</td>
	<td>:</td>
	<td><input type="text" /></td>
</tr>
<tr>
	<td>Total</td>
	<td>:</td>
	<td><input type="text" /></td>
</tr>
<tr>
	<td>Keterangan</td>
	<td>:</td>
	<td><textarea rows="2" cols="40"></textarea> </td>
</tr>
</table>

<script type="text/javascript">
$(document).ready(function() {
	$('#result-table').dataTable();
	 $( ".datepicker" ).datepicker();
} );
</script>