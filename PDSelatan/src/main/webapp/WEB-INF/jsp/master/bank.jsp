<h1>BANK</h1>
<hr/>
<form>
<div class="filter">
	Nama Bank
	<input type ="text"/>
	Submit
	Reset
	<a href="${pageContext.request.contextPath}/master/tambah-bank">Tambah data</a>
</div>
<br/>
<div class="result">
	<table id="result-table">
		<thead>
			<tr>
				<th></th>
				<th></th>
				<th>Bank</th>
				<th>Keterangan</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Edit</td>
				<td>Del</td>
				<td>BCA</td>
				<td></td>
			</tr>
			<tr>
				<td>Edit</td>
				<td>Del</td>
				<td>BNI</td>
				<td></td>
			</tr>
			<tr>
				<td>Edit</td>
				<td>Del</td>
				<td>Mandiri</td>
				<td></td>
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