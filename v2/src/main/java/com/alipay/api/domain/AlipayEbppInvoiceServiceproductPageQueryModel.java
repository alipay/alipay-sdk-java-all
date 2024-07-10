package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据费用类型子类型分页查询当前可用服务列表 
 *
 * @author auto create
 * @since 1.0, 2024-04-24 17:47:42
 */
public class AlipayEbppInvoiceServiceproductPageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2168554628985696386L;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页码大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 费用子类型
	 */
	@ApiField("service_expense_sub_type")
	private String serviceExpenseSubType;

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getServiceExpenseSubType() {
		return this.serviceExpenseSubType;
	}
	public void setServiceExpenseSubType(String serviceExpenseSubType) {
		this.serviceExpenseSubType = serviceExpenseSubType;
	}

}
