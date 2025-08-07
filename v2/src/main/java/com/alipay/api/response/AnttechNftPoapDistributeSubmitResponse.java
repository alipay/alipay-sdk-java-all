package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.poap.distribute.submit response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-17 17:37:28
 */
public class AnttechNftPoapDistributeSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 2581179946197314371L;

	/** 
	 * 勋章ID
	 */
	@ApiField("medal_id")
	private String medalId;

	/** 
	 * 勋章元数据id
	 */
	@ApiField("medal_meta_id")
	private Long medalMetaId;

	public void setMedalId(String medalId) {
		this.medalId = medalId;
	}
	public String getMedalId( ) {
		return this.medalId;
	}

	public void setMedalMetaId(Long medalMetaId) {
		this.medalMetaId = medalMetaId;
	}
	public Long getMedalMetaId( ) {
		return this.medalMetaId;
	}

}
