package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业用户协议解约
 *
 * @author auto create
 * @since 1.0, 2023-11-21 16:34:50
 */
public class AlipayCommerceCommonAgreementUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 4271933813523448997L;

	/**
	 * 与签约传值相同
	 */
	@ApiField("agreement_code")
	private String agreementCode;

	/**
	 * 解约时间，毫秒级时间戳
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 用户在app_id下的唯一id，请优先使用open_id，user_id将逐步下线
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部签约号，与签约时传值相同
	 */
	@ApiField("out_sign_no")
	private String outSignNo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgreementCode() {
		return this.agreementCode;
	}
	public void setAgreementCode(String agreementCode) {
		this.agreementCode = agreementCode;
	}

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutSignNo() {
		return this.outSignNo;
	}
	public void setOutSignNo(String outSignNo) {
		this.outSignNo = outSignNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
