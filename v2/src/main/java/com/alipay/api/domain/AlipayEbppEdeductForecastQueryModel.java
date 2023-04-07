package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝直连代扣批次预测前置咨询
 *
 * @author auto create
 * @since 1.0, 2021-01-22 17:42:00
 */
public class AlipayEbppEdeductForecastQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1687772545683154769L;

	/**
	 * 该扣款批次总金额
	 */
	@ApiField("batch_order_amount")
	private String batchOrderAmount;

	/**
	 * 当前批次的订单总数
	 */
	@ApiField("batch_order_counts")
	private Long batchOrderCounts;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 出账机构（如果填了就是到出账机构粒度，如果没填就是到销账机构粒度）
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 销账机构（缴费业务必填，其他业务选填）
	 */
	@ApiField("chargeoff_inst")
	private String chargeoffInst;

	/**
	 * 代扣扣款日期
	 */
	@ApiField("deduct_date")
	private String deductDate;

	/**
	 * 子业务类型
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public String getBatchOrderAmount() {
		return this.batchOrderAmount;
	}
	public void setBatchOrderAmount(String batchOrderAmount) {
		this.batchOrderAmount = batchOrderAmount;
	}

	public Long getBatchOrderCounts() {
		return this.batchOrderCounts;
	}
	public void setBatchOrderCounts(Long batchOrderCounts) {
		this.batchOrderCounts = batchOrderCounts;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getChargeInst() {
		return this.chargeInst;
	}
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	public String getChargeoffInst() {
		return this.chargeoffInst;
	}
	public void setChargeoffInst(String chargeoffInst) {
		this.chargeoffInst = chargeoffInst;
	}

	public String getDeductDate() {
		return this.deductDate;
	}
	public void setDeductDate(String deductDate) {
		this.deductDate = deductDate;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
