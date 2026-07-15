package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-03-13 19:42:42
 */
public class DeliveryLogistics extends AlipayObject {

	private static final long serialVersionUID = 8543463368883742938L;

	/**
	 * WAIT_DELIVER:待发货，DELIVERED:已发货
	 */
	@ApiField("delivery_status")
	private String deliveryStatus;

	/**
	 * 物流公司编码
	 */
	@ApiField("express_company_code")
	private String expressCompanyCode;

	/**
	 * 物流公司名称
	 */
	@ApiField("express_company_name")
	private String expressCompanyName;

	/**
	 * 物流编号
	 */
	@ApiField("express_no")
	private String expressNo;

	public String getDeliveryStatus() {
		return this.deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getExpressCompanyCode() {
		return this.expressCompanyCode;
	}
	public void setExpressCompanyCode(String expressCompanyCode) {
		this.expressCompanyCode = expressCompanyCode;
	}

	public String getExpressCompanyName() {
		return this.expressCompanyName;
	}
	public void setExpressCompanyName(String expressCompanyName) {
		this.expressCompanyName = expressCompanyName;
	}

	public String getExpressNo() {
		return this.expressNo;
	}
	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

}
