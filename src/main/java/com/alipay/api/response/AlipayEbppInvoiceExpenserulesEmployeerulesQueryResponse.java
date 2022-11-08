package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExpenseCtrlEmployeeRuleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expenserules.employeerules.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-11 20:25:00
 */
public class AlipayEbppInvoiceExpenserulesEmployeerulesQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7256598818217578739L;

	/** 
	 * 员工已绑定费控规则列表
	 */
	@ApiListField("employee_rules")
	@ApiField("expense_ctrl_employee_rule_info")
	private List<ExpenseCtrlEmployeeRuleInfo> employeeRules;

	/** 
	 * 客户端输入的页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 客户端输入的每页行数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 查询到的实例总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setEmployeeRules(List<ExpenseCtrlEmployeeRuleInfo> employeeRules) {
		this.employeeRules = employeeRules;
	}
	public List<ExpenseCtrlEmployeeRuleInfo> getEmployeeRules( ) {
		return this.employeeRules;
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

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
