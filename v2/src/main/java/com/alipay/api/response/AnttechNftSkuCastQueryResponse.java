package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.sku.cast.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-11 15:46:25
 */
public class AnttechNftSkuCastQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1645756813499683133L;

	/** 
	 * 申请状态
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/** 
	 * 铸造状态描述
	 */
	@ApiField("desc")
	private String desc;

	/** 
	 * 铸造成功生成的藏品skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}
	public String getApplyStatus( ) {
		return this.applyStatus;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc( ) {
		return this.desc;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	public String getSkuId( ) {
		return this.skuId;
	}

}
