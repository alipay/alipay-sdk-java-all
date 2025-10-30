package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.jobworth.jobdata.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:42:39
 */
public class ZhimaCustomerJobworthJobdataAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 7593535577292682672L;

	/** 
	 * 受理台单号，用来调用工作证受理台
	 */
	@ApiField("acceptance_id")
	private String acceptanceId;

	/** 
	 * 错误码
	 */
	@ApiField("sub_code")
	private String subCode;

	/** 
	 * 业务中文结果信息
	 */
	@ApiField("sub_msg")
	private String subMsg;

	/** 
	 * 职得工作证跳转小程序链接
	 */
	@ApiField("url")
	private String url;

	public void setAcceptanceId(String acceptanceId) {
		this.acceptanceId = acceptanceId;
	}
	public String getAcceptanceId( ) {
		return this.acceptanceId;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	public String getSubCode( ) {
		return this.subCode;
	}

	public void setSubMsg(String subMsg) {
		this.subMsg = subMsg;
	}
	public String getSubMsg( ) {
		return this.subMsg;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
