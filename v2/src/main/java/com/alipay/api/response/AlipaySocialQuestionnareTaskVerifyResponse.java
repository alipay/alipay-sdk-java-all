package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.questionnare.task.verify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 21:12:04
 */
public class AlipaySocialQuestionnareTaskVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2659492264557424764L;

	/** 
	 * 业务扩展字段JSON格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 哥伦布问券任务Id
	 */
	@ApiField("qstn_id")
	private String qstnId;

	/** 
	 * UONE问券ID
	 */
	@ApiField("rmt_qstn_id")
	private String rmtQstnId;

	/** 
	 * 测试结果
	 */
	@ApiField("verify_result")
	private String verifyResult;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setQstnId(String qstnId) {
		this.qstnId = qstnId;
	}
	public String getQstnId( ) {
		return this.qstnId;
	}

	public void setRmtQstnId(String rmtQstnId) {
		this.rmtQstnId = rmtQstnId;
	}
	public String getRmtQstnId( ) {
		return this.rmtQstnId;
	}

	public void setVerifyResult(String verifyResult) {
		this.verifyResult = verifyResult;
	}
	public String getVerifyResult( ) {
		return this.verifyResult;
	}

}
