package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 日账单创建
 *
 * @author auto create
 * @since 1.0, 2025-07-07 13:09:33
 */
public class AlipayUserDtbankDailybillCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3561336681157261658L;

	/**
	 * 活动来源
【注意事项】bill_source表示活动来源，供银行查询服务商或小二为其配置活动的账单，服务商可忽略不传
	 */
	@ApiField("bill_source")
	private String billSource;

	/**
	 * 申请查询的账单类型
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getBillSource() {
		return this.billSource;
	}
	public void setBillSource(String billSource) {
		this.billSource = billSource;
	}

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
