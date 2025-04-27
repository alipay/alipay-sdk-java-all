package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.route.polyline.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-20 15:12:21
 */
public class AlipayCloudCloudpromoRoutePolylineQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7545737192371172815L;

	/** 
	 * 景点讲解文本
	 */
	@ApiField("audio_text")
	private String audioText;

	/** 
	 * 景点图片链接
	 */
	@ApiField("avatar")
	private String avatar;

	/** 
	 * 实时景点舒适度等级，无则为空
	 */
	@ApiField("comfort_level")
	private String comfortLevel;

	/** 
	 * 景点的历史探索片段
	 */
	@ApiField("historical_curiosities")
	private String historicalCuriosities;

	/** 
	 * 一句话介绍
	 */
	@ApiField("introduction")
	private String introduction;

	/** 
	 * poi的id
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/** 
	 * 推荐的交通方式
	 */
	@ApiField("line_type")
	private String lineType;

	/** 
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/** 
	 * 之间的路线点位
	 */
	@ApiListField("polyline")
	@ApiField("string")
	private List<String> polyline;

	/** 
	 * 景点标签
	 */
	@ApiField("tags")
	private String tags;

	/** 
	 * 景点名称
	 */
	@ApiField("title")
	private String title;

	/** 
	 * 线路长度,单位米、千米
	 */
	@ApiField("travel_distance")
	private String travelDistance;

	/** 
	 * 线路预计耗时，单位直接给出，分钟/小时/天
	 */
	@ApiField("travel_duration")
	private String travelDuration;

	public void setAudioText(String audioText) {
		this.audioText = audioText;
	}
	public String getAudioText( ) {
		return this.audioText;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getAvatar( ) {
		return this.avatar;
	}

	public void setComfortLevel(String comfortLevel) {
		this.comfortLevel = comfortLevel;
	}
	public String getComfortLevel( ) {
		return this.comfortLevel;
	}

	public void setHistoricalCuriosities(String historicalCuriosities) {
		this.historicalCuriosities = historicalCuriosities;
	}
	public String getHistoricalCuriosities( ) {
		return this.historicalCuriosities;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getIntroduction( ) {
		return this.introduction;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLatitude( ) {
		return this.latitude;
	}

	public void setLineType(String lineType) {
		this.lineType = lineType;
	}
	public String getLineType( ) {
		return this.lineType;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLongitude( ) {
		return this.longitude;
	}

	public void setPolyline(List<String> polyline) {
		this.polyline = polyline;
	}
	public List<String> getPolyline( ) {
		return this.polyline;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getTags( ) {
		return this.tags;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle( ) {
		return this.title;
	}

	public void setTravelDistance(String travelDistance) {
		this.travelDistance = travelDistance;
	}
	public String getTravelDistance( ) {
		return this.travelDistance;
	}

	public void setTravelDuration(String travelDuration) {
		this.travelDuration = travelDuration;
	}
	public String getTravelDuration( ) {
		return this.travelDuration;
	}

}
