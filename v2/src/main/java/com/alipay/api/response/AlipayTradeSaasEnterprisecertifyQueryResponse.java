package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.saas.enterprisecertify.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-16 21:02:56
 */
public class AlipayTradeSaasEnterprisecertifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7113563769579568467L;

	/** 
	 * 认证时间
	 */
	@ApiField("certify_end_time")
	private String certifyEndTime;

	/** 
	 * 平台企业认证单号
	 */
	@ApiField("certify_order_no")
	private String certifyOrderNo;

	/** 
	 * 创建企业认证链接时使用的客户幂等号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 认证状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 根据本地状态即时映射的安全描述
	 */
	@ApiField("status_desc")
	private String statusDesc;

	public void setCertifyEndTime(String certifyEndTime) {
		this.certifyEndTime = certifyEndTime;
	}
	public String getCertifyEndTime( ) {
		return this.certifyEndTime;
	}

	public void setCertifyOrderNo(String certifyOrderNo) {
		this.certifyOrderNo = certifyOrderNo;
	}
	public String getCertifyOrderNo( ) {
		return this.certifyOrderNo;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	public String getStatusDesc( ) {
		return this.statusDesc;
	}

}
