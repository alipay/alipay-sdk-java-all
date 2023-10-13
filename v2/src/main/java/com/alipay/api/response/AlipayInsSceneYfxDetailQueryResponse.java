package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsOpenYfxInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.yfx.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-25 20:16:49
 */
public class AlipayInsSceneYfxDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3461684737698525168L;

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
