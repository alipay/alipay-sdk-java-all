package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.bizinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-14 17:27:27
 */
public class AlipayEbppIndustryBizinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2433422852323512525L;

	/** 
	 * 业务机构简称
	 */
	@ApiField("biz_inst")
	private String bizInst;

	/** 
	 * 业务类型，公服业务：IND
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 业务数据码，标识业务场景
	 */
	@ApiField("data_code")
	private String dataCode;

	/** 
	 * 机构结果码
	 */
	@ApiField("org_result_code")
	private String orgResultCode;

	/** 
	 * 业务结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 返回结果上下文，json格式
	 */
	@ApiField("result_context")
	private String resultContext;

	/** 
	 * 结果描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setBizInst(String bizInst) {
		this.bizInst = bizInst;
	}
	public String getBizInst( ) {
		return this.bizInst;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setDataCode(String dataCode) {
		this.dataCode = dataCode;
	}
	public String getDataCode( ) {
		return this.dataCode;
	}

	public void setOrgResultCode(String orgResultCode) {
		this.orgResultCode = orgResultCode;
	}
	public String getOrgResultCode( ) {
		return this.orgResultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultContext(String resultContext) {
		this.resultContext = resultContext;
	}
	public String getResultContext( ) {
		return this.resultContext;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
