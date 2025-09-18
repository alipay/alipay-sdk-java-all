package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道信息
 *
 * @author auto create
 * @since 1.0, 2025-03-13 23:54:53
 */
public class LandingChannelInfoVO extends AlipayObject {

	private static final long serialVersionUID = 3732482372986752184L;

	/**
	 * 是否来自闪租频道，标记为联营，值为Y/N
	 */
	@ApiField("union_rent_tag")
	private String unionRentTag;

	public String getUnionRentTag() {
		return this.unionRentTag;
	}
	public void setUnionRentTag(String unionRentTag) {
		this.unionRentTag = unionRentTag;
	}

}
