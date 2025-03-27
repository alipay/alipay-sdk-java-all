package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心付修改商户配置
 *
 * @author auto create
 * @since 1.0, 2025-01-16 10:39:09
 */
public class AlipayCommerceMerchantcardConfigModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2276297547983251628L;

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
