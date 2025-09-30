package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AxfMerchantConfig;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.config.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-16 10:39:44
 */
public class AlipayCommerceMerchantcardConfigBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5458354666168229493L;

	/** 
	 * 安心付商户配置
	 */
	@ApiListField("axf_merchant_config_list")
	@ApiField("axf_merchant_config")
	private List<AxfMerchantConfig> axfMerchantConfigList;

	public void setAxfMerchantConfigList(List<AxfMerchantConfig> axfMerchantConfigList) {
		this.axfMerchantConfigList = axfMerchantConfigList;
	}
	public List<AxfMerchantConfig> getAxfMerchantConfigList( ) {
		return this.axfMerchantConfigList;
	}

}
