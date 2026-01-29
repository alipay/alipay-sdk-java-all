package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同详情查询
 *
 * @author auto create
 * @since 1.0, 2025-09-12 15:18:38
 */
public class AlipayPcreditLoanHonorContractdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2133974578898159878L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 渠道用户id
	 */
	@ApiField("channel_customer_id")
	private String channelCustomerId;

	/**
	 * 合同 Id，传该字段返回单条协议信息
	 */
	@ApiField("contract_id")
	private String contractId;

	/**
	 * 渠道侧支用申请单号
	 */
	@ApiField("loan_apply_no")
	private String loanApplyNo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部traceid
	 */
	@ApiField("out_trace_id")
	private String outTraceId;

	/**
	 * 待签约协议需要传入
1、签约阶段-协议列表咨询的id
2、支用阶段-试算结果id
	 */
	@ApiField("pre_consult_id")
	private String preConsultId;

	/**
	 * SL_PD_SALE_CODE-HONOR
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 请求来源
	 */
	@ApiField("request_source")
	private String requestSource;

	/**
	 * 协议类型, 1-URL (废弃) ,   2-html  , 3-URL(支持返回多份协议), 4-pdf
	 */
	@ApiField("type")
	private Long type;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getChannelCustomerId() {
		return this.channelCustomerId;
	}
	public void setChannelCustomerId(String channelCustomerId) {
		this.channelCustomerId = channelCustomerId;
	}

	public String getContractId() {
		return this.contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getLoanApplyNo() {
		return this.loanApplyNo;
	}
	public void setLoanApplyNo(String loanApplyNo) {
		this.loanApplyNo = loanApplyNo;
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

	public String getPreConsultId() {
		return this.preConsultId;
	}
	public void setPreConsultId(String preConsultId) {
		this.preConsultId = preConsultId;
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

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
