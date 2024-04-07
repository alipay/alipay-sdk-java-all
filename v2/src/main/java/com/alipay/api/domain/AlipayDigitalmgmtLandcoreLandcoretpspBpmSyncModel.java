package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁置业-BPM回调
 *
 * @author auto create
 * @since 1.0, 2024-04-01 10:45:30
 */
public class AlipayDigitalmgmtLandcoreLandcoretpspBpmSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4276219942482464352L;

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
