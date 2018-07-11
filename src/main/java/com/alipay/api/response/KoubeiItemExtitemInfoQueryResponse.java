package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbExtItemInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.extitem.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-27 17:56:42
 */
public class KoubeiItemExtitemInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3395653271517828145L;

	/** 
	 * 外部商品信息
	 */
	@ApiField("kb_ext_item_info")
	private KbExtItemInfo kbExtItemInfo;

	public void setKbExtItemInfo(KbExtItemInfo kbExtItemInfo) {
		this.kbExtItemInfo = kbExtItemInfo;
	}
	public KbExtItemInfo getKbExtItemInfo( ) {
		return this.kbExtItemInfo;
	}

}
