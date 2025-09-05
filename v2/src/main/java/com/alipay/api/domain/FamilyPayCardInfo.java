package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 亲情卡卡信息模型
 *
 * @author auto create
 * @since 1.0, 2023-04-11 17:30:38
 */
public class FamilyPayCardInfo extends AlipayObject {

	private static final long serialVersionUID = 5816694243396822659L;

	/**
	 * 代扣协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 亲情卡唯一id
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 亲情卡领取时间（亲情卡生效激活生效时间）
	 */
	@ApiField("gmt_valid")
	private String gmtValid;

	/**
	 * 商户侧签约流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 赠卡人支付宝用户id
	 */
	@ApiField("payer_id")
	private String payerId;

	/**
	 * 赠卡人支付宝用户id
	 */
	@ApiField("payer_open_id")
	private String payerOpenId;

	/**
	 * 亲情卡额度信息
	 */
	@ApiField("quota")
	private FamilyPayQuotaInfo quota;

	/**
	 * 亲情卡剩余额度（单位:元）
	 */
	@ApiField("quota_remain")
	private String quotaRemain;

	/**
	 * 额度支付（单位:元）
	 */
	@ApiField("quota_used")
	private String quotaUsed;

	/**
	 * 收卡人支付宝id
	 */
	@ApiField("spender_id")
	private String spenderId;

	/**
	 * 收卡人支付宝id
	 */
	@ApiField("spender_open_id")
	private String spenderOpenId;

	/**
	 * 签约状态
	 */
	@ApiField("status")
	private String status;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getGmtValid() {
		return this.gmtValid;
	}
	public void setGmtValid(String gmtValid) {
		this.gmtValid = gmtValid;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPayerId() {
		return this.payerId;
	}
	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}

	public String getPayerOpenId() {
		return this.payerOpenId;
	}
	public void setPayerOpenId(String payerOpenId) {
		this.payerOpenId = payerOpenId;
	}

	public FamilyPayQuotaInfo getQuota() {
		return this.quota;
	}
	public void setQuota(FamilyPayQuotaInfo quota) {
		this.quota = quota;
	}

	public String getQuotaRemain() {
		return this.quotaRemain;
	}
	public void setQuotaRemain(String quotaRemain) {
		this.quotaRemain = quotaRemain;
	}

	public String getQuotaUsed() {
		return this.quotaUsed;
	}
	public void setQuotaUsed(String quotaUsed) {
		this.quotaUsed = quotaUsed;
	}

	public String getSpenderId() {
		return this.spenderId;
	}
	public void setSpenderId(String spenderId) {
		this.spenderId = spenderId;
	}

	public String getSpenderOpenId() {
		return this.spenderOpenId;
	}
	public void setSpenderOpenId(String spenderOpenId) {
		this.spenderOpenId = spenderOpenId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
