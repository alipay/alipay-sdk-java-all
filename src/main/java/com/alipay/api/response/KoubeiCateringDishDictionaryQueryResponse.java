package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbdishDictionary;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.dictionary.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 11:24:09
 */
public class KoubeiCateringDishDictionaryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8392262773241577422L;

	/** 
	 * 返回的字典数据列表
	 */
	@ApiListField("kb_dish_dictionary_list")
	@ApiField("kbdish_dictionary")
	private List<KbdishDictionary> kbDishDictionaryList;

	public void setKbDishDictionaryList(List<KbdishDictionary> kbDishDictionaryList) {
		this.kbDishDictionaryList = kbDishDictionaryList;
	}
	public List<KbdishDictionary> getKbDishDictionaryList( ) {
		return this.kbDishDictionaryList;
	}

}
