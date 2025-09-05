package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 失效商家人群包
 *
 * @author auto create
 * @since 1.0, 2024-11-18 16:44:36
 */
public class AlipayMerchantQipanCrowdInvalidModel extends AlipayObject {

	private static final long serialVersionUID = 7894974797595625789L;

	/**
	 * 支付宝人群code
	 */
	@ApiField("crowd_code")
	private String crowdCode;

	public String getCrowdCode() {
		return this.crowdCode;
	}
	public void setCrowdCode(String crowdCode) {
		this.crowdCode = crowdCode;
	}

}
