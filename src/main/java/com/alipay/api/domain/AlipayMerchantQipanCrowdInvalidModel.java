package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 失效商家人群包
 *
 * @author auto create
 * @since 1.0, 2022-08-02 10:29:15
 */
public class AlipayMerchantQipanCrowdInvalidModel extends AlipayObject {

	private static final long serialVersionUID = 7729536945436942717L;

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
