package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KeyWordInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.subservicekeyword.querystatus response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 16:01:50
 */
public class AlipayOpenSearchSubservicekeywordQuerystatusResponse extends AlipayResponse {

	private static final long serialVersionUID = 6272473959434587962L;

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
