package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KeyWordInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.appkeyword.querystatus response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-02 14:35:07
 */
public class AlipayOpenSearchAppkeywordQuerystatusResponse extends AlipayResponse {

	private static final long serialVersionUID = 1545364348585711459L;

	/** 
	 * 关键词工单审核状态返回值
	 */
	@ApiListField("key_words")
	@ApiField("key_word_info")
	private List<KeyWordInfo> keyWords;

	public void setKeyWords(List<KeyWordInfo> keyWords) {
		this.keyWords = keyWords;
	}
	public List<KeyWordInfo> getKeyWords( ) {
		return this.keyWords;
	}

}
