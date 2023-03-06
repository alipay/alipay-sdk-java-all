package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsOpenYfxInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.yfx.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-01 13:56:39
 */
public class AlipayInsSceneYfxDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2333282566615635814L;

	/** 
	 * 运费险详情
	 */
	@ApiField("yfx_info")
	private InsOpenYfxInfoDTO yfxInfo;

	public void setYfxInfo(InsOpenYfxInfoDTO yfxInfo) {
		this.yfxInfo = yfxInfo;
	}
	public InsOpenYfxInfoDTO getYfxInfo( ) {
		return this.yfxInfo;
	}

}
