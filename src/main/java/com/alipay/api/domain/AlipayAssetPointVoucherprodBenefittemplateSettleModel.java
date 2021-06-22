package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益模版结算
 *
 * @author auto create
 * @since 1.0, 2021-04-27 23:59:15
 */
public class AlipayAssetPointVoucherprodBenefittemplateSettleModel extends AlipayObject {

	private static final long serialVersionUID = 1894338124248769772L;

	/**
	 * 资产id，即权益模板id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 业务时间，即当前业务发生的时间
	 */
	@ApiField("biz_dt")
	private Date bizDt;

	/**
	 * 业务号，用于保证幂等，业务系统保证其唯一性
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 结算收款方账号
	 */
	@ApiField("partner_settle_id")
	private String partnerSettleId;

	/**
	 * 结算收款方的账号类型，LOGON_ID表示登录账号，USER_ID表示支付宝会员id
	 */
	@ApiField("partner_settle_id_type")
	private String partnerSettleIdType;

	/**
	 * 结算金额，单位元
	 */
	@ApiField("settle_amount")
	private String settleAmount;

	/**
	 * 结算日期，这笔结算业务的结算时间（可以与业务时间不同）
	 */
	@ApiField("settle_date")
	private Date settleDate;

	/**
	 * 支付宝会员id，需要结算的权益模版所属商户的支付宝会员id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public Date getBizDt() {
		return this.bizDt;
	}
	public void setBizDt(Date bizDt) {
		this.bizDt = bizDt;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getPartnerSettleId() {
		return this.partnerSettleId;
	}
	public void setPartnerSettleId(String partnerSettleId) {
		this.partnerSettleId = partnerSettleId;
	}

	public String getPartnerSettleIdType() {
		return this.partnerSettleIdType;
	}
	public void setPartnerSettleIdType(String partnerSettleIdType) {
		this.partnerSettleIdType = partnerSettleIdType;
	}

	public String getSettleAmount() {
		return this.settleAmount;
	}
	public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}

	public Date getSettleDate() {
		return this.settleDate;
	}
	public void setSettleDate(Date settleDate) {
		this.settleDate = settleDate;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
