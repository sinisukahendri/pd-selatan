<%@ page session="true"
	import="java.util.List, com.pdselatan.model.Bank, com.pdselatan.controller.MasterController"%>
<%
	MasterController masterControl = new MasterController();	
	List<Bank> banks = (List)session.getAttribute("listBank");
	if(banks== null || banks.size()==0){
		banks = masterControl.getAllBank();
		session.setAttribute("listBank",banks);
	}
%>
<script type="text/javascript">
	$(document).ready(function() {
		$('#result-table').dataTable();
	});
	
	function deleteBank(id){
		masterControl.deleteBank(id);
	}
</script>
<h1>BANK</h1>
<hr/>
<form>
	<div class="filter">
		Nama Bank <input type="text" /> Submit Reset <a
			href="${pageContext.request.contextPath}/master/tambah-bank">Tambah Data</a>
	</div>
	<br />
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
				<%
				if(banks!=null){
					for(Bank bank :banks){%>
						<tr>
							<td>Edit</td>
							<td>Delete</td>
							<td><% out.print(bank.getBankName()); %></td>
							<td><% out.print(bank.getBankNote());%></td>
						</tr>
					<%}
				}%>
			</tbody>
		</table>
	</div>
</form>