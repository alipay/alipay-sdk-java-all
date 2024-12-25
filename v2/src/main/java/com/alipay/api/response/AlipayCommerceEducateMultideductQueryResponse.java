package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.multideduct.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-15 14:42:20
 */
public class AlipayCommerceEducateMultideductQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6475964371652584537L;

	/** 
	 * 支付宝协议支付的协议号。OPEN时返回
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 校园支付开通状态。可选的字段枚举说明：{WAIT_SIGN_AGREEMENT:待签约协议支付;OPEN:校园支付开通;CLOSE:校园支付关闭}
	 */
	@ApiField("agreement_status")
	private String agreementStatus;

	/** 
	 * 资产信息，入参token上送的时候才会返回
	 */
	@ApiField("asset")
	private String asset;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 学校或教育机构内标
	 */
	@ApiField("school_code")
	private String schoolCode;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 学生或教职工在学校（或教育机构）的唯一编号。使用校园支付token查询时，返回当前字段
	 */
	@ApiField("user_unique_id")
	private String userUniqueId;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setAgreementStatus(String agreementStatus) {
		this.agreementStatus = agreementStatus;
	}
	public String getAgreementStatus( ) {
		return this.agreementStatus;
	}

	public void setAsset(String asset) {
		this.asset = asset;
	}
	public String getAsset( ) {
		return this.asset;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}
	public String getSchoolCode( ) {
		return this.schoolCode;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setUserUniqueId(String userUniqueId) {
		this.userUniqueId = userUniqueId;
	}
	public String getUserUniqueId( ) {
		return this.userUniqueId;
	}

}
