package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 打款验证申请
 *
 * @author auto create
 * @since 1.0, 2019-12-10 21:49:50
 */
public class MybankPaymentTradeDepositVerifyApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6745187928745667657L;

	/**
	 * 待认证银行卡户名
	 */
	@ApiField("bank_card_name")
	private String bankCardName;

	/**
	 * 待认证银行卡号
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/**
	 * 人行联行号
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 成员机构会员ID
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 手机号码
用于接收打款验证通知短信
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 请求流水号，表示外部一次请求，幂等字段
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 业务场景编码，如需要由网商分配
	 */
	@ApiField("scene")
	private String scene;

	public String getBankCardName() {
		return this.bankCardName;
	}
	public void setBankCardName(String bankCardName) {
		this.bankCardName = bankCardName;
	}

	public String getBankCardNo() {
		return this.bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
