package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅用户vo
 *
 * @author auto create
 * @since 1.0, 2021-01-09 19:14:58
 */
public class NotifyUserVo extends AlipayObject {

	private static final long serialVersionUID = 8848719835198317456L;

	/**
	 * 删除标志，已删除：deleted, 未删除:not_deleted
	 */
	@ApiField("del_flag")
	private String delFlag;

	/**
	 * 订阅服务唯一标识
	 */
	@ApiField("notify_id")
	private String notifyId;

	/**
	 * 订阅实体
	 */
	@ApiField("notify_object")
	private String notifyObject;

	/**
	 * 订阅状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getDelFlag() {
		return this.delFlag;
	}
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	public String getNotifyId() {
		return this.notifyId;
	}
	public void setNotifyId(String notifyId) {
		this.notifyId = notifyId;
	}

	public String getNotifyObject() {
		return this.notifyObject;
	}
	public void setNotifyObject(String notifyObject) {
		this.notifyObject = notifyObject;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
