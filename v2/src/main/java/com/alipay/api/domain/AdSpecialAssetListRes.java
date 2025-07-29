package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 冻结单信息
 *
 * @author auto create
 * @since 1.0, 2025-07-14 17:59:17
 */
public class AdSpecialAssetListRes extends AlipayObject {

	private static final long serialVersionUID = 4115687195775771788L;

	/**
	 * 冻结单余额
	 */
	@ApiField("available_unfreeze_amount")
	private String availableUnfreezeAmount;

	/**
	 * 冻结单id
	 */
	@ApiField("rtb_freeze_order_id")
	private String rtbFreezeOrderId;

	/**
	 * 冻结单名称
	 */
	@ApiField("special_name")
	private String specialName;

	/**
	 * 冻结单的状态
	 */
	@ApiField("status")
	private String status;

	public String getAvailableUnfreezeAmount() {
		return this.availableUnfreezeAmount;
	}
	public void setAvailableUnfreezeAmount(String availableUnfreezeAmount) {
		this.availableUnfreezeAmount = availableUnfreezeAmount;
	}

	public String getRtbFreezeOrderId() {
		return this.rtbFreezeOrderId;
	}
	public void setRtbFreezeOrderId(String rtbFreezeOrderId) {
		this.rtbFreezeOrderId = rtbFreezeOrderId;
	}

	public String getSpecialName() {
		return this.specialName;
	}
	public void setSpecialName(String specialName) {
		this.specialName = specialName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
