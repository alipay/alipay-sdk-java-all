package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询贷款记录信息
 *
 * @author auto create
 * @since 1.0, 2018-11-14 14:25:09
 */
public class AlipayPcreditLoanLoanInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8174392538325594367L;

	/**
	 * 代表了一次请求，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
