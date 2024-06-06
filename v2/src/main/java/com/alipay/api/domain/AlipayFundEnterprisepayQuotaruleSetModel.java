package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 因公付设置额度规则
 *
 * @author auto create
 * @since 1.0, 2023-11-28 16:48:39
 */
public class AlipayFundEnterprisepayQuotaruleSetModel extends AlipayObject {

	private static final long serialVersionUID = 6282834256975835366L;

	/**
	 * 企业签约共同账户ID
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
	 * 成员支付宝ID，当操作类型=MEMBER时，member_id和open_id必填其一
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 支付宝用户的openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 操作类型： ACCOUNT-账户（支持单笔，月） MEMBER-成员（支持单笔，日，月，季度，年，终身累计，自定义周期，一次性额度）
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 产品码，默认值 ENTERPRISE_PAY
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 额度列表：
额度类型不可重复。
额度金额：单位为元，精确到分（整数或小数点后两位及以内的小数）；金额设置为-1表示无限制额度（一次性额度不支持-1）。
	 */
	@ApiListField("quota_list")
	@ApiField("joint_account_quota_d_t_o")
	private List<JointAccountQuotaDTO> quotaList;

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

	public List<JointAccountQuotaDTO> getQuotaList() {
		return this.quotaList;
	}
	public void setQuotaList(List<JointAccountQuotaDTO> quotaList) {
		this.quotaList = quotaList;
	}

}
