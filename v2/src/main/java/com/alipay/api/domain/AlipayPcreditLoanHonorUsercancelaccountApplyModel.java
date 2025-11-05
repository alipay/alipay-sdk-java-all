package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 注销申请
 *
 * @author auto create
 * @since 1.0, 2025-09-12 15:30:03
 */
public class AlipayPcreditLoanHonorUsercancelaccountApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3519219819192855744L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 注销申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 渠道用户id
	 */
	@ApiField("channel_customer_id")
	private String channelCustomerId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部traceId
	 */
	@ApiField("out_trace_id")
	private String outTraceId;

	/**
	 * SL_PD_SALE_CODE-HONOR
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 请求源
	 */
	@ApiField("request_source")
	private String requestSource;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getChannelCustomerId() {
		return this.channelCustomerId;
	}
	public void setChannelCustomerId(String channelCustomerId) {
		this.channelCustomerId = channelCustomerId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutTraceId() {
		return this.outTraceId;
	}
	public void setOutTraceId(String outTraceId) {
		this.outTraceId = outTraceId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRequestSource() {
		return this.requestSource;
	}
	public void setRequestSource(String requestSource) {
		this.requestSource = requestSource;
	}

}
