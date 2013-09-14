<h2>Tambah Pembelian</h2>
<hr/>
<table>
<tr>
	<td>Tanggal Pembelian</td>
	<td>:</td>
	<td>03 Sept 2013</td>
</tr>
<tr>
	<td>No Faktur</td>
	<td>:</td>
	<td>
		<select>
			<option>P_20130914</option>
			<option>P_20130915</option>
			<option>P_20130916</option>
			<option>P_20130917</option>
		</select>
	</td>
</tr>
<tr>
	<td>Supplier</td>
	<td>:</td>
	<td>Supplier A</td>
</tr>
</table>

<table>
	<tr>
		<td>Cari DO:</td>
		<td>
		<select>
			<option>DO1</option>
			<option>DO2</option>
			<option>DO3</option>
		</select>
		<input type="button" value="Cari"> 
		</td>
	</tr>
</table>

<table id="result-table">
	<thead>
		<th></th>
		<th></th>
		<th>DO</th>
		<th>Faktur</th>
		<th>Barang</th>
		<th>Qty</th>
		<th>Harga</th>
		<th>Discount</th>
		<th>Total</th>
	</thead>
	<tbody>
	</tbody>
	<tfoot>
		<tr>
			<td align="right" colspan="8">Total :</td>
			<td>0</td>
		</tr>
	</tfoot>
</table>

<table id="grand-total-table">
	<thead>
	
	</thead>
	<tbody>
	</tbody>
	<tfoot>
		<tr>
			<td align="right" colspan="5">Grand Total :</td>
			<td>0</td>
		</tr>
	</tfoot>
</table>

<script type="text/javascript">
$(document).ready(function() {
	$('#result-table, #grand-total-table').dataTable({
		"oLanguage": {
			"sEmptyTable": "Masukan data pembelian DO pada form di atas"
		},
		"bPaginate": false,
		"bLengthChange": false,
		"bFilter": false,
		"bSort": false,
		"bInfo": false,
		"bAutoWidth": false
	});
});
</script>
