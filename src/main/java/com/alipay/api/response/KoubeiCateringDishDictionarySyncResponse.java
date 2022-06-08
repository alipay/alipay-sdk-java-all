package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.dictionary.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-04 10:32:45
 */
public class KoubeiCateringDishDictionarySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5845726592755514419L;

	/** 
	 * 字典的数据id
	 */
	@ApiField("dictionary_id")
	private String dictionaryId;

	public void setDictionaryId(String dictionaryId) {
		this.dictionaryId = dictionaryId;
	}
	public String getDictionaryId( ) {
		return this.dictionaryId;
	}

}
