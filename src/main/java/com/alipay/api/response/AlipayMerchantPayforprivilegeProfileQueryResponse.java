package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PayForPrivilegeCardTemplateConfig;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.profile.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-25 20:40:02
 */
public class AlipayMerchantPayforprivilegeProfileQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3522175259444675929L;

	/** 
	 * 充享惠卡模板设置
	 */
	@ApiField("card_template_config")
	private PayForPrivilegeCardTemplateConfig cardTemplateConfig;

	public void setCardTemplateConfig(PayForPrivilegeCardTemplateConfig cardTemplateConfig) {
		this.cardTemplateConfig = cardTemplateConfig;
	}
	public PayForPrivilegeCardTemplateConfig getCardTemplateConfig( ) {
		return this.cardTemplateConfig;
	}

}
