package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于返回线圈信息
 *
 * @author auto create
 * @since 1.0, 2026-04-10 10:28:05
 */
public class TagUrlInfo extends AlipayObject {

	private static final long serialVersionUID = 7161949218695648271L;

	/**
	 * nfc链接
	 */
	@ApiField("nfc_url")
	private String nfcUrl;

	/**
	 * 用于跳转小程序
	 */
	@ApiField("route_url")
	private String routeUrl;

	/**
	 * 线圈id
	 */
	@ApiField("tag_id")
	private String tagId;

	/**
	 * 线圈sn
	 */
	@ApiField("tag_sn")
	private String tagSn;

	public String getNfcUrl() {
		return this.nfcUrl;
	}
	public void setNfcUrl(String nfcUrl) {
		this.nfcUrl = nfcUrl;
	}

	public String getRouteUrl() {
		return this.routeUrl;
	}
	public void setRouteUrl(String routeUrl) {
		this.routeUrl = routeUrl;
	}

	public String getTagId() {
		return this.tagId;
	}
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public String getTagSn() {
		return this.tagSn;
	}
	public void setTagSn(String tagSn) {
		this.tagSn = tagSn;
	}

}
