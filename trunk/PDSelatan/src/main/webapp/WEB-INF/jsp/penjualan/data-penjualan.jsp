<h2>Data Penjualan</h2>
<div class="details">
	<label>Limit :</label>
	<input type="text" />
	<label>Range Atas :</label>
	<input type="text" />
	<label>Range Bawah :</label>
	<input type="text" />
	<input type="Submit" />
	<input type="Reset"/>
</div>

<table id="result-table">
	<thead>
		<th>Tanggal</th>
		<th>Faktur</th>
		<th>Customer</th>
		<th>Total</th>
	</thead>
	<tbody>
		<tr>
			<td>
				03 Sept 2013
			</td>
			<td>
				<a>FR20130931</a>
			</td>
			<td>
				<label class="customer-name">RAMA</label>
				<label class="customer-items">9x Seiv - 588 Medium Yellow @41.000 = 369.000</label>
				<label class="customer-items">7x Top Color - 1494 Dark Blue @50.000 = 350.000</label>
				<label class="customer-items">9x Zinctium -880M Doff Black @41.000 = 369.000</label>
			</td>
			<td>1.088.000</td>
		</tr>
		<tr>
			<td>
				03 Sept 2013
			</td>
			<td>
				<a>FR20130932</a>
			</td>
			<td>
				<label class="customer-name">TRIJAYA TSK</label>
				<label class="customer-items">9x Epolec Pail - 80 @160.000 = 1.440.000</label>
			</td>
			<td>1.440.000</td>
		</tr>
		<tr>
			<td>
				03 Sept 2013
			</td>
			<td>
				<a>FR20130933</a>
			</td>
			<td>
				<label class="customer-name">ANYAR, TB</label>
				<label class="customer-items">1x Ici Catylac Gln - 500 500 White @95.000 = 95.000</label>
				<label class="customer-items">2x Nippon Nippe Kg - 431 Indian Red @54.500 = 109.000</label>
			</td>
			<td>204.000</td>
		</tr>
	</tbody>
	<tfoot>
		<tr>
			<td colspan="3" align="right">Grand Total</td>
			<td>xxxxxxx</td>
		</tr>
	</tfoot>
</table>


<script type="text/javascript">
$(document).ready(function() {
	$('#result-table').dataTable({
		"oLanguage": {
			"sEmptyTable": "Tidak ada data penjualan untuk ditampilkan"
		},
		"bLengthChange": false,
		"bFilter": false,
		"bAutoWidth": false
	});
});
</script>