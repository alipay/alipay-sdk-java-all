package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * openapi返回结果。
statusCode:Status code used to indicate an error. If omitted, assumed to be 200 (success);subStatusCode:Conveys failure codes from downstream entities or for more granular conveyance of specific error conditions;statusMessage:Not parsed programmatically. Example "Downstream system offline".
 *
 * @author auto create
 * @since 1.0, 2020-02-20 20:02:56
 */
public class EstablishResponseHeader extends AlipayObject {

	private static final long serialVersionUID = 6715973542386246923L;

	/**
	 * 200=成功，400=请求错误，403=bundle查询不到。
Status code used to indicate an error, or "200" for success.
	 */
	@ApiField("status_code")
	private String statusCode;

	/**
	 * Not parsed programmatically. Example "Downstream system offline"
	 */
	@ApiField("status_message")
	private String statusMessage;

	/**
	 * Conveys failure codes from downstream entities or for more granular
conveyance of specific error conditions.
	 */
	@ApiField("sub_status_code")
	private String subStatusCode;

	public String getStatusCode() {
		return this.statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return this.statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getSubStatusCode() {
		return this.subStatusCode;
	}
	public void setSubStatusCode(String subStatusCode) {
		this.subStatusCode = subStatusCode;
	}

}
