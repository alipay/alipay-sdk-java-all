package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.questionnare.task.finish response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-29 11:11:18
 */
public class AlipaySocialQuestionnareTaskFinishResponse extends AlipayResponse {

	private static final long serialVersionUID = 8343743982452412643L;

	/** 
	 * 业务扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 哥伦布问券任务Id
	 */
	@ApiField("qstn_id")
	private String qstnId;

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

}
