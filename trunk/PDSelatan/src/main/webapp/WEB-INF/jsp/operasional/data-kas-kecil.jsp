<h2>Data Kas Kecil</h2>
<div class="filter">
	<label>Bulan : </label>
	<select>
		<option>Januari</option>
		<option>Febuari</option>
		<option>Maret</option>
		<option>April</option>
		<option>Mei</option>
		<option>Juni</option>
		<option>Juli</option>
		<option>Agustus</option>
		<option>September</option>
		<option>Oktober</option>
		<option>November</option>
		<option>Desember</option>
	</select>
	<label>Tahun :</label>
	<input type="text" />
	<input type="submit" value="Submit"/>
	<input type="reset" value="Reset"/>
	<input type="button" value="Tambah Data" />
</div>

<table id="result-table">
<thead>
	<th></th>
	<th></th>
	<th>Tanggal</th>
	<th>Keterangan</th>
	<th>Nominal</th>
	<th>Saldo</th>
	<th>Modifier</th>
</thead>
<tbody>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td>Saldo Awal Bulan</td>
		<td></td>
		<td>5.766.555</td>
		<td></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td>14 Aug 2013</td>
		<td>Bensin T.Ani</td>
		<td>-2.440.000</td>
		<td>xxxx</td>
		<td>Ria</td>
	</tr>
</tbody>
<tfoot>
</tfoot>
</table>


<script type="text/javascript">
$(document).ready(function() {
	$('#result-table').dataTable({
		"oLanguage": {
			"sEmptyTable": "Masukan data operasional pada form di atas"
		},
		"bLengthChange": false,
		"bSort": false,
		"bInfo": false,
		"bAutoWidth": false
	});
	 $( ".datepicker" ).datepicker();
});
</script>