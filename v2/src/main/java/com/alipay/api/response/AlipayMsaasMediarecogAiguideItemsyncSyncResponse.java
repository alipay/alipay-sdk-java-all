package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.aiguide.itemsync.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-28 13:52:59
 */
public class AlipayMsaasMediarecogAiguideItemsyncSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2484753215488949289L;

	/** 
	 * Maya算法生成的AFTS推荐结果文件下载URL，由客户自行下载并解析
	 */
	@ApiField("afts_url")
	private String aftsUrl;

	/** 
	 * 设备ID（始终返回，便于客户关联）
	 */
	@ApiField("n_device_id")
	private String nDeviceId;

	/** 
	 * 设备序列号（入参传了则回显，未传则为空）
	 */
	@ApiField("sn")
	private String sn;

	public void setAftsUrl(String aftsUrl) {
		this.aftsUrl = aftsUrl;
	}
	public String getAftsUrl( ) {
		return this.aftsUrl;
	}

	public void setnDeviceId(String nDeviceId) {
		this.nDeviceId = nDeviceId;
	}
	public String getnDeviceId( ) {
		return this.nDeviceId;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getSn( ) {
		return this.sn;
	}

}
