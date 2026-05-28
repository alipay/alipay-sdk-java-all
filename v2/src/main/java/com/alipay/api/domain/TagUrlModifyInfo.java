package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模块链接修改信息
 *
 * @author auto create
 * @since 1.0, 2026-04-10 10:28:14
 */
public class TagUrlModifyInfo extends AlipayObject {

	private static final long serialVersionUID = 6855254273825731944L;

	/**
	 * 链接地址
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
