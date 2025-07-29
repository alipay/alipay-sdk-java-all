package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.questionnare.task.publish response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-05 11:03:20
 */
public class AlipaySocialQuestionnareTaskPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 3283233187967114977L;

	/** 
	 * 业务扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 哥伦布问券任务Id
	 */
	@ApiField("qstn_id")
	private String qstnId;

	/** 
	 * UONE问卷ID
	 */
	@ApiField("rmt_qstn_id")
	private String rmtQstnId;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
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

}
