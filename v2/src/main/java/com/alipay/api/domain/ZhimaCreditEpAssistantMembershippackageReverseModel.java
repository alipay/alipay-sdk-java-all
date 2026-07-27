package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企信助手权益包回退
 *
 * @author auto create
 * @since 1.0, 2026-07-27 10:17:52
 */
public class ZhimaCreditEpAssistantMembershippackageReverseModel extends AlipayObject {

	private static final long serialVersionUID = 4319421135534225559L;

	/**
	 * 渠道创建权益包时关联的原始订单号，退权益仅支持已整个订单维度操作
	 */
	@ApiField("origin_order_no")
	private String originOrderNo;

	/**
	 * 请求流水号，企信侧用于识别幂等请求
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 退费退权益的原因描述
	 */
	@ApiField("reverse_reason")
	private String reverseReason;

	public String getOriginOrderNo() {
		return this.originOrderNo;
	}
	public void setOriginOrderNo(String originOrderNo) {
		this.originOrderNo = originOrderNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getReverseReason() {
		return this.reverseReason;
	}
	public void setReverseReason(String reverseReason) {
		this.reverseReason = reverseReason;
	}

}
