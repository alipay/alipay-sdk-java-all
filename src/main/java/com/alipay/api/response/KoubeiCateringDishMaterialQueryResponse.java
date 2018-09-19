package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbdishMaterialInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.material.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-09-05 19:48:30
 */
public class KoubeiCateringDishMaterialQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7443682424875944146L;

	/** 
	 * 加料模型
	 */
	@ApiListField("kb_dish_material_info_list")
	@ApiField("kbdish_material_info")
	private List<KbdishMaterialInfo> kbDishMaterialInfoList;

	public void setKbDishMaterialInfoList(List<KbdishMaterialInfo> kbDishMaterialInfoList) {
		this.kbDishMaterialInfoList = kbDishMaterialInfoList;
	}
	public List<KbdishMaterialInfo> getKbDishMaterialInfoList( ) {
		return this.kbDishMaterialInfoList;
	}

}
