package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区服务
 *
 * @author auto create
 * @since 1.0, 2024-07-30 15:02:11
 */
public class CommunityService extends AlipayObject {

	private static final long serialVersionUID = 7345112946653479424L;

	/**
	 * 跳转至服务商物业户号查询服务地址
	 */
	@ApiField("billkey_url")
	private String billkeyUrl;

	/**
	 * 每日服务结束时间。精度：分钟
	 */
	@ApiField("daily_end")
	private String dailyEnd;

	/**
	 * 每日服务开始时间。精度：分钟
	 */
	@ApiField("daily_start")
	private String dailyStart;

	/**
	 * 访问服务商侧服务账单的跳转地址
	 */
	@ApiField("out_bill_url")
	private String outBillUrl;

	/**
	 * 当前小区开通办理业务
	 */
	@ApiField("service_type")
	private String serviceType;

	public String getBillkeyUrl() {
		return this.billkeyUrl;
	}
	public void setBillkeyUrl(String billkeyUrl) {
		this.billkeyUrl = billkeyUrl;
	}

	public String getDailyEnd() {
		return this.dailyEnd;
	}
	public void setDailyEnd(String dailyEnd) {
		this.dailyEnd = dailyEnd;
	}

	public String getDailyStart() {
		return this.dailyStart;
	}
	public void setDailyStart(String dailyStart) {
		this.dailyStart = dailyStart;
	}

	public String getOutBillUrl() {
		return this.outBillUrl;
	}
	public void setOutBillUrl(String outBillUrl) {
		this.outBillUrl = outBillUrl;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

}
