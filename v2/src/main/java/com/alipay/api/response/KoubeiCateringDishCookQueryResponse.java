package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbdishCookInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.cook.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:36:27
 */
public class KoubeiCateringDishCookQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2527146515245958817L;

	/** 
	 * 菜谱list
	 */
	@ApiListField("kb_cook_list")
	@ApiField("kbdish_cook_info")
	private List<KbdishCookInfo> kbCookList;

	public void setKbCookList(List<KbdishCookInfo> kbCookList) {
		this.kbCookList = kbCookList;
	}
	public List<KbdishCookInfo> getKbCookList( ) {
		return this.kbCookList;
	}

}
