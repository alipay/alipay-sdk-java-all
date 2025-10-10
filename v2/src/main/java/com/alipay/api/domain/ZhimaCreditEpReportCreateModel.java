package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用报告创建
 *
 * @author auto create
 * @since 1.0, 2025-08-18 11:12:48
 */
public class ZhimaCreditEpReportCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8316552316229647563L;

	/**
	 * 合作方客户id
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 出具报告的企业证件号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 所出具报告的企业名称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 报告订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 合作方订单号，在同一个合作场景下需保持唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 报告价格。单位人民币元
	 */
	@ApiField("report_amount")
	private String reportAmount;

	/**
	 * 报告场景码，不同合作方场景码不同。找对接的产品负责人获取相应场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getReportAmount() {
		return this.reportAmount;
	}
	public void setReportAmount(String reportAmount) {
		this.reportAmount = reportAmount;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
