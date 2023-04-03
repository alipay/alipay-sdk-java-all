package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO签约关单
 *
 * @author auto create
 * @since 1.0, 2022-11-15 21:22:14
 */
public class ZhimaCreditPeZmgoBizoptCloseModel extends AlipayObject {

	private static final long serialVersionUID = 7471671864483985361L;

	/**
	 * 支付宝用户Id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 支付宝用户Id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户本次操作的请求流水号，由商户生成，请确保唯一性
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户Id
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 芝麻GO配置模板Id
	 */
	@ApiField("template_id")
	private String templateId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
