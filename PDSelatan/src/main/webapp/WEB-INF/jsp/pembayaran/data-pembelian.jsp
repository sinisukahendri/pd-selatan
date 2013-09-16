<h2>Data Pembayaran Pembelian</h2>
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
	<th>Supplier</th>
	<th>Bank</th>
	<th>Nominal</th>
	<th>Modifier</th>
</thead>
<tbody>
	<tr>
		<td></td>
		<td></td>
		<td>01 Sept 2013</td>
		<td>Aditya Sukses Gemilang</td>
		<td>3. BCA 279xxxx</td>
		<td>1.445.320</td>
		<td>Si Udin</td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td>02 Sept 2013</td>
		<td>Guna Bangun Jaya (Lemkra)</td>
		<td>3. BCA 274xxxx</td>
		<td>123.500.000</td>
		<td>Si Ujang</td>
	</tr>
</tbody>
</table>


<script type="text/javascript">
$(document).ready(function() {
	$('#result-table').dataTable({
		"oLanguage": {
			"sEmptyTable": "Masukan filter pembayaran pembelian pada form di atas"
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