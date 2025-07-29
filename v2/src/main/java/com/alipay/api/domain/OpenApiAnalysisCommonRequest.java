package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营分析、经营概况公用入参
 *
 * @author auto create
 * @since 1.0, 2024-09-09 11:07:17
 */
public class OpenApiAnalysisCommonRequest extends AlipayObject {

	private static final long serialVersionUID = 3441578211158468458L;

	/**
	 * 可选，端类型，数据上报的端平台枚举，如不传则默认为ALIPAY
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 数据对比类型，可选择对比同期或不对比。不传则默认为NO_COMPARE不对比。
	 */
	@ApiField("compare_type")
	private String compareType;

	/**
	 * 查询统计的结束日期
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 可选，多端小程序appId，若端类型包含非支付宝端（即channel_type不等于ALIPAY）时，需要传入的其他端小程序ID
	 */
	@ApiField("multi_app_id")
	private String multiAppId;

	/**
	 * 可选，统计的开始时间，若选自定义时间粒度.开始日期必传。格式：YYYYMMDD
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 必填，时间粒度，单位 ：天 (day)
	 */
	@ApiField("time_granularity")
	private String timeGranularity;

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getCompareType() {
		return this.compareType;
	}
	public void setCompareType(String compareType) {
		this.compareType = compareType;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getMultiAppId() {
		return this.multiAppId;
	}
	public void setMultiAppId(String multiAppId) {
		this.multiAppId = multiAppId;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getTimeGranularity() {
		return this.timeGranularity;
	}
	public void setTimeGranularity(String timeGranularity) {
		this.timeGranularity = timeGranularity;
	}

}
