package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商家人群
 *
 * @author auto create
 * @since 1.0, 2022-08-02 10:29:30
 */
public class AlipayMerchantQipanCrowdQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4599465667119561344L;

	/**
	 * 支付宝人群code
注意：external_crowd_code 和 crowd_code不能同时为空
	 */
	@ApiField("crowd_code")
	private String crowdCode;

	/**
	 * 商户外部用户人群code
用于标识商家人群，需保证同一商户下crowd_code唯一
注意：external_crowd_code 和 crowd_code不能同时为空
	 */
	@ApiField("external_crowd_code")
	private String externalCrowdCode;

	public String getCrowdCode() {
		return this.crowdCode;
	}
	public void setCrowdCode(String crowdCode) {
		this.crowdCode = crowdCode;
	}

	public String getExternalCrowdCode() {
		return this.externalCrowdCode;
	}
	public void setExternalCrowdCode(String externalCrowdCode) {
		this.externalCrowdCode = externalCrowdCode;
	}

}
