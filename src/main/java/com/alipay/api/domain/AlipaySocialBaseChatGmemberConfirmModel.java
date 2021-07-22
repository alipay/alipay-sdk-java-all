package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 判断支付宝群成员是否在群中
 *
 * @author auto create
 * @since 1.0, 2020-07-28 17:13:45
 */
public class AlipaySocialBaseChatGmemberConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 5652949717782395191L;

	/**
	 * 业务类型，申请接入时和我们申请，用于统计和限流
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 用户所在的群id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 要判断的用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
