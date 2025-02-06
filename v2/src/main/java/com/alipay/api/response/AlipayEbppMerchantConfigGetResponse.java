package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantInstConfig;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.merchant.config.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:56
 */
public class AlipayEbppMerchantConfigGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5115766255868813623L;

	/** 
	 * 商户机构配置信息
	 */
	@ApiListField("inst_configs")
	@ApiField("merchant_inst_config")
	private List<MerchantInstConfig> instConfigs;

	/** 
	 * 商户的用户ID
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	public void setInstConfigs(List<MerchantInstConfig> instConfigs) {
		this.instConfigs = instConfigs;
	}
	public List<MerchantInstConfig> getInstConfigs( ) {
		return this.instConfigs;
	}

	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}
	public String getMerchantUserId( ) {
		return this.merchantUserId;
	}

}
