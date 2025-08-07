package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 1
 *
 * @author auto create
 * @since 1.0, 2025-04-25 18:22:27
 */
public class ResponseObjManjiangTest extends AlipayObject {

	private static final long serialVersionUID = 2689936272816422327L;

	/**
	 * 11
	 */
	@ApiField("repsponse_id_json")
	private String repsponseIdJson;

	public String getRepsponseIdJson() {
		return this.repsponseIdJson;
	}
	public void setRepsponseIdJson(String repsponseIdJson) {
		this.repsponseIdJson = repsponseIdJson;
	}

}
