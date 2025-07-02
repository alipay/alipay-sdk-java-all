package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * POI景点数据
 *
 * @author auto create
 * @since 1.0, 2025-01-14 16:53:22
 */
public class PoiInfoVo extends AlipayObject {

	private static final long serialVersionUID = 5334264665593671785L;

	/**
	 * 景点详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 音频文本
	 */
	@ApiField("audio_text")
	private String audioText;

	/**
	 * 景区音频
	 */
	@ApiField("audio_url")
	private String audioUrl;

	/**
	 * 头像图片
	 */
	@ApiField("avatar")
	private String avatar;

	/**
	 * 商业链接
	 */
	@ApiField("buy_url")
	private String buyUrl;

	/**
	 * 景点当前的舒适度等级
	 */
	@ApiField("comfort_level")
	private String comfortLevel;

	/**
	 * 中文描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 距离，单位米
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 景点的历史趣闻
	 */
	@ApiField("historical_curiosities")
	private String historicalCuriosities;

	/**
	 * 景点图片
	 */
	@ApiListField("img_list")
	@ApiField("string")
	private List<String> imgList;

	/**
	 * 景点的一句话介绍
	 */
	@ApiField("introduction")
	private String introduction;

	/**
	 * 景点ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 两景点间推荐交通方式
	 */
	@ApiField("line_type")
	private String lineType;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 直线距离，单位米
	 */
	@ApiField("meters")
	private Long meters;

	/**
	 * 拍照建议图片
	 */
	@ApiListField("photo_suggest_image_list")
	@ApiField("string")
	private List<String> photoSuggestImageList;

	/**
	 * 拍照建议文案
	 */
	@ApiField("photo_suggest_text")
	private String photoSuggestText;

	/**
	 * 位置类型
	 */
	@ApiField("poi_type")
	private String poiType;

	/**
	 * 当前位置到景点的推荐路线经纬度坐标列表
	 */
	@ApiListField("polyline")
	@ApiField("string")
	private List<String> polyline;

	/**
	 * 关联的商家
	 */
	@ApiListField("related_merchant_list")
	@ApiField("string")
	private List<String> relatedMerchantList;

	/**
	 * 关联的门票
	 */
	@ApiListField("related_ticket_list")
	@ApiField("string")
	private List<String> relatedTicketList;

	/**
	 * 标签
	 */
	@ApiField("tags")
	private String tags;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 路线预计长度，单位米
	 */
	@ApiField("travel_distance")
	private String travelDistance;

	/**
	 * 路线预计耗时，如10分钟，1时1分
	 */
	@ApiField("travel_duration")
	private String travelDuration;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAudioText() {
		return this.audioText;
	}
	public void setAudioText(String audioText) {
		this.audioText = audioText;
	}

	public String getAudioUrl() {
		return this.audioUrl;
	}
	public void setAudioUrl(String audioUrl) {
		this.audioUrl = audioUrl;
	}

	public String getAvatar() {
		return this.avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getBuyUrl() {
		return this.buyUrl;
	}
	public void setBuyUrl(String buyUrl) {
		this.buyUrl = buyUrl;
	}

	public String getComfortLevel() {
		return this.comfortLevel;
	}
	public void setComfortLevel(String comfortLevel) {
		this.comfortLevel = comfortLevel;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDistance() {
		return this.distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getHistoricalCuriosities() {
		return this.historicalCuriosities;
	}
	public void setHistoricalCuriosities(String historicalCuriosities) {
		this.historicalCuriosities = historicalCuriosities;
	}

	public List<String> getImgList() {
		return this.imgList;
	}
	public void setImgList(List<String> imgList) {
		this.imgList = imgList;
	}

	public String getIntroduction() {
		return this.introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLineType() {
		return this.lineType;
	}
	public void setLineType(String lineType) {
		this.lineType = lineType;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Long getMeters() {
		return this.meters;
	}
	public void setMeters(Long meters) {
		this.meters = meters;
	}

	public List<String> getPhotoSuggestImageList() {
		return this.photoSuggestImageList;
	}
	public void setPhotoSuggestImageList(List<String> photoSuggestImageList) {
		this.photoSuggestImageList = photoSuggestImageList;
	}

	public String getPhotoSuggestText() {
		return this.photoSuggestText;
	}
	public void setPhotoSuggestText(String photoSuggestText) {
		this.photoSuggestText = photoSuggestText;
	}

	public String getPoiType() {
		return this.poiType;
	}
	public void setPoiType(String poiType) {
		this.poiType = poiType;
	}

	public List<String> getPolyline() {
		return this.polyline;
	}
	public void setPolyline(List<String> polyline) {
		this.polyline = polyline;
	}

	public List<String> getRelatedMerchantList() {
		return this.relatedMerchantList;
	}
	public void setRelatedMerchantList(List<String> relatedMerchantList) {
		this.relatedMerchantList = relatedMerchantList;
	}

	public List<String> getRelatedTicketList() {
		return this.relatedTicketList;
	}
	public void setRelatedTicketList(List<String> relatedTicketList) {
		this.relatedTicketList = relatedTicketList;
	}

	public String getTags() {
		return this.tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTravelDistance() {
		return this.travelDistance;
	}
	public void setTravelDistance(String travelDistance) {
		this.travelDistance = travelDistance;
	}

	public String getTravelDuration() {
		return this.travelDuration;
	}
	public void setTravelDuration(String travelDuration) {
		this.travelDuration = travelDuration;
	}

}
