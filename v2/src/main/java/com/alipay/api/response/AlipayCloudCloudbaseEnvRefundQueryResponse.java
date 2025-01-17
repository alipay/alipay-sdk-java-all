package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-20 17:42:07
 */
public class AlipayCloudCloudbaseEnvRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8195317194844871767L;

	/** 
	 * 退款金额（单位：元）
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 退款方式
	 */
	@ApiField("refund_type")
	private String refundType;

	/** 
	 * 总金额（单位：元）
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 已使用金额（单位：元）
	 */
	@ApiField("use_amount")
	private String useAmount;

	/** 
	 * 使用时长（精确到秒级）
	 */
	@ApiField("use_time")
	private String useTime;

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}
	public String getRefundType( ) {
		return this.refundType;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setUseAmount(String useAmount) {
		this.useAmount = useAmount;
	}
	public String getUseAmount( ) {
		return this.useAmount;
	}

	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}
	public String getUseTime( ) {
		return this.useTime;
	}

}
