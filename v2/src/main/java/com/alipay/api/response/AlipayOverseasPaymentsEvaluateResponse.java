package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.payments.evaluate response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-16 19:08:32
 */
public class AlipayOverseasPaymentsEvaluateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8459259966125518486L;

	/** 
	 * 当业务返回码为错误码时，代表评估结果为失败；此时，支付方式侧会为此参数赋值，以引导用户进行下一步动作。
例如，当 sub_code = USER_BALANCE_NOT_ENOUGH 时，表示用户余额不足。此时，支付方式侧会返回此参数，提供引导用户进行充值或绑卡操作的链接。
	 */
	@ApiField("guide_url")
	private String guideUrl;

	public void setGuideUrl(String guideUrl) {
		this.guideUrl = guideUrl;
	}
	public String getGuideUrl( ) {
		return this.guideUrl;
	}

}
