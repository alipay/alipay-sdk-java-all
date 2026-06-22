package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TrafficCardInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.trafficcards.card.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-16 19:37:43
 */
public class AlipayCommerceTransportTrafficcardsCardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8796652431116916943L;

	/** 
	 * null
	 */
	@ApiListField("bus_card_list")
	@ApiField("traffic_card_info")
	private List<TrafficCardInfo> busCardList;

	/** 
	 * 公交乘车卡通用描述，可用于前端展示
	 */
	@ApiField("bus_scene_desc")
	private String busSceneDesc;

	/** 
	 * 该字段代表是否查询到有效的乘车卡数据，true代表已查询到有效的乘车卡数据，false代表未查询到
	 */
	@ApiField("has_valid_card")
	private Boolean hasValidCard;

	/** 
	 * null
	 */
	@ApiListField("metro_card_list")
	@ApiField("traffic_card_info")
	private List<TrafficCardInfo> metroCardList;

	/** 
	 * 地铁乘车卡通用描述，可用于前端展示
	 */
	@ApiField("metro_scene_desc")
	private String metroSceneDesc;

	public void setBusCardList(List<TrafficCardInfo> busCardList) {
		this.busCardList = busCardList;
	}
	public List<TrafficCardInfo> getBusCardList( ) {
		return this.busCardList;
	}

	public void setBusSceneDesc(String busSceneDesc) {
		this.busSceneDesc = busSceneDesc;
	}
	public String getBusSceneDesc( ) {
		return this.busSceneDesc;
	}

	public void setHasValidCard(Boolean hasValidCard) {
		this.hasValidCard = hasValidCard;
	}
	public Boolean getHasValidCard( ) {
		return this.hasValidCard;
	}

	public void setMetroCardList(List<TrafficCardInfo> metroCardList) {
		this.metroCardList = metroCardList;
	}
	public List<TrafficCardInfo> getMetroCardList( ) {
		return this.metroCardList;
	}

	public void setMetroSceneDesc(String metroSceneDesc) {
		this.metroSceneDesc = metroSceneDesc;
	}
	public String getMetroSceneDesc( ) {
		return this.metroSceneDesc;
	}

}
