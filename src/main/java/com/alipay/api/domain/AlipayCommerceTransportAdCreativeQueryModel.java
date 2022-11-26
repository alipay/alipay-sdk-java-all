package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据广告创意ID查询创意详情
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:16:42
 */
public class AlipayCommerceTransportAdCreativeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3757664458953412941L;

	/**
	 * 广告主唯一ID；是否唯一(不需要)；用作校验防止跨user操作；天猫接口调用传参
	 */
	@ApiField("ad_user_id")
	private Long adUserId;

	/**
	 * 广告创意ID；是否唯一(不需要)；用于通过创意ID查询创意详情；天猫广告创意信息查询入参
	 */
	@ApiField("creative_id")
	private Long creativeId;

	public Long getAdUserId() {
		return this.adUserId;
	}
	public void setAdUserId(Long adUserId) {
		this.adUserId = adUserId;
	}

	public Long getCreativeId() {
		return this.creativeId;
	}
	public void setCreativeId(Long creativeId) {
		this.creativeId = creativeId;
	}

}
