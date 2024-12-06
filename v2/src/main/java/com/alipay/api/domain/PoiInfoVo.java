package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * POI景点数据
 *
 * @author auto create
 * @since 1.0, 2024-09-14 17:21:37
 */
public class PoiInfoVo extends AlipayObject {

	private static final long serialVersionUID = 4897673288695754872L;

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
	 * 景点图片
	 */
	@ApiListField("img_list")
	@ApiField("string")
	private List<String> imgList;

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

	public List<String> getImgList() {
		return this.imgList;
	}
	public void setImgList(List<String> imgList) {
		this.imgList = imgList;
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

}
