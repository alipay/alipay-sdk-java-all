package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生意参谋-自定义分析报表的数据返回体
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:48
 */
public class OpenApiEventReportItemVO extends AlipayObject {

	private static final long serialVersionUID = 8725423837615861698L;

	/**
	 * 业务日期
	 */
	@ApiField("dt")
	private String dt;

	/**
	 * 事件名称
	 */
	@ApiField("event")
	private String event;

	/**
	 * 访问人数
	 */
	@ApiField("people_count")
	private Long peopleCount;

	/**
	 * 访问次数
	 */
	@ApiField("people_visit_count")
	private Long peopleVisitCount;

	/**
	 * 人均访问次数=访问次数/访问人数
	 */
	@ApiField("people_visit_count_avg")
	private String peopleVisitCountAvg;

	/**
	 * 属性名称
	 */
	@ApiField("property")
	private String property;

	/**
	 * property_value
	 */
	@ApiField("property_value")
	private String propertyValue;

	public String getDt() {
		return this.dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}

	public String getEvent() {
		return this.event;
	}
	public void setEvent(String event) {
		this.event = event;
	}

	public Long getPeopleCount() {
		return this.peopleCount;
	}
	public void setPeopleCount(Long peopleCount) {
		this.peopleCount = peopleCount;
	}

	public Long getPeopleVisitCount() {
		return this.peopleVisitCount;
	}
	public void setPeopleVisitCount(Long peopleVisitCount) {
		this.peopleVisitCount = peopleVisitCount;
	}

	public String getPeopleVisitCountAvg() {
		return this.peopleVisitCountAvg;
	}
	public void setPeopleVisitCountAvg(String peopleVisitCountAvg) {
		this.peopleVisitCountAvg = peopleVisitCountAvg;
	}

	public String getProperty() {
		return this.property;
	}
	public void setProperty(String property) {
		this.property = property;
	}

	public String getPropertyValue() {
		return this.propertyValue;
	}
	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}

}
