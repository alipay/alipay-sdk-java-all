package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行卡认证接口
 *
 * @author auto create
 * @since 1.0, 2021-03-12 10:26:06
 */
public class HuanxuTradeAccountserviceCardCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 7512833543894871783L;

	/**
	 * 银行卡信息
	 */
	@ApiField("bank_info")
	private BankInfo bankInfo;

	/**
	 * 认证请求号，对应一笔交易下的一次认证请求，不同认证请求需保证请求号唯一
	 */
	@ApiField("certify_request_no")
	private String certifyRequestNo;

	/**
	 * 业务类型
	 */
	@ApiField("trade_type")
	private String tradeType;

	/**
	 * 用户信息
	 */
	@ApiField("user_info")
	private UserIdentity userInfo;

	/**
	 * 用户类型：买家（BUYER）或卖家（SELLER）
	 */
	@ApiField("user_type")
	private String userType;

	/**
	 * 验证金额，单位为元，精确到小数点后两位，取值范围[0.01,0.5)
	 */
	@ApiField("validate_amount")
	private String validateAmount;

	public BankInfo getBankInfo() {
		return this.bankInfo;
	}
	public void setBankInfo(BankInfo bankInfo) {
		this.bankInfo = bankInfo;
	}

	public String getCertifyRequestNo() {
		return this.certifyRequestNo;
	}
	public void setCertifyRequestNo(String certifyRequestNo) {
		this.certifyRequestNo = certifyRequestNo;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public UserIdentity getUserInfo() {
		return this.userInfo;
	}
	public void setUserInfo(UserIdentity userInfo) {
		this.userInfo = userInfo;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getValidateAmount() {
		return this.validateAmount;
	}
	public void setValidateAmount(String validateAmount) {
		this.validateAmount = validateAmount;
	}

}
