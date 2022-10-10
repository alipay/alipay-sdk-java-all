package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 点餐设置中每一个店铺的预点餐配置信息
 *
 * @author auto create
 * @since 1.0, 2020-08-07 14:48:03
 */
public class PreOrderConfigInfo extends AlipayObject {

	private static final long serialVersionUID = 6842598847792752636L;

	/**
	 * OPEN表示打开点餐服务 CLOSED表示关闭点餐服务，不传表示不做更新
	 */
	@ApiField("pre_order_status")
	private String preOrderStatus;

	/**
	 * 最早可提前预订时间，格式: hh:mm，如：00:15，表示15分钟；02:00，表示2个小时。不设置默认为提前5分钟，00:05。
	 */
	@ApiField("time_before")
	private String timeBefore;

	/**
	 * 自提时段配置列表,按照周规则设置
	 */
	@ApiListField("time_period_config_list")
	@ApiField("time_period_config")
	private List<TimePeriodConfig> timePeriodConfigList;

	public String getPreOrderStatus() {
		return this.preOrderStatus;
	}
	public void setPreOrderStatus(String preOrderStatus) {
		this.preOrderStatus = preOrderStatus;
	}

	public String getTimeBefore() {
		return this.timeBefore;
	}
	public void setTimeBefore(String timeBefore) {
		this.timeBefore = timeBefore;
	}

	public List<TimePeriodConfig> getTimePeriodConfigList() {
		return this.timePeriodConfigList;
	}
	public void setTimePeriodConfigList(List<TimePeriodConfig> timePeriodConfigList) {
		this.timePeriodConfigList = timePeriodConfigList;
	}

}
