package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流信息
 *
 * @author auto create
 * @since 1.0, 2026-08-25 10:08:47
 */
public class DeliveryLogistics extends AlipayObject {

	private static final long serialVersionUID = 6176351868281756557L;

	/**
	 * ALREADY_DELIVER:已发货，RECEIVED:已签收，SIGN_FAILED:签收失败
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

	/**
	 * 物流轨迹查看页面的跳转地址
	 */
	@ApiField("jump_url")
	private String jumpUrl;

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

	public String getJumpUrl() {
		return this.jumpUrl;
	}
	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

}
