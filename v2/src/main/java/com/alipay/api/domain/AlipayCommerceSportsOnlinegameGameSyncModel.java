package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 赛事信息同步
 *
 * @author auto create
 * @since 1.0, 2024-07-08 19:51:52
 */
public class AlipayCommerceSportsOnlinegameGameSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4517158917371585155L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 金秋跑出风采
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 参赛详情支付宝小程序跳转地址
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 赛事结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 环境参数 TEST(测试数据)/PROD(正式数据)
	 */
	@ApiField("env")
	private String env;

	/**
	 * 文体侧赛事业务号，由文体标志及时间戳生成
	 */
	@ApiField("game_id")
	private String gameId;

	/**
	 * 赛事总进度，线上赛为M（米），步数赛为STEP(步数)
	 */
	@ApiField("game_progress_unit")
	private String gameProgressUnit;

	/**
	 * 赛事总进度,线上赛单位为M，步数赛为单位STEP
	 */
	@ApiField("game_progress_value")
	private Long gameProgressValue;

	/**
	 * 奖牌图片链接
	 */
	@ApiField("medal_image")
	private String medalImage;

	/**
	 * 2022跑遍中国-乐享中秋跑量挑战赛
	 */
	@ApiField("name")
	private String name;

	/**
	 * 线上赛事场次组别信息列表
	 */
	@ApiListField("online_game_event_list")
	@ApiField("online_game_event_info")
	private List<OnlineGameEventInfo> onlineGameEventList;

	/**
	 * 三方赛事ID(唯一值)，由三方提供值
	 */
	@ApiField("out_game_no")
	private String outGameNo;

	/**
	 * 赛事海报图片地址，图片不大于2M
	 */
	@ApiField("poster_url")
	private String posterUrl;

	/**
	 * 商品id，keep方必填，为交易组件接口返回
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 0代表上报条数无限制/1代表上报一条/n代表具体上报条数，单位为条
	 */
	@ApiField("sports_data_limit_count")
	private Long sportsDataLimitCount;

	/**
	 * ALIPAY_SPORTS 支付宝运动
	 */
	@ApiField("sports_data_source")
	private String sportsDataSource;

	/**
	 * 运动类型
	 */
	@ApiField("sports_data_type")
	private String sportsDataType;

	/**
	 * MARATHON(马拉松)
	 */
	@ApiField("sports_type")
	private String sportsType;

	/**
	 * 赛事开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 状态(上线[ONLINE]/下线[OFFLINE])
	 */
	@ApiField("status")
	private String status;

	/**
	 * 赛事中的子业务类型(该字段目前为预留字段,供接入方需要输入额外时使用)
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 标签列表信息
	 */
	@ApiListField("tag_list")
	@ApiField("string")
	private List<String> tagList;

	/**
	 * 用户参赛结束时间
	 */
	@ApiField("user_join_end_time")
	private Date userJoinEndTime;

	/**
	 * 用户参赛时间
	 */
	@ApiField("user_join_start_time")
	private Date userJoinStartTime;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

	public String getGameId() {
		return this.gameId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public String getGameProgressUnit() {
		return this.gameProgressUnit;
	}
	public void setGameProgressUnit(String gameProgressUnit) {
		this.gameProgressUnit = gameProgressUnit;
	}

	public Long getGameProgressValue() {
		return this.gameProgressValue;
	}
	public void setGameProgressValue(Long gameProgressValue) {
		this.gameProgressValue = gameProgressValue;
	}

	public String getMedalImage() {
		return this.medalImage;
	}
	public void setMedalImage(String medalImage) {
		this.medalImage = medalImage;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<OnlineGameEventInfo> getOnlineGameEventList() {
		return this.onlineGameEventList;
	}
	public void setOnlineGameEventList(List<OnlineGameEventInfo> onlineGameEventList) {
		this.onlineGameEventList = onlineGameEventList;
	}

	public String getOutGameNo() {
		return this.outGameNo;
	}
	public void setOutGameNo(String outGameNo) {
		this.outGameNo = outGameNo;
	}

	public String getPosterUrl() {
		return this.posterUrl;
	}
	public void setPosterUrl(String posterUrl) {
		this.posterUrl = posterUrl;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Long getSportsDataLimitCount() {
		return this.sportsDataLimitCount;
	}
	public void setSportsDataLimitCount(Long sportsDataLimitCount) {
		this.sportsDataLimitCount = sportsDataLimitCount;
	}

	public String getSportsDataSource() {
		return this.sportsDataSource;
	}
	public void setSportsDataSource(String sportsDataSource) {
		this.sportsDataSource = sportsDataSource;
	}

	public String getSportsDataType() {
		return this.sportsDataType;
	}
	public void setSportsDataType(String sportsDataType) {
		this.sportsDataType = sportsDataType;
	}

	public String getSportsType() {
		return this.sportsType;
	}
	public void setSportsType(String sportsType) {
		this.sportsType = sportsType;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public List<String> getTagList() {
		return this.tagList;
	}
	public void setTagList(List<String> tagList) {
		this.tagList = tagList;
	}

	public Date getUserJoinEndTime() {
		return this.userJoinEndTime;
	}
	public void setUserJoinEndTime(Date userJoinEndTime) {
		this.userJoinEndTime = userJoinEndTime;
	}

	public Date getUserJoinStartTime() {
		return this.userJoinStartTime;
	}
	public void setUserJoinStartTime(Date userJoinStartTime) {
		this.userJoinStartTime = userJoinStartTime;
	}

}
