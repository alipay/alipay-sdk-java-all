package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expenserules.employee.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 13:26:46
 */
public class AlipayEbppInvoiceExpenserulesEmployeeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7158921184383828865L;

	/** 
	 * 切换open_id前请使用此字段：员工列表
	 */
	@ApiListField("employee_list")
	@ApiField("string")
	private List<String> employeeList;

	/** 
	 * 切换open_id后请使用此字段：员工open_id列表
	 */
	@ApiListField("employee_open_id_list")
	@ApiField("string")
	private List<String> employeeOpenIdList;

	/** 
	 * 当前页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 当前记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_page_count")
	private Long totalPageCount;

	public void setEmployeeList(List<String> employeeList) {
		this.employeeList = employeeList;
	}
	public List<String> getEmployeeList( ) {
		return this.employeeList;
	}

	public void setEmployeeOpenIdList(List<String> employeeOpenIdList) {
		this.employeeOpenIdList = employeeOpenIdList;
	}
	public List<String> getEmployeeOpenIdList( ) {
		return this.employeeOpenIdList;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalPageCount(Long totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public Long getTotalPageCount( ) {
		return this.totalPageCount;
	}

}
