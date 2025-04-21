package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 离线计量同步对象
 *
 * @author auto create
 * @since 1.0, 2024-01-25 09:32:42
 */
public class RaasMeterSyncData extends AlipayObject {

	private static final long serialVersionUID = 7191245852849739292L;

	/**
	 * 聚合的项
	 */
	@ApiField("aggregate_term")
	private String aggregateTerm;

	/**
	 * 聚合的值
	 */
	@ApiField("aggregate_value")
	private String aggregateValue;

	/**
	 * 计量项
	 */
	@ApiField("amount_term")
	private String amountTerm;

	/**
	 * 业务描述
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 计量上报的渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 计量数
	 */
	@ApiField("count")
	private String count;

	/**
	 * 唯一键
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 上报结束时间
	 */
	@ApiField("gmt_end_time")
	private String gmtEndTime;

	/**
	 * 上报开始时间
	 */
	@ApiField("gmt_start_time")
	private String gmtStartTime;

	/**
	 * 计量域的值，用于映射计费使用的
	 */
	@ApiField("meter_domain")
	private String meterDomain;

	/**
	 * 产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 上报的站点
	 */
	@ApiField("site")
	private String site;

	/**
	 * 状态值
	 */
	@ApiField("status")
	private String status;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	/**
	 * 时间分区
	 */
	@ApiField("time_partition")
	private String timePartition;

	/**
	 * 时区
	 */
	@ApiField("time_zone")
	private String timeZone;

	public String getAggregateTerm() {
		return this.aggregateTerm;
	}
	public void setAggregateTerm(String aggregateTerm) {
		this.aggregateTerm = aggregateTerm;
	}

	public String getAggregateValue() {
		return this.aggregateValue;
	}
	public void setAggregateValue(String aggregateValue) {
		this.aggregateValue = aggregateValue;
	}

	public String getAmountTerm() {
		return this.amountTerm;
	}
	public void setAmountTerm(String amountTerm) {
		this.amountTerm = amountTerm;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCount() {
		return this.count;
	}
	public void setCount(String count) {
		this.count = count;
	}

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getGmtEndTime() {
		return this.gmtEndTime;
	}
	public void setGmtEndTime(String gmtEndTime) {
		this.gmtEndTime = gmtEndTime;
	}

	public String getGmtStartTime() {
		return this.gmtStartTime;
	}
	public void setGmtStartTime(String gmtStartTime) {
		this.gmtStartTime = gmtStartTime;
	}

	public String getMeterDomain() {
		return this.meterDomain;
	}
	public void setMeterDomain(String meterDomain) {
		this.meterDomain = meterDomain;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	public String getTimePartition() {
		return this.timePartition;
	}
	public void setTimePartition(String timePartition) {
		this.timePartition = timePartition;
	}

	public String getTimeZone() {
		return this.timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

}
