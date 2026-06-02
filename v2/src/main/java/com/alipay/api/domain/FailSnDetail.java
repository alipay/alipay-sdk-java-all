package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * sn失败详情
 *
 * @author auto create
 * @since 1.0, 2026-04-10 10:28:23
 */
public class FailSnDetail extends AlipayObject {

	private static final long serialVersionUID = 8313972775724346199L;

	/**
	 * 模块失败详情code
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 模块失败详情
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/**
	 * 商户路由链接
	 */
	@ApiField("route_url")
	private String routeUrl;

	/**
	 * 处理状态
	 */
	@ApiField("status")
	private String status;

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

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return this.resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public String getRouteUrl() {
		return this.routeUrl;
	}
	public void setRouteUrl(String routeUrl) {
		this.routeUrl = routeUrl;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
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
