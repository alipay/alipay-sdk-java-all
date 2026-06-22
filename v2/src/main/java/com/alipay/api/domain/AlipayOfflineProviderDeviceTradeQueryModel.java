package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 音响设备交易信息查询
 *
 * @author auto create
 * @since 1.0, 2026-06-16 14:14:42
 */
public class AlipayOfflineProviderDeviceTradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5139387777961486595L;

	/**
	 * 设备sn，传多个sn时用逗号进行分隔
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 查询开始时间与查询结束时间间隔不得超过6个月
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 间联商户id
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 查询开始时间与查询结束时间间隔不得超过6个月
	 */
	@ApiField("start_date")
	private Date startDate;

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
