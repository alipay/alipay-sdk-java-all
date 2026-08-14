package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ExternalItemInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.inshealthserviceprod.mallitem.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-10 11:27:48
 */
public class AlipayInsSceneInshealthserviceprodMallitemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7867179388724898691L;

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
