package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询核算主体下的员工id列表
 *
 * @author auto create
 * @since 1.0, 2025-04-08 09:38:11
 */
public class AlipayCommerceEcAccountingentityEmployeeidlistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3555435221985729883L;

	/**
	 * 核算主体id
	 */
	@ApiField("accounting_entity_id")
	private String accountingEntityId;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getAccountingEntityId() {
		return this.accountingEntityId;
	}
	public void setAccountingEntityId(String accountingEntityId) {
		this.accountingEntityId = accountingEntityId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
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
