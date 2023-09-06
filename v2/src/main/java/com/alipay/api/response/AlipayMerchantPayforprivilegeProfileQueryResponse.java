package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PayForPrivilegeCardTemplateConfig;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.profile.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 20:04:35
 */
public class AlipayMerchantPayforprivilegeProfileQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3123237371772971897L;

	/** 
	 * 卡包充值卡面详情模板设置
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
