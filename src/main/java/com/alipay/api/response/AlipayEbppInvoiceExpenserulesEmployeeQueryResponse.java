package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expenserules.employee.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-14 17:52:33
 */
public class AlipayEbppInvoiceExpenserulesEmployeeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4594775322259848583L;

	/** 
	 * 员工列表
	 */
	@ApiListField("employee_list")
	@ApiField("string")
	private List<String> employeeList;

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
