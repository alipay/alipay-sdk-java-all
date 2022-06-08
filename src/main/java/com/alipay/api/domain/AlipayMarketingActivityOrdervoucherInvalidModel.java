package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 使券失效
 *
 * @author auto create
 * @since 1.0, 2021-07-03 11:04:18
 */
public class AlipayMarketingActivityOrdervoucherInvalidModel extends AlipayObject {

	private static final long serialVersionUID = 7122666897822456746L;

	/**
	 * 优惠券活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 优惠券失效时间

格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("biz_dt")
	private Date bizDt;

	/**
	 * 外部业务单号，用作幂等控制。

幂等作用：
参数不变的情况下，再次请求返回与上一次相同的结果。

外部接入方需保证业务单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 待失效的券码
限制:
券码必须未核销且未失效
	 */
	@ApiField("voucher_code")
	private String voucherCode;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Date getBizDt() {
		return this.bizDt;
	}
	public void setBizDt(Date bizDt) {
		this.bizDt = bizDt;
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
