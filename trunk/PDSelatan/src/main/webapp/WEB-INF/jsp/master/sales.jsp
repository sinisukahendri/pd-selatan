<h1>DATA Salesman</h1>
<hr/>
<form>
<div class="filter">
	Nama Salesman	: <input type="text"/> Submit Reset 
	<a href="${pageContext.request.contextPath}/master/tambah-sales">Tambah Salesman</a>
</div>
<br/>
<div class="result">
	<table id="result-table">
		<thead>
			<tr>
				<th></th>
				<th></th>
				<th>Nama</th>
				<th>Modifier</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>edit</td>
				<td>Del</td>
				<td>Sales 1</td>
				<td>-</td>
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