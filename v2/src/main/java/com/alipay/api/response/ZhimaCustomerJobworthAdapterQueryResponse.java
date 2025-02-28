package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.jobworth.adapter.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:11
 */
public class ZhimaCustomerJobworthAdapterQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5826651121558664466L;

	/** 
	 * 匹配度
	 */
	@ApiField("adapter_score")
	private String adapterScore;

	/** 
	 * 业务编码
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

	public void setAdapterScore(String adapterScore) {
		this.adapterScore = adapterScore;
	}
	public String getAdapterScore( ) {
		return this.adapterScore;
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
