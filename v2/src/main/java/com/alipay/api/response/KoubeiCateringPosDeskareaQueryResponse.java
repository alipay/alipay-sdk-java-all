package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeskAreaEntity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.deskarea.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 23:51:23
 */
public class KoubeiCateringPosDeskareaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1858386848329455576L;

	/** 
	 * 餐区信息
	 */
	@ApiListField("pos_desk_area_list")
	@ApiField("desk_area_entity")
	private List<DeskAreaEntity> posDeskAreaList;

	public void setPosDeskAreaList(List<DeskAreaEntity> posDeskAreaList) {
		this.posDeskAreaList = posDeskAreaList;
	}
	public List<DeskAreaEntity> getPosDeskAreaList( ) {
		return this.posDeskAreaList;
	}

}
