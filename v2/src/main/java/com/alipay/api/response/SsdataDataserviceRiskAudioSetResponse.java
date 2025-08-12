package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.audio.set response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-05 15:50:08
 */
public class SsdataDataserviceRiskAudioSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7271878766237131618L;

	/** 
	 * 查询出的关键词数量
	 */
	@ApiField("count")
	private String count;

	/** 
	 * 关键词结果
	 */
	@ApiListField("keyword_list")
	@ApiField("string")
	private List<String> keywordList;

	/** 
	 * 结果是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setCount(String count) {
		this.count = count;
	}
	public String getCount( ) {
		return this.count;
	}

	public void setKeywordList(List<String> keywordList) {
		this.keywordList = keywordList;
	}
	public List<String> getKeywordList( ) {
		return this.keywordList;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
