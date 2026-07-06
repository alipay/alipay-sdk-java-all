package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-15 00:47:44
 */
public class OrderVoucherReceiveResult extends AlipayObject {

	private static final long serialVersionUID = 3767272322862277619L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 发券错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 外部业务单号，用作幂等控制。 幂等作用： 参数不变的情况下，再次请求返回与上一次相同的结果。 外部接入方需保证业务单号唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 单笔领券结果
	 */
	@ApiField("result")
	private Boolean result;

	/**
	 * 领券失败是否可重试
	 */
	@ApiField("retry")
	private Boolean retry;

	/**
	 * 商家-商家券-导码券：发券时生成
商家-商家券-非导码券：发券时传入
商家-支付券：不返回
	 */
	@ApiField("voucher_code")
	private String voucherCode;

	/**
	 * 用户券 id。支付宝为用户优惠券唯一分配的 id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Boolean getResult() {
		return this.result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}

	public Boolean getRetry() {
		return this.retry;
	}
	public void setRetry(Boolean retry) {
		this.retry = retry;
	}

	public String getVoucherCode() {
		return this.voucherCode;
	}
	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
