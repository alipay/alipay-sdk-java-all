package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.jobworth.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-14 16:26:43
 */
public class ZhimaCustomerJobworthInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3563138331739318874L;

	/** 
	 * 受理台单号作为jsapi的一个参数。如果不使用jsapi可以忽略
	 */
	@ApiField("acceptance_id")
	private String acceptanceId;

	/** 
	 * 用于授权校验,授权之前需要通过token校验
	 */
	@ApiField("auth_token")
	private String authToken;

	/** 
	 * 职得工作证图片url,可以直接用于展示
	 */
	@ApiField("picture_url")
	private String pictureUrl;

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
	 * 工作证图片更新的url,需要跳转到工作证小程序中进行更新
	 */
	@ApiField("update_url")
	private String updateUrl;

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

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public String getAuthToken( ) {
		return this.authToken;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public String getPictureUrl( ) {
		return this.pictureUrl;
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

	public void setUpdateUrl(String updateUrl) {
		this.updateUrl = updateUrl;
	}
	public String getUpdateUrl( ) {
		return this.updateUrl;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
