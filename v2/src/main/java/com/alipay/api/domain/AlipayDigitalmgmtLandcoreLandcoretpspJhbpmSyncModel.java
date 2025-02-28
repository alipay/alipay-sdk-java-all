package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 置业计划-接收流程回调
 *
 * @author auto create
 * @since 1.0, 2024-04-09 09:58:07
 */
public class AlipayDigitalmgmtLandcoreLandcoretpspJhbpmSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3263444994361372118L;

	/**
	 * 蚂蚁方创建流程时对应的puid
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
