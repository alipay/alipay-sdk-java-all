package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.dictionary.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 00:33:22
 */
public class KoubeiCateringDishDictionarySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2615593187342621799L;

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
