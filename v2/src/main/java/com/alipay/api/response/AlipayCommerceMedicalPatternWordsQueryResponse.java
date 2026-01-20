package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PatternWord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.pattern.words.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-01 15:47:42
 */
public class AlipayCommerceMedicalPatternWordsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2396416166381844248L;

	/** 
	 * 底纹词数据列表
	 */
	@ApiListField("pattern_words")
	@ApiField("pattern_word")
	private List<PatternWord> patternWords;

	public void setPatternWords(List<PatternWord> patternWords) {
		this.patternWords = patternWords;
	}
	public List<PatternWord> getPatternWords( ) {
		return this.patternWords;
	}

}
