package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FinEquityInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.marketing.user.thirdpartequity.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:18
 */
public class AntfortuneMarketingUserThirdpartequityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3888677451645891378L;

	/** 
	 * 权益基础信息
	 */
	@ApiListField("equity_info")
	@ApiField("fin_equity_info")
	private List<FinEquityInfo> equityInfo;

	/** 
	 * 是否推荐重试
	 */
	@ApiField("should_retry")
	private Boolean shouldRetry;

	public void setEquityInfo(List<FinEquityInfo> equityInfo) {
		this.equityInfo = equityInfo;
	}
	public List<FinEquityInfo> getEquityInfo( ) {
		return this.equityInfo;
	}

	public void setShouldRetry(Boolean shouldRetry) {
		this.shouldRetry = shouldRetry;
	}
	public Boolean getShouldRetry( ) {
		return this.shouldRetry;
	}

}
