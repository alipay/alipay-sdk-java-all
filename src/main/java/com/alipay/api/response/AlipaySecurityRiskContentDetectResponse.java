package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.content.detect response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-04 14:30:33
 */
public class AlipaySecurityRiskContentDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 1441763835835857779L;

	/** 
	 * 表示处理结果，REJECTED表示拦截，PASSED表示放过。
	 */
	@ApiField("action")
	private String action;

	/** 
	 * 命中的关键词列表
	 */
	@ApiListField("keywords")
	@ApiField("string")
	private List<String> keywords;

	/** 
	 * 业务唯一识别码，可用来对应异步识别结果
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public void setAction(String action) {
		this.action = action;
	}
	public String getAction( ) {
		return this.action;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}
	public List<String> getKeywords( ) {
		return this.keywords;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getUniqueId( ) {
		return this.uniqueId;
	}

}
