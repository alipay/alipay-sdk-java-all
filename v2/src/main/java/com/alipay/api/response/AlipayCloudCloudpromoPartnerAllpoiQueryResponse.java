package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PoiInfoVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.partner.allpoi.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-20 15:07:32
 */
public class AlipayCloudCloudpromoPartnerAllpoiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4236912781955298478L;

	/** 
	 * 当前智能体的id
	 */
	@ApiField("agent_id")
	private String agentId;

	/** 
	 * 伴游记录id
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 基于当前位置下一站推荐的景点列表
	 */
	@ApiField("next_nearest_poi_list")
	private PoiInfoVo nextNearestPoiList;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getAgentId( ) {
		return this.agentId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setNextNearestPoiList(PoiInfoVo nextNearestPoiList) {
		this.nextNearestPoiList = nextNearestPoiList;
	}
	public PoiInfoVo getNextNearestPoiList( ) {
		return this.nextNearestPoiList;
	}

}
