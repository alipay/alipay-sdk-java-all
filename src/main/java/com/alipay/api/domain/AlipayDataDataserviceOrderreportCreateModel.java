package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 线下媒体订单报表数据回传
 *
 * @author auto create
 * @since 1.0, 2022-07-14 11:08:06
 */
public class AlipayDataDataserviceOrderreportCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6899938632874279719L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 订单报表数据
	 */
	@ApiListField("data")
	@ApiField("report_data")
	private List<ReportData> data;

	/**
	 * 外部平台订单id
	 */
	@ApiField("order_outer_id")
	private String orderOuterId;

	/**
	 * 订单数据报表日期
	 */
	@ApiField("report_date")
	private String reportDate;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public List<ReportData> getData() {
		return this.data;
	}
	public void setData(List<ReportData> data) {
		this.data = data;
	}

	public String getOrderOuterId() {
		return this.orderOuterId;
	}
	public void setOrderOuterId(String orderOuterId) {
		this.orderOuterId = orderOuterId;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

}
