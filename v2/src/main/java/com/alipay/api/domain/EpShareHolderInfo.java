package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 股东信息
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:26:03
 */
public class EpShareHolderInfo extends AlipayObject {

	private static final long serialVersionUID = 1869792457368637589L;

	/**
	 * 企业实缴明细
	 */
	@ApiField("paid_detail")
	private EpPaidDetailInfo paidDetail;

	/**
	 * 企业认缴明细
	 */
	@ApiField("paid_in_detail")
	private EpPaidInDetailInfo paidInDetail;

	/**
	 * 认缴额，单位万元
	 */
	@ApiField("paid_in_money")
	private String paidInMoney;

	/**
	 * 实缴额，单位万元
	 */
	@ApiField("paid_money")
	private String paidMoney;

	/**
	 * 股东名称
	 */
	@ApiField("share_holder")
	private String shareHolder;

	/**
	 * 股东类型
	 */
	@ApiField("share_holder_type")
	private String shareHolderType;

	/**
	 * 持股比
	 */
	@ApiField("share_holding_ratio")
	private String shareHoldingRatio;

	public EpPaidDetailInfo getPaidDetail() {
		return this.paidDetail;
	}
	public void setPaidDetail(EpPaidDetailInfo paidDetail) {
		this.paidDetail = paidDetail;
	}

	public EpPaidInDetailInfo getPaidInDetail() {
		return this.paidInDetail;
	}
	public void setPaidInDetail(EpPaidInDetailInfo paidInDetail) {
		this.paidInDetail = paidInDetail;
	}

	public String getPaidInMoney() {
		return this.paidInMoney;
	}
	public void setPaidInMoney(String paidInMoney) {
		this.paidInMoney = paidInMoney;
	}

	public String getPaidMoney() {
		return this.paidMoney;
	}
	public void setPaidMoney(String paidMoney) {
		this.paidMoney = paidMoney;
	}

	public String getShareHolder() {
		return this.shareHolder;
	}
	public void setShareHolder(String shareHolder) {
		this.shareHolder = shareHolder;
	}

	public String getShareHolderType() {
		return this.shareHolderType;
	}
	public void setShareHolderType(String shareHolderType) {
		this.shareHolderType = shareHolderType;
	}

	public String getShareHoldingRatio() {
		return this.shareHoldingRatio;
	}
	public void setShareHoldingRatio(String shareHoldingRatio) {
		this.shareHoldingRatio = shareHoldingRatio;
	}

}
