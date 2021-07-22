package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.pos.data.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-27 16:37:57
 */
public class KoubeiTradePosDataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3357482762554846342L;

	/** 
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}
	public String getExtInfos( ) {
		return this.extInfos;
	}

}
