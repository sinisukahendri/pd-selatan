<h2>Data Operasional</h2>
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
	<label>Bank :</label>
	<select>
		<option>BCA</option>
		<option>Mandiri</option>
	</select>
	<input type="submit" value="Submit"/>
	<input type="reset" value="Reset"/>
	<input type="button" value="Tambah Data" />
</div>

<table id="result-table">
<thead>
	<th></th>
	<th></th>
	<th>Tanggal</th>
	<th>Bank</th>
	<th>Keterangan</th>
	<th>Nominal</th>
	<th>Modifier</th>
</thead>
<tbody>
	<tr>
		<td></td>
		<td></td>
		<td>02 Sep 2013</td>
		<td>2. Danamon 700xxx</td>
		<td>TBS (Sagola) BDI 67894 31/8/2013</td>
		<td>-14.700.000</td>
		<td>Ria</td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td>02 Sep 2013</td>
		<td>2. Danamon 700xxx</td>
		<td>Tunasindo BDI 67899 31/8/2013</td>
		<td>-42.300.000</td>
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