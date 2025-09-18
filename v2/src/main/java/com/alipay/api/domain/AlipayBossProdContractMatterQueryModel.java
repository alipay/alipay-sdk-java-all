package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询合同详情信息（包含磋商）
 *
 * @author auto create
 * @since 1.0, 2023-11-16 13:51:48
 */
public class AlipayBossProdContractMatterQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6568122761475189159L;

	/**
	 * 合同号，H开头
	 */
	@ApiField("contract_code")
	private String contractCode;

	/**
	 * 操作人工号
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 当前页，默认1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页显示条数，默认100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	public String getContractCode() {
		return this.contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
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

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
