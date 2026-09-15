package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 通行费统计
 *
 * @author auto create
 * @since 1.0, 2026-08-24 14:19:50
 */
public class EtcTollFeeTollStatsDTO extends AlipayObject {

	private static final long serialVersionUID = 8281866571383696513L;

	/**
	 * 平均通行费(元）
	 */
	@ApiField("avg")
	private String avg;

	/**
	 * 最小通行费(元）
	 */
	@ApiField("max")
	private String max;

	/**
	 * 中位数通行费(元）
	 */
	@ApiField("median")
	private String median;

	/**
	 * 最小通行费(元）
	 */
	@ApiField("min")
	private String min;

	/**
	 * TOP three通行费分布 当前字段已废弃(废弃top3,和业务沟通只取top1)
	 */
	@ApiListField("top_three")
	@ApiField("etc_toll_fee_top_three_d_t_o")
	@Deprecated
	private List<EtcTollFeeTopThreeDTO> topThree;

	/**
	 * 众数通行费,单位(元)
	 */
	@ApiField("trip_fee")
	private String tripFee;

	public String getAvg() {
		return this.avg;
	}
	public void setAvg(String avg) {
		this.avg = avg;
	}

	public String getMax() {
		return this.max;
	}
	public void setMax(String max) {
		this.max = max;
	}

	public String getMedian() {
		return this.median;
	}
	public void setMedian(String median) {
		this.median = median;
	}

	public String getMin() {
		return this.min;
	}
	public void setMin(String min) {
		this.min = min;
	}

	public List<EtcTollFeeTopThreeDTO> getTopThree() {
		return this.topThree;
	}
	public void setTopThree(List<EtcTollFeeTopThreeDTO> topThree) {
		this.topThree = topThree;
	}

	public String getTripFee() {
		return this.tripFee;
	}
	public void setTripFee(String tripFee) {
		this.tripFee = tripFee;
	}

}
