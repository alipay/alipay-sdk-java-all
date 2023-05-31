package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.questionnare.gray.upgrade response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:56:06
 */
public class AlipaySocialQuestionnareGrayUpgradeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4762468879216472899L;

	/** 
	 * 业务扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 调整后的灰度值
	 */
	@ApiField("gray_percent")
	private String grayPercent;

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

	public void setGrayPercent(String grayPercent) {
		this.grayPercent = grayPercent;
	}
	public String getGrayPercent( ) {
		return this.grayPercent;
	}

	public void setQstnId(String qstnId) {
		this.qstnId = qstnId;
	}
	public String getQstnId( ) {
		return this.qstnId;
	}

}
