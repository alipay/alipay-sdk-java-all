package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云值守门店事件同步
 *
 * @author auto create
 * @since 1.0, 2026-05-15 14:07:49
 */
public class AlipayMsaasMediarecogAivisionstoredAiretaileventSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2161847978636695771L;

	/**
	 * isv事件报备内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 触发时间
	 */
	@ApiField("date_time")
	private Date dateTime;

	/**
	 * isv pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * isv订单事件报备类型
	 */
	@ApiField("report_type")
	private String reportType;

	/**
	 * 门店唯一pid
	 */
	@ApiField("shop_pid")
	private String shopPid;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getDateTime() {
		return this.dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getReportType() {
		return this.reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getShopPid() {
		return this.shopPid;
	}
	public void setShopPid(String shopPid) {
		this.shopPid = shopPid;
	}

}
