package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区临访人群认证接口
 *
 * @author auto create
 * @since 1.0, 2023-09-25 19:30:03
 */
public class AlipayEbppCommunityTemporaryvisitorstagVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 2253555837523545794L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 快递员
	 */
	@ApiField("tag_type")
	private String tagType;

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

	public String getTagType() {
		return this.tagType;
	}
	public void setTagType(String tagType) {
		this.tagType = tagType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
