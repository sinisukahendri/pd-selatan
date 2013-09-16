<h2>Tambah Penagihan Baru</h2>
<table>
<tr>
	<td>Tanggal</td>
	<td>:</td>
	<td><input type="text" class="datepicker"/></td>
</tr>
<tr>
	<td>Customer</td>
	<td>:</td>
	<td><select>
		<option>Customer 1</option>
		<option>Customer 2</option>
		<option>Customer 3</option>
	</select></td>
</tr>
<tr>
	<td></td>
	<td></td>
	<td><input type="submit" value="Cari"/></td>
</tr>
</table>

<table id="result-table">
<thead>
	<th>Customer</th>
	<th>Tanggal</th>
	<th>Faktur</th>
	<th>Total</th>
</thead>
<tbody>
</tbody>
<tfoot>
	<tr>
		<td colspan="3" align="right">Total Tagihan</td>
		<td></td>
	</tr>
</tfoot>
</table>


<script type="text/javascript">
$(document).ready(function() {
	$('#result-table').dataTable({
		"oLanguage": {
			"sEmptyTable": "Masukan data penagihan pada form di atas"
		},
		"bPaginate": false,
		"bLengthChange": false,
		"bFilter": false,
		"bSort": false,
		"bInfo": false,
		"bAutoWidth": false
	});
	 $( ".datepicker" ).datepicker();
});
</script>