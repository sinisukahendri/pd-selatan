<h2>Tambah Pembelian</h2>
<hr/>
<table>
<tr>
	<td>Tanggal Pembelian</td>
	<td>:</td>
	<td>03 Sept 2013</td>
</tr>
<tr>
	<td>Supplier</td>
	<td>:</td>
	<td>
		<select>
			<option>AM Home</option>
			<option>Supplier A</option>
			<option>Supplier B</option>
			<option>Supplier C</option>
		</select>
	</td>
</tr>
<tr>
	<td>Keterangan</td>
	<td>:</td>
	<td>
		<textarea rows="2" cols="40"></textarea>
	</td>
</tr>
<tr>
	<td>Item Yang Dijual</td>
	<td>:</td>
	<td>
		<select>
			<option>Kategori A</option>
			<option>Kategori B</option>
			<option>Kategori C</option>
		</select>
		
		<select>
			<option>Item A</option>
			<option>Item B</option>
			<option>Item C</option>
		</select>
		
		<input type="button" value="Enter" />
	</td>
</tr>
</table>

<table id="result-table">
	<thead>
		<th></th>
		<th>Barang</th>
		<th>Qty</th>
		<th>Harga</th>
		<th>Discount</th>
		<th>Total</th>
	</thead>
	<tbody>
	</tbody>
	<tfoot class="summary-footer">
		<tr>
			<td align="right" colspan="5">Total :</td>
			<td>0</td>
		</tr>
		<tr>
			<td align="right" colspan="5">Discount :</td>
			<td>
				<select>
					<option>%</option>
					<option>Rp.</option>
				</select>
			</td>
		</tr>
		<tr>
			<td align="right" colspan="5">Grand Total :</td>
			<td>0</td>
		</tr>
	</tfoot>
</table>


<script type="text/javascript">
$(document).ready(function() {
	$('#result-table').dataTable({
		"oLanguage": {
			"sEmptyTable": "Masukan data pembelian langsung pada form di atas"
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
