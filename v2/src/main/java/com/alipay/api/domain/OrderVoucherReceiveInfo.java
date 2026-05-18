package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-15 00:47:44
 */
public class OrderVoucherReceiveInfo extends AlipayObject {

	private static final long serialVersionUID = 5384411744256874554L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 自定义发放时间:不为空,则以该时间为发券基准时间
	 */
	@ApiField("customize_send_time")
	private Date customizeSendTime;

	/**
	 * 外部业务单号，用作幂等控制。 幂等作用： 参数不变的情况下，再次请求返回与上一次相同的结果。 外部接入方需保证业务单号唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 非导码券场景下商家传入券码进行发券
	 */
	@ApiField("voucher_code")
	private String voucherCode;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Date getCustomizeSendTime() {
		return this.customizeSendTime;
	}
	public void setCustomizeSendTime(Date customizeSendTime) {
		this.customizeSendTime = customizeSendTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getVoucherCode() {
		return this.voucherCode;
	}
	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

}
