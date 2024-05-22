package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.data.scenic.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:15:40
 */
public class AlipayCommerceDataScenicSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2533845645691972233L;

	/** 
	 * 当前景区进见状态的说明
	 */
	@ApiField("desc")
	private String desc;

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
	 * 当前景区的进见状态。可选择值：[AUDITING:审核中， SUCCESS：成功]
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 出现异常 "同一个appId+outerId下不能对应两个景区" 时，才会有值，表示outer_id+scenic_app_id在支付宝域维护的景区ID
	 */
	@ApiField("zfb_scenic_id")
	private String zfbScenicId;

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc( ) {
		return this.desc;
	}

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

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setZfbScenicId(String zfbScenicId) {
		this.zfbScenicId = zfbScenicId;
	}
	public String getZfbScenicId( ) {
		return this.zfbScenicId;
	}

}
