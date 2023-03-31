package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充享惠业务配置设置
 *
 * @author auto create
 * @since 1.0, 2021-08-27 16:58:42
 */
public class AlipayMerchantPayforprivilegeProfileSetModel extends AlipayObject {

	private static final long serialVersionUID = 5441179497395815268L;

	/**
	 * 卡包充值卡面模板设置，用户使用充值业务领卡后会在支付宝卡包中使用该模板配置创建卡入口
	 */
	@ApiField("card_template_config")
	private PayForPrivilegeCardTemplateConfig cardTemplateConfig;

	public PayForPrivilegeCardTemplateConfig getCardTemplateConfig() {
		return this.cardTemplateConfig;
	}
	public void setCardTemplateConfig(PayForPrivilegeCardTemplateConfig cardTemplateConfig) {
		this.cardTemplateConfig = cardTemplateConfig;
	}

}
