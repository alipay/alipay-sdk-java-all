package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁服务信息
 *
 * @author auto create
 * @since 1.0, 2024-01-26 16:16:39
 */
public class RentServiceInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2811841131746247419L;

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

}
