package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生态供应商订单费用明细
 *
 * @author auto create
 * @since 1.0, 2024-07-01 14:08:42
 */
public class AssetEcoFeeDetail extends AlipayObject {

	private static final long serialVersionUID = 3845332521144486215L;

	/**
	 * 账单主体
	 */
	@ApiField("bill_entity")
	private String billEntity;

	/**
	 * 费用金额 （单位元，四舍五入两位小数）
	 */
	@ApiField("fee_price")
	private String feePrice;

	/**
	 * 计费时间 （yyyy-MM-dd HH:mm:SS）
	 */
	@ApiField("fee_time")
	private String feeTime;

	/**
	 * 费用类型
	 */
	@ApiField("fee_type")
	private String feeType;

	/**
	 * 单笔费用不可结算原因
	 */
	@ApiField("unbill_reason")
	private String unbillReason;

	public String getBillEntity() {
		return this.billEntity;
	}
	public void setBillEntity(String billEntity) {
		this.billEntity = billEntity;
	}

	public String getFeePrice() {
		return this.feePrice;
	}
	public void setFeePrice(String feePrice) {
		this.feePrice = feePrice;
	}

	public String getFeeTime() {
		return this.feeTime;
	}
	public void setFeeTime(String feeTime) {
		this.feeTime = feeTime;
	}

	public String getFeeType() {
		return this.feeType;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public String getUnbillReason() {
		return this.unbillReason;
	}
	public void setUnbillReason(String unbillReason) {
		this.unbillReason = unbillReason;
	}

}
