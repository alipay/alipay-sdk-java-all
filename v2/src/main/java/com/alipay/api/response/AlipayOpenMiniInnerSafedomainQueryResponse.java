package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.inner.safedomain.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:22
 */
public class AlipayOpenMiniInnerSafedomainQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8617419621244153752L;

	/** 
	 * 允许添加的最大域名数量限制
	 */
	@ApiField("allow_add_count")
	private Long allowAddCount;

	/** 
	 * 安全域名列表
	 */
	@ApiListField("safe_domains")
	@ApiField("string")
	private List<String> safeDomains;

	public void setAllowAddCount(Long allowAddCount) {
		this.allowAddCount = allowAddCount;
	}
	public Long getAllowAddCount( ) {
		return this.allowAddCount;
	}

	public void setSafeDomains(List<String> safeDomains) {
		this.safeDomains = safeDomains;
	}
	public List<String> getSafeDomains( ) {
		return this.safeDomains;
	}

}
