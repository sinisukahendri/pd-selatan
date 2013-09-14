<h1>laporan-pembelian</h1>
<form>
<div class="filter">
	Tanggal : <input type="text" class="datepicker" />
</div>
<hr/>
<br/>
<div class="result">
	<table id="result-table">
		<thead>
			<th>Opt</th>
			<th>Tanggal</th>
			<th>DO</th>
			<th>Faktur</th>
			<th>Supplier</th>
			<th>Total</th>
			<th>Sisa</th>
			<th>Modifier</th>
		</thead>
		<tbody>
			<tr>
				<td>ed</td>
				<td>3 Sept 2013</td>
				<td>checked</td>
				<td>P_20130911</td>
				<td>MAP</td>
				<td>0</td>
				<td>0</td>
				<td>Yerin</td>
			</tr>
			<tr>
				<td>ed</td>
				<td>3 Sept 2013</td>
				<td>checked</td>
				<td>P_20130912</td>
				<td>Aditya Sukses Gemilang</td>
				<td>0</td>
				<td>0</td>
				<td>Yerin</td>
			</tr>
			<tr>
				<td>ed</td>
				<td>3 Sept 2013</td>
				<td>checked</td>
				<td>P_20130913</td>
				<td>MAP</td>
				<td>0</td>
				<td>0</td>
				<td>Yerin</td>
			</tr>
			<tr>
				<td>ed</td>
				<td>3 Sept 2013</td>
				<td>checked</td>
				<td>P_20130914</td>
				<td>Adiwisea Mandiri</td>
				<td>0</td>
				<td>0</td>
				<td>Yerin</td>
			</tr>
		</tbody>
	</table>
</div>
</form>

<script type="text/javascript">
$(document).ready(function() {
	$('#result-table').dataTable();
	 $( ".datepicker" ).datepicker();
} );
</script>