package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于为服务窗合作伙伴（如YunOS），提供订阅关系（关注与取消关注）同步功能
 *
 * @author auto create
 * @since 1.0, 2024-07-04 17:00:49
 */
public class AlipayOpenPublicPartnerSubscribeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4514645945971643514L;

	/**
	 * 是否接受服务窗消息
	 */
	@ApiField("accept_msg")
	private String acceptMsg;

	/**
	 * 关注的服务窗id
	 */
	@ApiField("follow_object_id")
	private String followObjectId;

	/**
	 * 操作类型，添加关注或取消关注
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 是否打开接收公众号PUSH提醒开关 ON:打开 OFF:关闭
	 */
	@ApiField("push_switch")
	private String pushSwitch;

	/**
	 * 关注来源
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 关注服务窗的用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAcceptMsg() {
		return this.acceptMsg;
	}
	public void setAcceptMsg(String acceptMsg) {
		this.acceptMsg = acceptMsg;
	}

	public String getFollowObjectId() {
		return this.followObjectId;
	}
	public void setFollowObjectId(String followObjectId) {
		this.followObjectId = followObjectId;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getPushSwitch() {
		return this.pushSwitch;
	}
	public void setPushSwitch(String pushSwitch) {
		this.pushSwitch = pushSwitch;
	}

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
