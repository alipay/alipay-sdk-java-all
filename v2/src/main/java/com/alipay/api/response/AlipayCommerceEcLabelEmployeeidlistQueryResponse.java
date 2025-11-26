package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.label.employeeidlist.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-27 17:17:29
 */
public class AlipayCommerceEcLabelEmployeeidlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5383477834543898524L;

	/** 
	 * 当前页数
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 员工id列表
	 */
	@ApiListField("employee_id_list")
	@ApiField("string")
	private List<String> employeeIdList;

	/** 
	 * 员工总数量
	 */
	@ApiField("total_num")
	private Long totalNum;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setEmployeeIdList(List<String> employeeIdList) {
		this.employeeIdList = employeeIdList;
	}
	public List<String> getEmployeeIdList( ) {
		return this.employeeIdList;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

}
