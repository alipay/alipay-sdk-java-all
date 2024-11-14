package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * alipay.open.public.tmall.follow.create(品牌号关注关系同步)
 *
 * @author auto create
 * @since 1.0, 2022-12-14 19:10:49
 */
public class AlipayOpenPublicFollowCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2772924195382461929L;

	/**
	 * 支付宝用户唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 来源，目前只有"tmall"
	 */
	@ApiField("source")
	private String source;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
