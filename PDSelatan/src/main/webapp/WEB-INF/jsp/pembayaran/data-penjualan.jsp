<h2>Data Pembayaran Penjualan</h2>
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
	<label>Metode :</label>
	<select>
		<option>Semua</option>
	</select>
	<label>Bank :</label>
	<select>
		<option>BCA</option>
		<option>Mandiri</option>
	</select>
	<label>No BK :</label>
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
	<th>No BK</th>
	<th>Metode</th>
	<th>Bank</th>
	<th>Tgl Cair</th>
	<th>Nominal</th>
	<th>Sisa</th>
</thead>
<tbody>
</tbody>
</table>


<script type="text/javascript">
$(document).ready(function() {
	$('#result-table').dataTable({
		"oLanguage": {
			"sEmptyTable": "Masukan filter pembayaran penjualan pada form di atas"
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