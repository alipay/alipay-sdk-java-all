package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 为空 则表述数据不存在
 *
 * @author auto create
 * @since 1.0, 2026-04-27 16:22:49
 */
public class NOrderTagDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 1647347431179427225L;

	/**
	 * 线圈编号，线圈的唯一外标
	 */
	@ApiField("coil_no")
	private String coilNo;

	/**
	 * 跳转链接
	 */
	@ApiField("route_url")
	private String routeUrl;

	/**
	 * 线圈的内标 唯一标识
	 */
	@ApiField("tag_id")
	private String tagId;

	public String getCoilNo() {
		return this.coilNo;
	}
	public void setCoilNo(String coilNo) {
		this.coilNo = coilNo;
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

}
