package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户档案信息
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:29:52
 */
public class PartnerVO extends AlipayObject {

	private static final long serialVersionUID = 3282688572946489688L;

	/**
	 * 生效状态，EFFECTIVE：生效，INVALID：失效。
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 商户名称
	 */
	@ApiField("partner_name")
	private String partnerName;

	public String getBizStatus() {
		return this.bizStatus;
	}
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPartnerName() {
		return this.partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

}
