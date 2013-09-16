<h2>Pembayaran Penjualn</h2>
<table>
<tr>
	<td>Tanggal BK</td>
	<td>:</td>
	<td><input type="text" class="datepicker"/></td>
</tr>
<tr>
	<td>No BK</td>
	<td>:</td>
	<td><input type="text" /></td>
</tr>
<tr>
	<td>Nominal</td>
	<td>:</td>
	<td><input type="text" /></td>
</tr>
<tr>
	<td>Potongan</td>
	<td>:</td>
	<td><input type="text" /></td>
</tr>
<tr>
	<td>Total</td>
	<td>:</td>
	<td>0</td>
</tr>
<tr>
	<td>Pembayaran</td>
	<td>:</td>
	<td>
		<input type="radio" name="jenisPembayaran" value="Tunai" />Tunai &nbsp;
		<input type="radio" name="jenisPembayaran" value="Transfer" />Transfer &nbsp;
		<input type="radio" name="jenisPembayaran" value="Giro" />Giro
	</td>
</tr>
<tr>
	<td></td>
	<td></td>
	<td>
		<table>
			<thead>
				<th>Bank</th>
				<th>Tanggal Cair</th>
				<th>Dari Bank</th>
				<th>No Bukti</th>
			</thead>
			<tbody><tr>
				<td><select>
					<option>BCA</option>
					<option>Mandiri</option>
				</select></td>
				<td>
					<input type="text" class="datepicker" />
				</td>
				<td>
					<input type="text" />
				</td>
				<td>
					<input type="text" />
				</td>
			</tr></tbody>
		</table>
	</td>
</tr>
<tr>
	<td>Keterangan</td>
	<td>:</td>
	<td><textarea rows="2" cols="40"></textarea> </td>
</tr>
<tr>
	<td></td>
	<td></td>
	<td><input type="submit" value="Submit" /></td>
</tr>
</table>



<script type="text/javascript">
$(document).ready(function() {
	 $( ".datepicker" ).datepicker();
});
</script>