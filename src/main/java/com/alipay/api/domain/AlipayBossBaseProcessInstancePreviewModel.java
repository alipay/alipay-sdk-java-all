package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预演流程接口
 *
 * @author auto create
 * @since 1.0, 2022-03-18 10:20:46
 */
public class AlipayBossBaseProcessInstancePreviewModel extends AlipayObject {

	private static final long serialVersionUID = 5651319111153335454L;

	/**
	 * 流程实例Id
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
