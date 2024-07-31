package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户行为上报接口
 *
 * @author auto create
 * @since 1.0, 2024-01-05 11:40:09
 */
public class TechriskInnovateMpcpromoBehaviorSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8613497262217721752L;

	/**
	 * 行为类型：click（点击）、expose（曝光）、order（下单）、pay（支付）、collect（收藏）、like（点赞）、comment（评论）、share（分享）、cart（加购物车）、drawback（退款）、consult（咨询）、receive（券领取）、use（券核销）等
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 商家在蚂蚁创建的项目id；(个性化推荐场景项目id/智能搜索项目id/)
	 */
	@ApiField("biz_project_id")
	private String bizProjectId;

	/**
	 * 对应返回的的traceid，用于关联推荐结果、搜索结果等和用户行为
	 */
	@ApiField("biz_trace_id")
	private String bizTraceId;

	/**
	 * 商家在蚂蚁创建的项目类型；ape（推荐）aos（搜索）
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 渠道：支付宝端（ALIPAY）、独立客户端（CUSTOM）等
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 行为对应的itemId列表，多个商品用,分割，如曝光的itemid、转化的itemid等。
	 */
	@ApiField("item_id_list")
	private String itemIdList;

	/**
	 * 订单内商品的购买数量（例如一笔订单内买了1包抽纸和2瓶水），多个商品的购买数量用,分割，顺序跟item_id_list的顺序保持一致，一般只有下单/支付行为携带该字段。
	 */
	@ApiField("item_num")
	private String itemNum;

	/**
	 * 埋点上报时间戳、单位 ms
	 */
	@ApiField("log_time")
	private String logTime;

	/**
	 * 用户唯一标识id。后续user_id将不支持新接入使用，存量已对接的也将逐步回收。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单id，一般只有下单/支付行为携带该字段，用于统计效果数据（订单数，gmv指标）、或者归因层面标注conversion数据是否重复
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 用户在视频处的停留时长（单位为ms）
	 */
	@ApiField("page_stay")
	private String pageStay;

	/**
	 * 订单的实际(待)支付金额，一般只有下单/支付行为携带该字段。单位元。
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 每个item的展示位置序号position【非必要，最好有】，和item_id_list对应，逗号分割
	 */
	@ApiField("pos")
	private String pos;

	/**
	 * 订单评分（满分5）
	 */
	@ApiField("rate")
	private String rate;

	/**
	 * 行为场景，枚举值：home（首页）、goods_detail（商详页）、search（搜索）、order_detail（订单详情页）
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * SPM(Super Position Model)全称超级位置模型，主要用于标识行为发生的位置。SPM位置编码由A/B/C/D四段构成， 各分段分别代表 A:业务， B:页面， C:页面区块， D:区块内点位。段之间用$##$分隔，即A$##$B$##$C$##$D，spm各段建议传明文。允许某一段为空，为空时以_代替。
	 */
	@ApiField("spm")
	private String spm;

	/**
	 * 用户唯一标识id，可以是支付宝userid、商家自定义的userid等
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户id的类型，可选值：ALIPAY_UID（支付宝userid）、ALIPAY_OPENID（支付宝openid）、CUSTOM（商家自定义的userid）
	 */
	@ApiField("user_id_type")
	private String userIdType;

	/**
	 * 视频的总时长（单位为s）
	 */
	@ApiField("video_duration")
	private String videoDuration;

	/**
	 * 视频的播放时长（单位为ms）
	 */
	@ApiField("video_play")
	private String videoPlay;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getBizProjectId() {
		return this.bizProjectId;
	}
	public void setBizProjectId(String bizProjectId) {
		this.bizProjectId = bizProjectId;
	}

	public String getBizTraceId() {
		return this.bizTraceId;
	}
	public void setBizTraceId(String bizTraceId) {
		this.bizTraceId = bizTraceId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
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

	public String getItemNum() {
		return this.itemNum;
	}
	public void setItemNum(String itemNum) {
		this.itemNum = itemNum;
	}

	public String getLogTime() {
		return this.logTime;
	}
	public void setLogTime(String logTime) {
		this.logTime = logTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPageStay() {
		return this.pageStay;
	}
	public void setPageStay(String pageStay) {
		this.pageStay = pageStay;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPos() {
		return this.pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}

	public String getRate() {
		return this.rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSpm() {
		return this.spm;
	}
	public void setSpm(String spm) {
		this.spm = spm;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserIdType() {
		return this.userIdType;
	}
	public void setUserIdType(String userIdType) {
		this.userIdType = userIdType;
	}

	public String getVideoDuration() {
		return this.videoDuration;
	}
	public void setVideoDuration(String videoDuration) {
		this.videoDuration = videoDuration;
	}

	public String getVideoPlay() {
		return this.videoPlay;
	}
	public void setVideoPlay(String videoPlay) {
		this.videoPlay = videoPlay;
	}

}
