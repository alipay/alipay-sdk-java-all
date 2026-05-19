package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RainyComplexTypesTheThird;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.openidtestcase.rainytest.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-06 14:32:44
 */
public class AlipaySecurityDataOpenidtestcaseRainytestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6254689756981216399L;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * OPENid 相关的映射类型
	 */
	@ApiField("openid_complex")
	private RainyComplexTypesTheThird openidComplex;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOpenidComplex(RainyComplexTypesTheThird openidComplex) {
		this.openidComplex = openidComplex;
	}
	public RainyComplexTypesTheThird getOpenidComplex( ) {
		return this.openidComplex;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
