package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询额度信息
 *
 * @author auto create
 * @since 1.0, 2025-04-07 17:06:24
 */
public class AlipayFundEnterprisepayQuotaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3825822481535398634L;

	/**
	 * 企业签约账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 平台和企业的三方授权协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 场景码，联系支付宝分配
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 用户支付宝ID，当操作类型=MEMBER时， member_id和open_id必填其一
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 支付宝用户的openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 操作类型：
ACCOUNT-账户
MEMBER-成员
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 产品码，默认值 ENTERPRISE_PAY
	 */
	@ApiField("product_code")
	private String productCode;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
