<h1>DATA CUSTOMER</h1>
<form>
<hr/>
<div class="filter">
	Nama Customer
</div>
<br />
<div class="result">
	<table id="result-table">
		<thead>
			<tr>
				<th></th>
				<th></th>
				<th>Nama</th>
				<th></th>
				<th>Alamat</th>
				<th>Telepon</th>
				<th>Modifier</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Edit</td>
				<td>Del</td>
				<td>Customer 1</td>
				<td>N</td>
				<td>jalan ...</td>
				<td>(022) 23456789</td>
				<td> Yerin</td>
			</tr>
			<tr>
				<td>Edit</td>
				<td>Del</td>
				<td>Customer 2</td>
				<td>N</td>
				<td>jalan ...</td>
				<td>(022) 23456789</td>
				<td> Yerin</td>			
			</tr>
			<tr>
				<td>Edit</td>
				<td>Del</td>
				<td>Customer 3</td>
				<td>N</td>
				<td>jalan ...</td>
				<td>(022) 23456789</td>
				<td> Yerin</td>
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