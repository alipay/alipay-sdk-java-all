package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新增广告创意
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:16:36
 */
public class AlipayCommerceTransportAdCreativeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3751751852394374853L;

	/**
	 * 广告创意与物料信息；是否唯一(不需要)；用于新增广告创意与创意下包含的物料信息；天猫广告投放传参
	 */
	@ApiField("ad_creative")
	private AdCreative adCreative;

	/**
	 * 广告主唯一ID；是否唯一(不需要)；用作校验防止跨user操作；天猫接口调用传参
	 */
	@ApiField("ad_user_id")
	private Long adUserId;

	public AdCreative getAdCreative() {
		return this.adCreative;
	}
	public void setAdCreative(AdCreative adCreative) {
		this.adCreative = adCreative;
	}

	public Long getAdUserId() {
		return this.adUserId;
	}
	public void setAdUserId(Long adUserId) {
		this.adUserId = adUserId;
	}

}
