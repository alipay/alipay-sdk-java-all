package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能助理-IOT接口
 *
 * @author auto create
 * @since 1.0, 2022-09-29 13:02:07
 */
public class AlipayIserviceIotIntentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8731629418565435846L;

	/**
	 * iot入参
	 */
	@ApiField("iot_request")
	private IntentQueryRequest iotRequest;

	public IntentQueryRequest getIotRequest() {
		return this.iotRequest;
	}
	public void setIotRequest(IntentQueryRequest iotRequest) {
		this.iotRequest = iotRequest;
	}

}
