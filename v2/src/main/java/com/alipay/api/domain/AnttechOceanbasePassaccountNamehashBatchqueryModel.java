package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询账号哈希状态
 *
 * @author auto create
 * @since 1.0, 2026-09-29 10:43:16
 */
public class AnttechOceanbasePassaccountNamehashBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1232581692146513923L;

	/**
	 * 账号名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 账号类型
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 所有状态
	 */
	@ApiField("name_hash_status")
	private String nameHashStatus;

	/**
	 * 页数
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 一页返回数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 通行证id
	 */
	@ApiField("passport_id")
	private String passportId;

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getNameHashStatus() {
		return this.nameHashStatus;
	}
	public void setNameHashStatus(String nameHashStatus) {
		this.nameHashStatus = nameHashStatus;
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

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

}
