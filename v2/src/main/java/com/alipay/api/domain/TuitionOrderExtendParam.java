package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学费码账单请求扩展参数
 *
 * @author auto create
 * @since 1.0, 2021-06-04 17:10:14
 */
public class TuitionOrderExtendParam extends AlipayObject {

	private static final long serialVersionUID = 4111368753594565562L;

	/**
	 * 支付后回跳地址
	 */
	@ApiField("returnback_url")
	private String returnbackUrl;

	public String getReturnbackUrl() {
		return this.returnbackUrl;
	}
	public void setReturnbackUrl(String returnbackUrl) {
		this.returnbackUrl = returnbackUrl;
	}

}
