package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ape用户行为上报
 *
 * @author auto create
 * @since 1.0, 2023-08-14 20:16:19
 */
public class AlipayDigitalopUcdpApebehaviorSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5814573652414264885L;

	/**
	 * 行为类型：click（点击）、expose（曝光）、order（下单）、pay（支付）、collect（收藏）、like（点赞）、comment（评论）、share（分享）等
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 渠道：支付宝端、独立客户端等，默认alipay
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 商家自定义id
	 */
	@ApiField("custom_id")
	private String customId;

	/**
	 * 推荐item附属的商品id、商品名称，多个值用,分割
	 */
	@ApiField("goods_id")
	private String goodsId;

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
	 * 传item的素材id，如果推荐接口没返回素材id，这个就不传
	 */
	@ApiField("material_id")
	private String materialId;

	/**
	 * 加密userId
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
	 * 商家在蚂蚁推荐引擎创建的项目id，调用前需要找蚂蚁技术获取。
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 推荐场景，枚举值：home（首页）、goods_detail（商详页）、search（搜索）、order_detail（订单详情）
	 */
	@ApiField("scene")
	private String scene;

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
	 * 支付宝userid
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 废弃：user_id固定为支付宝uid，type无需商家显示传递。 当前字段已废弃(user_id固定位支付宝uid，无需商家显示传递。)
	 */
	@ApiField("user_id_type")
	@Deprecated
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

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCustomId() {
		return this.customId;
	}
	public void setCustomId(String customId) {
		this.customId = customId;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
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

	public String getMaterialId() {
		return this.materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
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

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
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
