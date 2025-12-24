package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于传递用户和支付宝的协议相关信息，json格式
 *
 * @author auto create
 * @since 1.0, 2023-04-27 16:59:14
 */
public class AgreementParams extends AlipayObject {

	private static final long serialVersionUID = 4353973943534551947L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 鉴权申请token，其格式和内容，由支付宝定义。在需要做支付鉴权校验时，该参数不能为空。
	 */
	@ApiField("apply_token")
	private String applyToken;

	/**
	 * 鉴权确认码，在需要做支付鉴权校验时，该参数不能为空
	 */
	@ApiField("auth_confirm_no")
	private String authConfirmNo;

	/**
	 * 商户代扣扣款许可
	 */
	@ApiField("deduct_permission")
	private String deductPermission;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getApplyToken() {
		return this.applyToken;
	}
	public void setApplyToken(String applyToken) {
		this.applyToken = applyToken;
	}

	public String getAuthConfirmNo() {
		return this.authConfirmNo;
	}
	public void setAuthConfirmNo(String authConfirmNo) {
		this.authConfirmNo = authConfirmNo;
	}

	public String getDeductPermission() {
		return this.deductPermission;
	}
	public void setDeductPermission(String deductPermission) {
		this.deductPermission = deductPermission;
	}

}
