package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁服务信息
 *
 * @author auto create
 * @since 1.0, 2025-12-19 17:10:59
 */
public class RentServiceInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5549879537811488219L;

	/**
	 * 借贷专户ID
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/**
	 * 账户余额
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 服务编号
	 */
	@ApiField("service_no")
	private String serviceNo;

	/**
	 * 当前租赁服务是否有效
	 */
	@ApiField("status")
	private String status;

	public String getAccountBookId() {
		return this.accountBookId;
	}
	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}

	public String getAvailableAmount() {
		return this.availableAmount;
	}
	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

	public String getServiceNo() {
		return this.serviceNo;
	}
	public void setServiceNo(String serviceNo) {
		this.serviceNo = serviceNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
