package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签署平台商户配置信息同步
 *
 * @author auto create
 * @since 1.0, 2020-03-30 14:15:36
 */
public class AlipayEcoContractMerchantSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7884346992769429211L;

	/**
	 * 业务编号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 商家配置信息
	 */
	@ApiListField("merchant_configs")
	@ApiField("merchant_config_request")
	private List<MerchantConfigRequest> merchantConfigs;

	/**
	 * 签署平台的代码
	 */
	@ApiField("sign_platform_code")
	private String signPlatformCode;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public List<MerchantConfigRequest> getMerchantConfigs() {
		return this.merchantConfigs;
	}
	public void setMerchantConfigs(List<MerchantConfigRequest> merchantConfigs) {
		this.merchantConfigs = merchantConfigs;
	}

	public String getSignPlatformCode() {
		return this.signPlatformCode;
	}
	public void setSignPlatformCode(String signPlatformCode) {
		this.signPlatformCode = signPlatformCode;
	}

}
