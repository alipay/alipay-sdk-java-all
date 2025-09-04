package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.nbinteract.scene.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-02 14:59:45
 */
public class AlipayOfflineNbinteractSceneQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7836245347863588992L;

	/** 
	 * 设备互动链接绑定状态
	 */
	@ApiField("bind_status")
	private String bindStatus;

	/** 
	 * 设备互动链接操作绑定的时间
	 */
	@ApiField("bind_time")
	private Date bindTime;

	/** 
	 * 跳转链接
	 */
	@ApiField("link_url")
	private String linkUrl;

	/** 
	 * 设备sn
	 */
	@ApiField("sn")
	private String sn;

	/** 
	 * 碰一下互动跳转链接所属类型
	 */
	@ApiField("url_type")
	private String urlType;

	public void setBindStatus(String bindStatus) {
		this.bindStatus = bindStatus;
	}
	public String getBindStatus( ) {
		return this.bindStatus;
	}

	public void setBindTime(Date bindTime) {
		this.bindTime = bindTime;
	}
	public Date getBindTime( ) {
		return this.bindTime;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}
	public String getLinkUrl( ) {
		return this.linkUrl;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getSn( ) {
		return this.sn;
	}

	public void setUrlType(String urlType) {
		this.urlType = urlType;
	}
	public String getUrlType( ) {
		return this.urlType;
	}

}
