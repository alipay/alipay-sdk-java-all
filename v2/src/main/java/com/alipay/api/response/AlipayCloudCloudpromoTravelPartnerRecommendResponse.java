package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PoiInfoVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.travel.partner.recommend response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-14 16:57:22
 */
public class AlipayCloudCloudpromoTravelPartnerRecommendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3458355688153618712L;

	/** 
	 * 来源为智能体则给出智能体id，用于后续查询交互
	 */
	@ApiField("agent_id")
	private String agentId;

	/** 
	 * 伴游状态，WAITING("WAITING", "等待开启", "伴游中"),OPEN("OPEN", "开启", "伴游中"), STOP("STOP", "停止", "随心游暂停-可重新开启")
	 */
	@ApiField("assist_status")
	private String assistStatus;

	/** 
	 * 实时景点舒适度等级，无则为空
	 */
	@ApiField("comfort_level")
	private String comfortLevel;

	/** 
	 * 已游玩景点个数
	 */
	@ApiField("current_attraction_count")
	private String currentAttractionCount;

	/** 
	 * 已游玩距离，单位米、千米，已给出
	 */
	@ApiField("current_distance")
	private String currentDistance;

	/** 
	 * 已游玩耗时，单位分钟、小时、天
	 */
	@ApiField("current_duration")
	private String currentDuration;

	/** 
	 * 当前所在POI景点信息，没有则为空
	 */
	@ApiField("current_poi_info")
	private PoiInfoVo currentPoiInfo;

	/** 
	 * 是否在景区AOI范围内
	 */
	@ApiField("if_aoi_range")
	private Boolean ifAoiRange;

	/** 
	 * 随心游卡片记录唯一id
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 基于当前位置附近范围的景点列表，根据lbs动态刷新的
	 */
	@ApiListField("nearby_poi_list")
	@ApiField("poi_info_vo")
	private List<PoiInfoVo> nearbyPoiList;

	/** 
	 * 是否继续轮询（只有最新的随心游卡片要轮询）
	 */
	@ApiField("need_poll")
	private Boolean needPoll;

	/** 
	 * [{"latitude":"30.140215","lineType":"步行","longitude":"118.161578","tags":"热门景点","title":"排云亭","travelDistance":"192.11千米","travelDuration":"3时1分"},{"latitude":"30.135591","longitude":"118.163971","tags":"必玩景点","title":"飞来石"}]
	 */
	@ApiListField("next_nearest_poi_list")
	@ApiField("poi_info_vo")
	private List<PoiInfoVo> nextNearestPoiList;

	/** 
	 * 已途径的路线经纬度点位
	 */
	@ApiListField("polyline")
	@ApiField("string")
	private List<String> polyline;

	/** 
	 * 推荐文字，例如当前正在游览【迎客松】和下一站建议游玩【迎客松】
	 */
	@ApiField("text")
	private String text;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getAgentId( ) {
		return this.agentId;
	}

	public void setAssistStatus(String assistStatus) {
		this.assistStatus = assistStatus;
	}
	public String getAssistStatus( ) {
		return this.assistStatus;
	}

	public void setComfortLevel(String comfortLevel) {
		this.comfortLevel = comfortLevel;
	}
	public String getComfortLevel( ) {
		return this.comfortLevel;
	}

	public void setCurrentAttractionCount(String currentAttractionCount) {
		this.currentAttractionCount = currentAttractionCount;
	}
	public String getCurrentAttractionCount( ) {
		return this.currentAttractionCount;
	}

	public void setCurrentDistance(String currentDistance) {
		this.currentDistance = currentDistance;
	}
	public String getCurrentDistance( ) {
		return this.currentDistance;
	}

	public void setCurrentDuration(String currentDuration) {
		this.currentDuration = currentDuration;
	}
	public String getCurrentDuration( ) {
		return this.currentDuration;
	}

	public void setCurrentPoiInfo(PoiInfoVo currentPoiInfo) {
		this.currentPoiInfo = currentPoiInfo;
	}
	public PoiInfoVo getCurrentPoiInfo( ) {
		return this.currentPoiInfo;
	}

	public void setIfAoiRange(Boolean ifAoiRange) {
		this.ifAoiRange = ifAoiRange;
	}
	public Boolean getIfAoiRange( ) {
		return this.ifAoiRange;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setNearbyPoiList(List<PoiInfoVo> nearbyPoiList) {
		this.nearbyPoiList = nearbyPoiList;
	}
	public List<PoiInfoVo> getNearbyPoiList( ) {
		return this.nearbyPoiList;
	}

	public void setNeedPoll(Boolean needPoll) {
		this.needPoll = needPoll;
	}
	public Boolean getNeedPoll( ) {
		return this.needPoll;
	}

	public void setNextNearestPoiList(List<PoiInfoVo> nextNearestPoiList) {
		this.nextNearestPoiList = nextNearestPoiList;
	}
	public List<PoiInfoVo> getNextNearestPoiList( ) {
		return this.nextNearestPoiList;
	}

	public void setPolyline(List<String> polyline) {
		this.polyline = polyline;
	}
	public List<String> getPolyline( ) {
		return this.polyline;
	}

	public void setText(String text) {
		this.text = text;
	}
	public String getText( ) {
		return this.text;
	}

}
