package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.dictionary.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-08 17:21:16
 */
public class KoubeiCateringDishDictionarySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3272457418293479562L;

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
