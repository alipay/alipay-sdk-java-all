package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务详情链接信息
 *
 * @author auto create
 * @since 1.0, 2026-09-08 15:22:54
 */
public class RightDetailUrlInfo extends AlipayObject {

	private static final long serialVersionUID = 5883312945714931389L;

	/**
	 * 是否有权益
	 */
	@ApiField("has_right")
	private Boolean hasRight;

	/**
	 * 权益详情链接
	 */
	@ApiField("right_detail_url")
	private String rightDetailUrl;

	public Boolean getHasRight() {
		return this.hasRight;
	}
	public void setHasRight(Boolean hasRight) {
		this.hasRight = hasRight;
	}

	public String getRightDetailUrl() {
		return this.rightDetailUrl;
	}
	public void setRightDetailUrl(String rightDetailUrl) {
		this.rightDetailUrl = rightDetailUrl;
	}

}
