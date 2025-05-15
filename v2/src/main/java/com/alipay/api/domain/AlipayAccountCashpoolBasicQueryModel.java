package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询资金池基本信息
 *
 * @author auto create
 * @since 1.0, 2020-07-06 11:21:12
 */
public class AlipayAccountCashpoolBasicQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3838976563742388561L;

	/**
	 * 查询条件，资金池名称，不支持模糊查询
	 */
	@ApiField("cash_pool_name")
	private String cashPoolName;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页面大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getCashPoolName() {
		return this.cashPoolName;
	}
	public void setCashPoolName(String cashPoolName) {
		this.cashPoolName = cashPoolName;
	}

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

}
