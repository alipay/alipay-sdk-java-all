package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MiniprogramExtra;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.life.miniprogram.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-18 17:46:58
 */
public class AlipayMerchantLifeMiniprogramQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1246642584396724163L;

	/** 
	 * 生活号和业务关联的扩展信息
	 */
	@ApiField("extra")
	private MiniprogramExtra extra;

	/** 
	 * 生活号ID
	 */
	@ApiField("public_id")
	private String publicId;

	public void setExtra(MiniprogramExtra extra) {
		this.extra = extra;
	}
	public MiniprogramExtra getExtra( ) {
		return this.extra;
	}

	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	public String getPublicId( ) {
		return this.publicId;
	}

}
