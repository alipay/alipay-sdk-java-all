package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MiniprogramExtra;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.life.miniprogram.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-27 08:40:33
 */
public class AlipayMerchantLifeMiniprogramQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5473339928348368857L;

	/** 
	 * 生活号和业务关联的扩展信息
	 */
	@ApiField("extra")
	private MiniprogramExtra extra;

	/** 
	 * 操作员类型
	 */
	@ApiField("ops_type")
	private String opsType;

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

	public void setOpsType(String opsType) {
		this.opsType = opsType;
	}
	public String getOpsType( ) {
		return this.opsType;
	}

	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	public String getPublicId( ) {
		return this.publicId;
	}

}
