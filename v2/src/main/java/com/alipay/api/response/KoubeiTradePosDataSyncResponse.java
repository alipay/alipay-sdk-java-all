package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.pos.data.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 15:19:51
 */
public class KoubeiTradePosDataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3794543557486266213L;

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
