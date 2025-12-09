package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模版查询
 *
 * @author auto create
 * @since 1.0, 2024-02-28 09:49:39
 */
public class AlipayCommerceCardTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1866118619266524266L;

	/**
	 * 卡模版ID
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

}
