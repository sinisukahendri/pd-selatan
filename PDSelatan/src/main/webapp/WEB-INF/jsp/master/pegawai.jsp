<h1>DATA PEGAWAI</h1>
<hr/>
<form>
<div class="filter">
	Nama Pegawai	: <input type="text"/> Submit Reset <a>Tambah Pegawai</a>
</div>
<br/>
<div class="result">
	<table id="result-table">
		<thead>
			<tr>
				<th></th>
				<th></th>
				<th>Nama</th>
				<th>Group</th>
				<th>Telepon</th>
				<th>Username</th>
				<th>Password</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>edit</td>
				<td>Del</td>
				<td>Pegawai 1</td>
				<td>owner</td>
				<td></td>
				<td>owner</td>
				<td>owner</td>
			</tr>
		</tbody>
	</table>
	</div>
</form>

<script type="text/javascript">
$(document).ready(function() {
	$('#result-table').dataTable();
} );
</script>