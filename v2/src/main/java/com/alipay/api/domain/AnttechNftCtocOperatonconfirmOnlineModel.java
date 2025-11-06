package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 藏品上架下架登记二次调用接口
 *
 * @author auto create
 * @since 1.0, 2025-07-02 21:06:42
 */
public class AnttechNftCtocOperatonconfirmOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 3761788442824317295L;

	/**
	 * 短信验证码
	 */
	@ApiField("confirm_code")
	private String confirmCode;

	/**
	 * 认证事件id
	 */
	@ApiField("verify_event_id")
	private String verifyEventId;

	public String getConfirmCode() {
		return this.confirmCode;
	}
	public void setConfirmCode(String confirmCode) {
		this.confirmCode = confirmCode;
	}

	public String getVerifyEventId() {
		return this.verifyEventId;
	}
	public void setVerifyEventId(String verifyEventId) {
		this.verifyEventId = verifyEventId;
	}

}
