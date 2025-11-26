package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jf.signprocess.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:52
 */
public class AlipayEbppJfSignprocessQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1423172722927637572L;

	/** 
	 * 缴费代扣协议唯一标识, 后续解约唯一标识
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 由于机构的特殊性, 最终签约结果以机构反馈结果为准,输出错误码
	 */
	@ApiField("org_code")
	private String orgCode;

	/** 
	 * 由于机构的特殊性, 最终签约结果以机构反馈结果为准,输出错误信息
	 */
	@ApiField("org_msg")
	private String orgMsg;

	/** 
	 * 异步签约流程对应的当前状态
	 */
	@ApiField("status")
	private String status;

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId( ) {
		return this.agreementId;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getOrgCode( ) {
		return this.orgCode;
	}

	public void setOrgMsg(String orgMsg) {
		this.orgMsg = orgMsg;
	}
	public String getOrgMsg( ) {
		return this.orgMsg;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
