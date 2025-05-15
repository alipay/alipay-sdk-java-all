package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 权益使用规则描述
 *
 * @author auto create
 * @since 1.0, 2018-11-28 11:48:31
 */
public class MEquityUseRule extends AlipayObject {

	private static final long serialVersionUID = 2323823761892946617L;

	/**
	 * 权益不可用时段信息，不可用时间段只支持周期维度DAY类型，举例：指定日期2018-12-12至2018-12-22时间段不可用，数据结构为：{"timeDimensionType":"DAY","times":"2018-12-12,2018-12-22"}，目前列表数据最多支持5组
	 */
	@ApiListField("disabled_times")
	@ApiField("m_time_control_info")
	private List<MTimeControlInfo> disabledTimes;

	/**
	 * 使用权益最低消费金额(单位:分)，最低消费金额范围1~499999的整数
	 */
	@ApiField("min_cost_amount")
	private String minCostAmount;

	/**
	 * 权益适用的商品
	 */
	@ApiListField("suit_item_list")
	@ApiField("m_item_info")
	private List<MItemInfo> suitItemList;

	/**
	 * 权益可用时段信息，可用时间段只支持周期维度WEEK类型，举例：
每周一、周二、周日的06:00:00~07:04:59时间段可用，数据结构为：{"timeDimensionType":"WEEK","times":"06:00:00,07:04:59","values":"1,2,7"}，目前支持最多设置5组时间
	 */
	@ApiListField("usaged_times")
	@ApiField("m_time_control_info")
	private List<MTimeControlInfo> usagedTimes;

	public List<MTimeControlInfo> getDisabledTimes() {
		return this.disabledTimes;
	}
	public void setDisabledTimes(List<MTimeControlInfo> disabledTimes) {
		this.disabledTimes = disabledTimes;
	}

	public String getMinCostAmount() {
		return this.minCostAmount;
	}
	public void setMinCostAmount(String minCostAmount) {
		this.minCostAmount = minCostAmount;
	}

	public List<MItemInfo> getSuitItemList() {
		return this.suitItemList;
	}
	public void setSuitItemList(List<MItemInfo> suitItemList) {
		this.suitItemList = suitItemList;
	}

	public List<MTimeControlInfo> getUsagedTimes() {
		return this.usagedTimes;
	}
	public void setUsagedTimes(List<MTimeControlInfo> usagedTimes) {
		this.usagedTimes = usagedTimes;
	}

}
