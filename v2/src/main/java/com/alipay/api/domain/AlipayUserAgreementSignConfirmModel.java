package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝个人协议签约验证接口
 *
 * @author auto create
 * @since 1.0, 2019-05-15 10:45:13
 */
public class AlipayUserAgreementSignConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 2185283871913372998L;

	/**
	 * 代扣签约申请时，支付宝返回的签约申请token，商户可利用该值完成签约的确认。
	 */
	@ApiField("apply_token")
	private String applyToken;

	/**
	 * 支付宝用户的身份证后4位。
签约确认接口目前只有国际极简会校验身份证后4位。
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 能唯一确认用户身份的标识号，如：手机验证码等。
	 */
	@ApiField("confirm_no")
	private String confirmNo;

	public String getApplyToken() {
		return this.applyToken;
	}
	public void setApplyToken(String applyToken) {
		this.applyToken = applyToken;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getConfirmNo() {
		return this.confirmNo;
	}
	public void setConfirmNo(String confirmNo) {
		this.confirmNo = confirmNo;
	}

}
