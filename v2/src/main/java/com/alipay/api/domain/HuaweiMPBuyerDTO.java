package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 华为云买家DTO
 *
 * @author auto create
 * @since 1.0, 2025-04-21 09:59:57
 */
public class HuaweiMPBuyerDTO extends AlipayObject {

	private static final long serialVersionUID = 8445416635693788652L;

	/**
	 * 客户ID
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 客户名称
	 */
	@ApiField("customer_name")
	private String customerName;

	/**
	 * 通行证id
	 */
	@ApiField("passport_id")
	private String passportId;

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

}
