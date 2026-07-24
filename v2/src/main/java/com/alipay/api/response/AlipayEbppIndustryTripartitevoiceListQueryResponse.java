package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TripartiteVoice;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.tripartitevoice.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-29 10:47:50
 */
public class AlipayEbppIndustryTripartitevoiceListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5178179574471623666L;

	/** 
	 * 总条数
	 */
	@ApiField("total_count")
	private String totalCount;

	/** 
	 * null
	 */
	@ApiListField("voice_list")
	@ApiField("tripartite_voice")
	private List<TripartiteVoice> voiceList;

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

	public void setVoiceList(List<TripartiteVoice> voiceList) {
		this.voiceList = voiceList;
	}
	public List<TripartiteVoice> getVoiceList( ) {
		return this.voiceList;
	}

}
