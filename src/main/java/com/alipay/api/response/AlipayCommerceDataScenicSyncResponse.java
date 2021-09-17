package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.data.scenic.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-02 19:55:21
 */
public class AlipayCommerceDataScenicSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5124885583224479434L;

	/** 
	 * 对应服务商请求中的outer_id
	 */
	@ApiField("outer_id")
	private String outerId;

	/** 
	 * 对应服务商请求中的scenic_app_id
	 */
	@ApiField("scenic_app_id")
	private String scenicAppId;

	/** 
	 * 对应服务商请求中的scenic_id
	 */
	@ApiField("scenic_id")
	private String scenicId;

	/** 
	 * 出现异常 "同一个appId+outerId下不能对应两个景区" 时，才会有值，表示outer_id+scenic_app_id在支付宝域维护的景区ID
	 */
	@ApiField("zfb_scenic_id")
	private String zfbScenicId;

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}
	public String getOuterId( ) {
		return this.outerId;
	}

	public void setScenicAppId(String scenicAppId) {
		this.scenicAppId = scenicAppId;
	}
	public String getScenicAppId( ) {
		return this.scenicAppId;
	}

	public void setScenicId(String scenicId) {
		this.scenicId = scenicId;
	}
	public String getScenicId( ) {
		return this.scenicId;
	}

	public void setZfbScenicId(String zfbScenicId) {
		this.zfbScenicId = zfbScenicId;
	}
	public String getZfbScenicId( ) {
		return this.zfbScenicId;
	}

}
