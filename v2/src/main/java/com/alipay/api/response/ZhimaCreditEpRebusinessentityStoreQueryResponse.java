package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RebusinessEntityRelation;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.rebusinessentity.store.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-04 13:57:34
 */
public class ZhimaCreditEpRebusinessentityStoreQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1436919825186777613L;

	/** 
	 * 关系数据集
	 */
	@ApiField("data")
	private RebusinessEntityRelation data;

	/** 
	 * 店铺平台ID
	 */
	@ApiField("platform_id")
	private String platformId;

	/** 
	 * 店铺ID
	 */
	@ApiField("store_id")
	private String storeId;

	public void setData(RebusinessEntityRelation data) {
		this.data = data;
	}
	public RebusinessEntityRelation getData( ) {
		return this.data;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}
	public String getPlatformId( ) {
		return this.platformId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getStoreId( ) {
		return this.storeId;
	}

}
