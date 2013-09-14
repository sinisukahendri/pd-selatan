<h2>Tambah Data Transfer Barang</h2>
<table>
<tr>
	<td>Tanggal Transfer</td>
	<td>:</td>
	<td>03 Sept 2013</td>
</tr>
<tr>
	<td>Tujuan</td>
	<td>:</td>
	<td>
		<select>
			<option>Otto - Pungkur</option>
			<option>Pungkur - Otto</option>
		</select>
	</td>
</tr>
<tr>
	<td>Keterangan</td>
	<td>:</td>
	<td><textarea rows="2" cols="40"></textarea> </td>
</tr>
<tr>
	<td>Barang</td>
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
		<th>Qty</th>
	</thead>
	<tbody>
	</tbody>
</table>


<script type="text/javascript">
$(document).ready(function() {
	$('#result-table').dataTable({
		"oLanguage": {
			"sEmptyTable": "Masukan data transfer barang pada form di atas"
		},
		"bPaginate": false,
		"bLengthChange": false,
		"bFilter": false,
		"bSort": false,
		"bInfo": false,
		"bAutoWidth": false
	});
	
	 $( ".datepicker" ).datepicker();
} );
</script>