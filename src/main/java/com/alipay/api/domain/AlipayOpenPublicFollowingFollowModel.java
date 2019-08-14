package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户关注生活号接口
 *
 * @author auto create
 * @since 1.0, 2019-07-11 13:36:23
 */
public class AlipayOpenPublicFollowingFollowModel extends AlipayObject {

	private static final long serialVersionUID = 3676993322631878842L;

	/**
	 * 关注来源ID
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
