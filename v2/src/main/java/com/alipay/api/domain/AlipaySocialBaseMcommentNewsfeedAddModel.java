package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生活圈新动态发布接口
 *
 * @author auto create
 * @since 1.0, 2023-04-19 20:31:38
 */
public class AlipaySocialBaseMcommentNewsfeedAddModel extends AlipayObject {

	private static final long serialVersionUID = 3371537252112775715L;

	/**
	 * 活动地点名称
	 */
	@ApiField("activity_address")
	private String activityAddress;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 动态关联的现场id
	 */
	@ApiField("aid")
	private String aid;

	/**
	 * 业务系统ID,必须保证唯一性
规则：uid@时间戳
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 动态的文字内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 红包信息
	 */
	@ApiField("gift_info")
	private NewsfeedMediaGiftInfo giftInfo;

	/**
	 * 图片信息
	 */
	@ApiListField("img_infos")
	@ApiField("newsfeed_media_img")
	private List<NewsfeedMediaImg> imgInfos;

	/**
	 * 动态的标题信息
	 */
	@ApiField("label_info")
	private NewsfeedLabelInfo labelInfo;

	/**
	 * 链接信息（link类型时必填）
	 */
	@ApiField("link_info")
	private NewsfeedMediaLinkInfo linkInfo;

	/**
	 * 动态相关的地理位置（发给现场的动态必填）
	 */
	@ApiField("location_info")
	private NewsfeedLocationInfo locationInfo;

	/**
	 * 地理位置名称
	 */
	@ApiField("location_name")
	private String locationName;

	/**
	 * 地理位置跳转链接（当前支持https和alipay开头）
	 */
	@ApiField("location_scheme")
	private String locationScheme;

	/**
	 * 场景码,生活圈默认LFC
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 支持口碑评论等特殊类型需要的评分，不为空可显示星级评分
满分10分，每1分代表半颗星
	 */
	@ApiField("score")
	private Long score;

	/**
	 * 接口请求来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 用于标识来源app的图标
	 */
	@ApiField("source_icon")
	private String sourceIcon;

	/**
	 * 用于标识来源APP的名称
	 */
	@ApiField("source_name")
	private String sourceName;

	/**
	 * 个人动态扩散范围：0只生活圈，
1只现场，2既有生活圈也有现场
	 */
	@ApiField("spread_range")
	private Long spreadRange;

	/**
	 * 动态的类型：text纯文本，
image图片，video视频，link链接
，crossVideo横屏视频
	 */
	@ApiField("type")
	private String type;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * video信息（video、crossVideo类型时必填）
	 */
	@ApiField("video_info")
	private NewsfeedMediaVideoInfo videoInfo;

	/**
	 * 动态的可见性：0公开，1私密（仅本人可见）
	 */
	@ApiField("visible")
	private Long visible;

	/**
	 * 动态的可见范围
visible为0,1时，为空列表
visible为2时，表示可见的标签分组列表，
visible为3时，表示不可见的标签分组列表
	 */
	@ApiListField("visible_range")
	@ApiField("string")
	private List<String> visibleRange;

	/**
	 * 和谁在一起，用户列表
	 */
	@ApiListField("with_me")
	@ApiField("newsfeed_with_me_info")
	private List<NewsfeedWithMeInfo> withMe;

	public String getActivityAddress() {
		return this.activityAddress;
	}
	public void setActivityAddress(String activityAddress) {
		this.activityAddress = activityAddress;
	}

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getAid() {
		return this.aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public NewsfeedMediaGiftInfo getGiftInfo() {
		return this.giftInfo;
	}
	public void setGiftInfo(NewsfeedMediaGiftInfo giftInfo) {
		this.giftInfo = giftInfo;
	}

	public List<NewsfeedMediaImg> getImgInfos() {
		return this.imgInfos;
	}
	public void setImgInfos(List<NewsfeedMediaImg> imgInfos) {
		this.imgInfos = imgInfos;
	}

	public NewsfeedLabelInfo getLabelInfo() {
		return this.labelInfo;
	}
	public void setLabelInfo(NewsfeedLabelInfo labelInfo) {
		this.labelInfo = labelInfo;
	}

	public NewsfeedMediaLinkInfo getLinkInfo() {
		return this.linkInfo;
	}
	public void setLinkInfo(NewsfeedMediaLinkInfo linkInfo) {
		this.linkInfo = linkInfo;
	}

	public NewsfeedLocationInfo getLocationInfo() {
		return this.locationInfo;
	}
	public void setLocationInfo(NewsfeedLocationInfo locationInfo) {
		this.locationInfo = locationInfo;
	}

	public String getLocationName() {
		return this.locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLocationScheme() {
		return this.locationScheme;
	}
	public void setLocationScheme(String locationScheme) {
		this.locationScheme = locationScheme;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSourceIcon() {
		return this.sourceIcon;
	}
	public void setSourceIcon(String sourceIcon) {
		this.sourceIcon = sourceIcon;
	}

	public String getSourceName() {
		return this.sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public Long getSpreadRange() {
		return this.spreadRange;
	}
	public void setSpreadRange(Long spreadRange) {
		this.spreadRange = spreadRange;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public NewsfeedMediaVideoInfo getVideoInfo() {
		return this.videoInfo;
	}
	public void setVideoInfo(NewsfeedMediaVideoInfo videoInfo) {
		this.videoInfo = videoInfo;
	}

	public Long getVisible() {
		return this.visible;
	}
	public void setVisible(Long visible) {
		this.visible = visible;
	}

	public List<String> getVisibleRange() {
		return this.visibleRange;
	}
	public void setVisibleRange(List<String> visibleRange) {
		this.visibleRange = visibleRange;
	}

	public List<NewsfeedWithMeInfo> getWithMe() {
		return this.withMe;
	}
	public void setWithMe(List<NewsfeedWithMeInfo> withMe) {
		this.withMe = withMe;
	}

}
