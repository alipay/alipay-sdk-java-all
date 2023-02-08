package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券计算条件
 *
 * @author auto create
 * @since 1.0, 2022-12-22 11:22:22
 */
public class VcpCalcCondition extends AlipayObject {

	private static final long serialVersionUID = 3532346767311782348L;

	/**
	 * 前置条件，如买A送B这类优惠，A则是B享受优惠的前置条件
	 */
	@ApiListField("condition_item_ids")
	@ApiField("string")
	private List<String> conditionItemIds;

	/**
	 * 金额下限
	 */
	@ApiField("from_amount")
	private String fromAmount;

	/**
	 * 起始时间
	 */
	@ApiField("from_time")
	private Date fromTime;

	/**
	 * 商品Id列表
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	/**
	 * 门槛金额类型
	 */
	@ApiField("threshold_amount_type")
	private String thresholdAmountType;

	/**
	 * 商品数量
	 */
	@ApiField("threshold_count")
	private Long thresholdCount;

	/**
	 * 金额上限
	 */
	@ApiField("to_amount")
	private String toAmount;

	/**
	 * 结束时间
	 */
	@ApiField("to_time")
	private Date toTime;

	public List<String> getConditionItemIds() {
		return this.conditionItemIds;
	}
	public void setConditionItemIds(List<String> conditionItemIds) {
		this.conditionItemIds = conditionItemIds;
	}

	public String getFromAmount() {
		return this.fromAmount;
	}
	public void setFromAmount(String fromAmount) {
		this.fromAmount = fromAmount;
	}

	public Date getFromTime() {
		return this.fromTime;
	}
	public void setFromTime(Date fromTime) {
		this.fromTime = fromTime;
	}

	public List<String> getItemIds() {
		return this.itemIds;
	}
	public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}

	public String getThresholdAmountType() {
		return this.thresholdAmountType;
	}
	public void setThresholdAmountType(String thresholdAmountType) {
		this.thresholdAmountType = thresholdAmountType;
	}

	public Long getThresholdCount() {
		return this.thresholdCount;
	}
	public void setThresholdCount(Long thresholdCount) {
		this.thresholdCount = thresholdCount;
	}

	public String getToAmount() {
		return this.toAmount;
	}
	public void setToAmount(String toAmount) {
		this.toAmount = toAmount;
	}

	public Date getToTime() {
		return this.toTime;
	}
	public void setToTime(Date toTime) {
		this.toTime = toTime;
	}

}
