package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ExternalItemInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.inshealthserviceprod.mallitem.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-18 22:07:51
 */
public class AlipayInsSceneInshealthserviceprodMallitemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6382565444141223533L;

	/** 
	 * 商品信息
	 */
	@ApiField("item")
	private ExternalItemInfo item;

	public void setItem(ExternalItemInfo item) {
		this.item = item;
	}
	public ExternalItemInfo getItem( ) {
		return this.item;
	}

}
