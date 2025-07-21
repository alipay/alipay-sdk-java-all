package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.relation.shopmember.add response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-02 10:48:16
 */
public class AlipayBusinessRelationShopmemberAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 3435893547235887323L;

	/** 
	 * 商业关系物理门店资产成员编号
	 */
	@ApiField("member_id")
	private String memberId;

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberId( ) {
		return this.memberId;
	}

}
