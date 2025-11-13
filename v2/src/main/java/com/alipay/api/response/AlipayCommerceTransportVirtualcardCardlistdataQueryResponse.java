package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SubSceneCardModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.virtualcard.cardlistdata.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-04 17:02:35
 */
public class AlipayCommerceTransportVirtualcardCardlistdataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1382987842295772741L;

	/** 
	 * 子场景卡列表
	 */
	@ApiListField("identification_card_list")
	@ApiField("sub_scene_card_model")
	private List<SubSceneCardModel> identificationCardList;

	public void setIdentificationCardList(List<SubSceneCardModel> identificationCardList) {
		this.identificationCardList = identificationCardList;
	}
	public List<SubSceneCardModel> getIdentificationCardList( ) {
		return this.identificationCardList;
	}

}
