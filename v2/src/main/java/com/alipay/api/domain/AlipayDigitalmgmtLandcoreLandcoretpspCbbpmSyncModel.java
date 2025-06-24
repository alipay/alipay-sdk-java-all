package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 置业成本-接收流程回调
 *
 * @author auto create
 * @since 1.0, 2024-04-11 19:40:25
 */
public class AlipayDigitalmgmtLandcoreLandcoretpspCbbpmSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4474584546976373132L;

	/**
	 * 流程唯一标识
	 */
	@ApiField("puid")
	private String puid;

	public String getPuid() {
		return this.puid;
	}
	public void setPuid(String puid) {
		this.puid = puid;
	}

}
