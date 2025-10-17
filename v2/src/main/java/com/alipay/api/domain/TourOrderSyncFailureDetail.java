package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-10-11 16:34:05
 */
public class TourOrderSyncFailureDetail extends AlipayObject {

	private static final long serialVersionUID = 7771935786283819718L;

	/**
	 * 该参数含义为描述订单同步失败的原因。当发生某些参数异常时或者系统异常时，会返回该错误信息提示。
	 */
	@ApiField("failure_reason")
	private String failureReason;

	/**
	 * 外部订单号。当订单同步接口系统遇到无法处理的异常或者参数异常时，会将该同步失败的订单信息进行返回。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getFailureReason() {
		return this.failureReason;
	}
	public void setFailureReason(String failureReason) {
		this.failureReason = failureReason;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
