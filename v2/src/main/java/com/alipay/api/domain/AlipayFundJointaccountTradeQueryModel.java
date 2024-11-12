package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 共同账户交易查询
 *
 * @author auto create
 * @since 1.0, 2023-03-07 21:41:16
 */
public class AlipayFundJointaccountTradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3569513981535296354L;

	/**
	 * 企业账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 三方授权协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 成员ID，消费发起人
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 消费发起人的openId
	 */
	@ApiField("member_open_id")
	private String memberOpenId;

	/**
	 * 外部平台订单号。使用该参数查询时，返回结果见trade_info_list
	 */
	@ApiField("platform_order_id")
	private String platformOrderId;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 支付宝交易订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberOpenId() {
		return this.memberOpenId;
	}
	public void setMemberOpenId(String memberOpenId) {
		this.memberOpenId = memberOpenId;
	}

	public String getPlatformOrderId() {
		return this.platformOrderId;
	}
	public void setPlatformOrderId(String platformOrderId) {
		this.platformOrderId = platformOrderId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
