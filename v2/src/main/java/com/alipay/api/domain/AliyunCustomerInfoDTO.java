package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阿里云客户信息DTO
 *
 * @author auto create
 * @since 1.0, 2025-04-21 09:59:47
 */
public class AliyunCustomerInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6473676527595643414L;

	/**
	 * 客户CID信息
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * 用于保存客户名称
	 */
	@ApiField("customer_name")
	private String customerName;

	/**
	 * 用户ID信息
	 */
	@ApiField("user_id")
	private String userId;

	public String getCid() {
		return this.cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
