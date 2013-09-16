<h2>Data Penagihan</h2>
<div class="filter">
	<label>Tanggal :</label>
	<input type="text" class="datepicker" />
	<label>-</label>
	<input type="text" class="datepicker" />
	<label>No Penagihan :</label>
	<input type="text" />
	<input type="submit" value="Submit"/>
	<input type="reset" value="Reset"/>
	<input type="button" value="Tambah Data"/>
</div>

<table id="result-table">
<thead>
	<th></th>
	<th>Tanggal</th>
	<th>Faktur</th>
	<th>Modifier</th>
</thead>
<tbody>
<tr>
	<td></td>
	<td>03 Sept 2013</td>
	<td>CS_3112</td>
	<td>Lies</td>
</tr>
<tr>
	<td></td>
	<td>03 Sept 2013</td>
	<td>CS_3113</td>
	<td>Lies</td>
</tr>
</tbody>
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