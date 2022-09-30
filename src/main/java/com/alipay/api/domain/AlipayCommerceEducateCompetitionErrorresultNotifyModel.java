package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 赛事录入异常通知接口
 *
 * @author auto create
 * @since 1.0, 2021-03-11 21:27:30
 */
public class AlipayCommerceEducateCompetitionErrorresultNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 1834355281189294655L;

	/**
	 * 异常类型
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 异常原因描述
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 外部赛事id
	 */
	@ApiField("source_id")
	private String sourceId;

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}
