package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbdishAreaInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.area.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:36:25
 */
public class KoubeiCateringDishAreaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2199569663985583341L;

	/** 
	 * 返回餐区大模型列表
	 */
	@ApiListField("kb_dish_area_list")
	@ApiField("kbdish_area_info")
	private List<KbdishAreaInfo> kbDishAreaList;

	public void setKbDishAreaList(List<KbdishAreaInfo> kbDishAreaList) {
		this.kbDishAreaList = kbDishAreaList;
	}
	public List<KbdishAreaInfo> getKbDishAreaList( ) {
		return this.kbDishAreaList;
	}

}
