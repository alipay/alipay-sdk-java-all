package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PayForPrivilegeCardTemplateConfig;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.profile.set response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-13 20:56:32
 */
public class AlipayMerchantPayforprivilegeProfileSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1214915246964724972L;

	/** 
	 * 卡包充值卡面模板设置
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
