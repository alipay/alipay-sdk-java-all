package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PoiInfoVo;
import com.alipay.api.domain.PoiListDayVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.travel.partner.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-14 17:22:10
 */
public class AlipayCloudCloudpromoTravelPartnerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6787285238569325511L;

	/** 
	 * 伴游开启状态
	 */
	@ApiField("assist_status")
	private String assistStatus;

	/** 
	 * 预计景点数
	 */
	@ApiField("attractions_count")
	private String attractionsCount;

	/** 
	 * 预计消耗卡路里
	 */
	@ApiField("calorie")
	private String calorie;

	/** 
	 * 当前POI景点信息
	 */
	@ApiField("current_poi_info")
	private PoiInfoVo currentPoiInfo;

	/** 
	 * 预计距离，单位米
	 */
	@ApiField("distance")
	private String distance;

	/** 
	 * 预计游玩时长，单位小时
	 */
	@ApiField("duration")
	private String duration;

	/** 
	 * 介绍
	 */
	@ApiField("introduction")
	private String introduction;

	/** 
	 * 伴游记录id
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 是否继续轮询（只有最新的&位置有效的要轮询）
	 */
	@ApiField("need_poll")
	private Boolean needPoll;

	/** 
	 * 下一个POI景点信息
	 */
	@ApiField("next_poi_info")
	private PoiInfoVo nextPoiInfo;

	/** 
	 * 下次轮询时间：秒
	 */
	@ApiField("next_poll_interval")
	private Long nextPollInterval;

	/** 
	 * 是否偏离路线
	 */
	@ApiField("off_route")
	private Boolean offRoute;

	/** 
	 * 每天途径的景点
	 */
	@ApiListField("poi_day_list")
	@ApiField("poi_list_day_vo")
	private List<PoiListDayVo> poiDayList;

	/** 
	 * 路线起始点位
	 */
	@ApiField("poly_line_point")
	private String polyLinePoint;

	/** 
	 * 地图的途径点位经纬度
	 */
	@ApiListField("polyline")
	@ApiField("string")
	private List<String> polyline;

	/** 
	 * 路线包含的景点title
	 */
	@ApiListField("route_view_points")
	@ApiField("string")
	private List<String> routeViewPoints;

	/** 
	 * 路线起始景点
	 */
	@ApiField("start_point")
	private PoiInfoVo startPoint;

	/** 
	 * 预计台阶数
	 */
	@ApiField("steps")
	private String steps;

	/** 
	 * 引导文案
	 */
	@ApiField("text")
	private String text;

	/** 
	 * 路线名称
	 */
	@ApiField("title")
	private String title;

	/** 
	 * 已经途经的景点
	 */
	@ApiListField("view_point")
	@ApiField("string")
	private List<String> viewPoint;

	/** 
	 * cube卡片的路线封面图
	 */
	@ApiField("view_point_image")
	private String viewPointImage;

	public void setAssistStatus(String assistStatus) {
		this.assistStatus = assistStatus;
	}
	public String getAssistStatus( ) {
		return this.assistStatus;
	}

	public void setAttractionsCount(String attractionsCount) {
		this.attractionsCount = attractionsCount;
	}
	public String getAttractionsCount( ) {
		return this.attractionsCount;
	}

	public void setCalorie(String calorie) {
		this.calorie = calorie;
	}
	public String getCalorie( ) {
		return this.calorie;
	}

	public void setCurrentPoiInfo(PoiInfoVo currentPoiInfo) {
		this.currentPoiInfo = currentPoiInfo;
	}
	public PoiInfoVo getCurrentPoiInfo( ) {
		return this.currentPoiInfo;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getDistance( ) {
		return this.distance;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDuration( ) {
		return this.duration;
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

	public void setNeedPoll(Boolean needPoll) {
		this.needPoll = needPoll;
	}
	public Boolean getNeedPoll( ) {
		return this.needPoll;
	}

	public void setNextPoiInfo(PoiInfoVo nextPoiInfo) {
		this.nextPoiInfo = nextPoiInfo;
	}
	public PoiInfoVo getNextPoiInfo( ) {
		return this.nextPoiInfo;
	}

	public void setNextPollInterval(Long nextPollInterval) {
		this.nextPollInterval = nextPollInterval;
	}
	public Long getNextPollInterval( ) {
		return this.nextPollInterval;
	}

	public void setOffRoute(Boolean offRoute) {
		this.offRoute = offRoute;
	}
	public Boolean getOffRoute( ) {
		return this.offRoute;
	}

	public void setPoiDayList(List<PoiListDayVo> poiDayList) {
		this.poiDayList = poiDayList;
	}
	public List<PoiListDayVo> getPoiDayList( ) {
		return this.poiDayList;
	}

	public void setPolyLinePoint(String polyLinePoint) {
		this.polyLinePoint = polyLinePoint;
	}
	public String getPolyLinePoint( ) {
		return this.polyLinePoint;
	}

	public void setPolyline(List<String> polyline) {
		this.polyline = polyline;
	}
	public List<String> getPolyline( ) {
		return this.polyline;
	}

	public void setRouteViewPoints(List<String> routeViewPoints) {
		this.routeViewPoints = routeViewPoints;
	}
	public List<String> getRouteViewPoints( ) {
		return this.routeViewPoints;
	}

	public void setStartPoint(PoiInfoVo startPoint) {
		this.startPoint = startPoint;
	}
	public PoiInfoVo getStartPoint( ) {
		return this.startPoint;
	}

	public void setSteps(String steps) {
		this.steps = steps;
	}
	public String getSteps( ) {
		return this.steps;
	}

	public void setText(String text) {
		this.text = text;
	}
	public String getText( ) {
		return this.text;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle( ) {
		return this.title;
	}

	public void setViewPoint(List<String> viewPoint) {
		this.viewPoint = viewPoint;
	}
	public List<String> getViewPoint( ) {
		return this.viewPoint;
	}

	public void setViewPointImage(String viewPointImage) {
		this.viewPointImage = viewPointImage;
	}
	public String getViewPointImage( ) {
		return this.viewPointImage;
	}

}
