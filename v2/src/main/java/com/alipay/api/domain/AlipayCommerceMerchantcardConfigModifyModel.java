package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心付修改商户配置
 *
 * @author auto create
 * @since 1.0, 2024-11-15 16:07:19
 */
public class AlipayCommerceMerchantcardConfigModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8563317399695111277L;

	/**
	 * 安心付商户配置
	 */
	@ApiField("axf_merchant_config")
	private AxfMerchantConfig axfMerchantConfig;

	public AxfMerchantConfig getAxfMerchantConfig() {
		return this.axfMerchantConfig;
	}
	public void setAxfMerchantConfig(AxfMerchantConfig axfMerchantConfig) {
		this.axfMerchantConfig = axfMerchantConfig;
	}

}
