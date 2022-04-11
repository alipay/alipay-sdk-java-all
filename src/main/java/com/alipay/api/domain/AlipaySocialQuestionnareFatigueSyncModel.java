package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 哥伦布问卷疲劳度同步客户端接口
 *
 * @author auto create
 * @since 1.0, 2020-12-16 11:59:50
 */
public class AlipaySocialQuestionnareFatigueSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7758496632512445265L;

	/**
	 * 异步问卷投递时间
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 业务类型
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 问券Id
	 */
	@ApiField("qstn_id")
	private String qstnId;

	/**
	 * 1 表示是离线投放后同步
2 表示用户答完问卷同步
	 */
	@ApiField("sync_type")
	private String syncType;

	/**
	 * 蚂蚁统一会员ID,已异步投递问卷的用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getQstnId() {
		return this.qstnId;
	}
	public void setQstnId(String qstnId) {
		this.qstnId = qstnId;
	}

	public String getSyncType() {
		return this.syncType;
	}
	public void setSyncType(String syncType) {
		this.syncType = syncType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
