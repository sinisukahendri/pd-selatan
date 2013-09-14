<h2>Tambah Penjualan Keramik</h2>
<hr/>

<table>
<tr>
	<td>Tanggal Penjualan</td>
	<td>:</td>
	<td>03 Sep 2014</td>
</tr>
<tr>
	<td>Kategori</td>
	<td>:</td>
	<td>Keramik</td>
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
	<td>Sales</td>
	<td>:</td>
	<td><select>
		<option>Otto Keramik</option>
	</select></td>
</tr>
<tr>
	<td>Keterangan</td>
	<td>:</td>
	<td>
		<textarea rows="2" cols="40"></textarea>
	</td>
</tr>
<tr>
	<td>Item Yang Dijual</td>
	<td>:</td>
	<td>
		<select>
			<option>Kategori A</option>
			<option>Kategori B</option>
			<option>Kategori C</option>
		</select>
		
		<select>
			<option>Item A</option>
			<option>Item B</option>
			<option>Item C</option>
		</select>
		
		<input type="button" value="Enter" />
	</td>
</tr>
</table>


<table id="result-table">
	<thead>
		<th></th>
		<th>Barang</th>
		<th>Lokasi</th>
		<th>Qty</th>
		<th>Harga</th>
		<th>Total</th>
	</thead>
	<tbody>
	</tbody>
	<tfoot class="summary-footer">
		<tr>
			<td align="right" colspan="5">Total :</td>
			<td>0</td>
		</tr>
	</tfoot>
</table>

<input type="submit" value="Submit" />
<input type="reset" value="Cancel" />

<script type="text/javascript">
$(document).ready(function() {
	$('#result-table').dataTable({
		"oLanguage": {
			"sEmptyTable": "Masukan data keramik yang terjual pada form di atas"
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