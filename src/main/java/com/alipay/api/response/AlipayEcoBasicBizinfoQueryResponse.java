package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.basic.bizinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-28 20:57:37
 */
public class AlipayEcoBasicBizinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4119948664967699872L;

	/** 
	 * 业务机构简称
	 */
	@ApiField("biz_inst")
	private String bizInst;

	/** 
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 业务数据码，标识业务场景， 一般业映射业务服务方的具体业务api
	 */
	@ApiField("data_code")
	private String dataCode;

	/** 
	 * 业务服务方提供的原始错误码
	 */
	@ApiField("org_result_code")
	private String orgResultCode;

	/** 
	 * 返回业务服务方的原始错误
	 */
	@ApiField("org_result_msg")
	private String orgResultMsg;

	/** 
	 * 业务结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 机构返回结果上下文，json格式
	 */
	@ApiField("result_context")
	private String resultContext;

	/** 
	 * 业务返回错误
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

	public void setOrgResultMsg(String orgResultMsg) {
		this.orgResultMsg = orgResultMsg;
	}
	public String getOrgResultMsg( ) {
		return this.orgResultMsg;
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
