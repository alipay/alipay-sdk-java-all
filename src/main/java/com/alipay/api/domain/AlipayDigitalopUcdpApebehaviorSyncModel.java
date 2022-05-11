package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ape用户行为上报
 *
 * @author auto create
 * @since 1.0, 2022-03-17 19:21:40
 */
public class AlipayDigitalopUcdpApebehaviorSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3431616239632117914L;

	/**
	 * 行为类型：click、expose等
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 渠道：支付宝端、独立客户端等，默认alipay
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 行为对应的itemId列表，如曝光的itemid
	 */
	@ApiField("item_id_list")
	private String itemIdList;

	/**
	 * 埋点上报时间戳、单位 ms
	 */
	@ApiField("log_time")
	private String logTime;

	/**
	 * 每个item的展示位置序号position【非必要，最好有】，和item_id_list对应，逗号分割
	 */
	@ApiField("pos")
	private String pos;

	/**
	 * 商家在蚂蚁推荐引擎创建的项目id，调用前需要找蚂蚁技术获取。
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * SPM(Super Position Model)全称超级位置模型，主要用于标识行为发生的位置。SPM位置编码由A/B/C/D四段构成， 各分段分别代表 A:业务， B:页面， C:页面区块， D:区块内点位。段之间用$##$分隔，即A$##$B$##$C$##$D，spm各段建议传明文。允许某一段为空，为空时以_代替。
	 */
	@ApiField("spm")
	private String spm;

	/**
	 * 推荐请求的traceid，用于关联推荐结果和用户行为
	 */
	@ApiField("trace_id")
	private String traceId;

	/**
	 * 用户唯一标识id，支付宝的用户填写支付宝的用户id。
	 */
	@ApiField("user_id")
	private String userId;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getItemIdList() {
		return this.itemIdList;
	}
	public void setItemIdList(String itemIdList) {
		this.itemIdList = itemIdList;
	}

	public String getLogTime() {
		return this.logTime;
	}
	public void setLogTime(String logTime) {
		this.logTime = logTime;
	}

	public String getPos() {
		return this.pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getSpm() {
		return this.spm;
	}
	public void setSpm(String spm) {
		this.spm = spm;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
