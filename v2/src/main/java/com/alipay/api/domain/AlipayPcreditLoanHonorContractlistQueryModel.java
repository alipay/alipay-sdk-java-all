package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 待签署协议列表查询
 *
 * @author auto create
 * @since 1.0, 2025-09-12 15:06:46
 */
public class AlipayPcreditLoanHonorContractlistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2221896828993861835L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 绑定检查id
	 */
	@ApiField("bind_check_serial_no")
	private String bindCheckSerialNo;

	/**
	 * 协议类型，1-授信，2-绑卡，3-借款，4-用信补录
	 */
	@ApiField("business_type")
	private Long businessType;

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

	public String getBindCheckSerialNo() {
		return this.bindCheckSerialNo;
	}
	public void setBindCheckSerialNo(String bindCheckSerialNo) {
		this.bindCheckSerialNo = bindCheckSerialNo;
	}

	public Long getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(Long businessType) {
		this.businessType = businessType;
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
