<h2>Pembayaran Pembelian</h2>

<table>
<tr>
	<td>Tanggal Pembayaran</td>
	<td>:</td>
	<td><input type="text" class="datepicker"/></td>
</tr>
<tr>
	<td>Bank (Dari)</td>
	<td>:</td>
	<td><select>
		<option>1. BCA</option>
		<option>2. Danamon</option>
		<option>3. Mandiri</option>
	</select></td>
</tr>
<tr>
	<td>Supplier</td>
	<td>:</td>
	<td><select>
		<option>Supplier 1</option>
		<option>Supplier 2</option>
		<option>Supplier 3</option>
	</select></td>
</tr>
</table>

<table id="result-table">
	<thead>
		<th></th>
		<th></th>
		<th>Tanggal</th>
		<th>Faktur</th>
		<th>Supplier</th>
		<th>Total</th>
		<th>Terbayar</th>
		<th>Sisa</th>
	</thead>
	<tbody>
	</tbody>
</table>

<input type="submit" />
<input type="reset" value="Close"/>

<h3>Data Pembayaran</h3>
<table id="result-table2">
	<thead>
		<th></th>
		<th>Supplier</th>
		<th>Tanggal</th>
		<th>Faktur</th>
		<th>Total</th>
	</thead>
	<tbody>
	</tbody>
	<tfoot>
		<tr>
			<td colspan="4" align="right">Total Pembayaran</td>
			<td>0</td>
		</tr>
	</tfoot>
</table>


<script type="text/javascript">
$(document).ready(function() {
	$('#result-table').dataTable({
		"oLanguage": {
			"sEmptyTable": "Masukan data pembayaran pada form di atas"
		},
		"bPaginate": false,
		"bLengthChange": false,
		"bFilter": false,
		"bSort": false,
		"bInfo": false,
		"bAutoWidth": false
	});
	$('#result-table2').dataTable({
		"oLanguage": {
			"sEmptyTable": "Masukan pembayaran dari tabel di atas"
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