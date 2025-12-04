package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云营销智能问答创建
 *
 * @author auto create
 * @since 1.0, 2024-05-23 16:28:55
 */
public class AlipayCloudCloudpromoAichatMsgCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8597997943338437322L;

	/**
	 * scene为直播时，需要商品id；
scene为游戏GS时，需要聊天类型
	 */
	@ApiField("biz_trans_data")
	private String bizTransData;

	/**
	 * 请求的聊天或提问消息
	 */
	@ApiField("chat_query")
	private String chatQuery;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 业务侧针对单轮问答生成的唯一业务号，用来标记单轮对话
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 接入时的对话机器人id
	 */
	@ApiField("robot_id")
	private String robotId;

	/**
	 * 直播场景问答
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizTransData() {
		return this.bizTransData;
	}
	public void setBizTransData(String bizTransData) {
		this.bizTransData = bizTransData;
	}

	public String getChatQuery() {
		return this.chatQuery;
	}
	public void setChatQuery(String chatQuery) {
		this.chatQuery = chatQuery;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getRobotId() {
		return this.robotId;
	}
	public void setRobotId(String robotId) {
		this.robotId = robotId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
