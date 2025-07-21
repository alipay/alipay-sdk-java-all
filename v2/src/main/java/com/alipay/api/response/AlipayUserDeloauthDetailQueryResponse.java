package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DelOauthDetail;
import com.alipay.api.domain.DelOauthDetailResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.deloauth.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-26 20:02:05
 */
public class AlipayUserDeloauthDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4462826727981176645L;

	/** 
	 * 解除授权明细列表
	 */
	@ApiListField("details")
	@ApiField("del_oauth_detail")
	private List<DelOauthDetail> details;

	/** 
	 * 解除授权记录列表
	 */
	@ApiField("response")
	private DelOauthDetailResult response;

	public void setDetails(List<DelOauthDetail> details) {
		this.details = details;
	}
	public List<DelOauthDetail> getDetails( ) {
		return this.details;
	}

	public void setResponse(DelOauthDetailResult response) {
		this.response = response;
	}
	public DelOauthDetailResult getResponse( ) {
		return this.response;
	}

}
