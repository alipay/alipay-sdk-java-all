package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.userverify.apply response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-08 14:02:30
 */
public class AlipayUserAgreementUserverifyApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7883999345143294444L;

	/** 
	 * 用户验证申请token，其格式和内容，由支付宝定义。在鉴权确认的过程中，商户可根据申请操作成功时返回的申请token，获取后续的买家结果
	 */
	@ApiField("apply_token")
	private String applyToken;

	public void setApplyToken(String applyToken) {
		this.applyToken = applyToken;
	}
	public String getApplyToken( ) {
		return this.applyToken;
	}

}
