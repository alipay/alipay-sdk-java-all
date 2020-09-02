package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.dictionary.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-02 11:58:02
 */
public class KoubeiCateringDishDictionarySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7272926833357266577L;

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
