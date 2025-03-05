package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PoiTagInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.customroute.poi.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-20 19:32:10
 */
public class AlipayCloudCloudpromoCustomroutePoiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8171986721785975333L;

	/** 
	 * item_id 为伴游卡片唯一id
	 */
	@ApiListField("poi_tag_info_list")
	@ApiField("poi_tag_info")
	private List<PoiTagInfo> poiTagInfoList;

	/** 
	 * 用户已经选择的景点id列表
	 */
	@ApiListField("selected_item_id_list")
	@ApiField("string")
	private List<String> selectedItemIdList;

	public void setPoiTagInfoList(List<PoiTagInfo> poiTagInfoList) {
		this.poiTagInfoList = poiTagInfoList;
	}
	public List<PoiTagInfo> getPoiTagInfoList( ) {
		return this.poiTagInfoList;
	}

	public void setSelectedItemIdList(List<String> selectedItemIdList) {
		this.selectedItemIdList = selectedItemIdList;
	}
	public List<String> getSelectedItemIdList( ) {
		return this.selectedItemIdList;
	}

}
