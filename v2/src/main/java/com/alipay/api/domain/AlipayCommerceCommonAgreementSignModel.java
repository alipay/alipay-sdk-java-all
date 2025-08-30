package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业用户协议签约
 *
 * @author auto create
 * @since 1.0, 2023-11-20 13:42:11
 */
public class AlipayCommerceCommonAgreementSignModel extends AlipayObject {

	private static final long serialVersionUID = 6557551819233658321L;

	/**
	 * 约定值，参考业务接入文档
	 */
	@ApiField("agreement_code")
	private String agreementCode;

	/**
	 * 签约时间，毫秒级时间戳
out_sign_no+biz_date为请求幂等键，biz_date小于等于数据库值的签约请求幂等返回
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 用户open_id，用户在app_id下的唯一id，请优先使用open_id，user_id将逐步下线
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部签约号，app_id下唯一
	 */
	@ApiField("out_sign_no")
	private String outSignNo;

	/**
	 * 签约扩展内容，字段参考业务接入文档
	 */
	@ApiField("sign_content")
	private SignContentParams signContent;

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

	public SignContentParams getSignContent() {
		return this.signContent;
	}
	public void setSignContent(SignContentParams signContent) {
		this.signContent = signContent;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
