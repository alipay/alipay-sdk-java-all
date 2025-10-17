package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生意参谋(增长分析)-自助分析的自定义报表模块请求体
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:48
 */
public class OpenApiEventReportCommRequest extends AlipayObject {

	private static final long serialVersionUID = 1694913249985364467L;

	/**
	 * 由于自定义报表分析接口数据查询较大，如果查询的入参时间跨度较大，接口返回容易超时，故会返回此字段，用于带入下一次的同接口查询。
	 */
	@ApiField("async_query_id")
	private String asyncQueryId;

	/**
	 * 结束日期，不传默认取当前日期的前一天（T-1）的日期，比如今天20240102，则取值 20240101
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 事件名称，用于对事件概况数据的过滤
	 */
	@ApiListField("events")
	@ApiField("string")
	private List<String> events;

	/**
	 * 默认取当前操作的支付宝app_id，数据的主体依据条件，在查询其他端小程序数据的时候传入multi_app_id
	 */
	@ApiField("multi_app_id")
	private String multiAppId;

	/**
	 * 属性名列表，用于过滤和筛选事件分析详情数据,该参数目前仅用于事件分析详情接口
	 */
	@ApiListField("properties")
	@ApiField("string")
	private List<String> properties;

	/**
	 * 数据查询的开始时间，默认不传取最近一周的日期,根据endDate往前倒推7天取值
	 */
	@ApiField("start_date")
	private String startDate;

	public String getAsyncQueryId() {
		return this.asyncQueryId;
	}
	public void setAsyncQueryId(String asyncQueryId) {
		this.asyncQueryId = asyncQueryId;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public List<String> getEvents() {
		return this.events;
	}
	public void setEvents(List<String> events) {
		this.events = events;
	}

	public String getMultiAppId() {
		return this.multiAppId;
	}
	public void setMultiAppId(String multiAppId) {
		this.multiAppId = multiAppId;
	}

	public List<String> getProperties() {
		return this.properties;
	}
	public void setProperties(List<String> properties) {
		this.properties = properties;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
