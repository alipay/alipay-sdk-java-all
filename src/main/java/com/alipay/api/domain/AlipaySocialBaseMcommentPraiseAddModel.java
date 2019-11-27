package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提交点赞
 *
 * @author auto create
 * @since 1.0, 2016-11-07 14:33:33
 */
public class AlipaySocialBaseMcommentPraiseAddModel extends AlipayObject {

	private static final long serialVersionUID = 2637343793814888346L;

	/**
	 * 被点赞对象的ID
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 点赞人的支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
