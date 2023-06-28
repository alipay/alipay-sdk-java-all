package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeskEntity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.desk.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 19:52:59
 */
public class KoubeiCateringPosDeskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3727458682769376262L;

	/** 
	 * 餐台信息
	 */
	@ApiListField("pos_desk_list")
	@ApiField("desk_entity")
	private List<DeskEntity> posDeskList;

	public void setPosDeskList(List<DeskEntity> posDeskList) {
		this.posDeskList = posDeskList;
	}
	public List<DeskEntity> getPosDeskList( ) {
		return this.posDeskList;
	}

}
