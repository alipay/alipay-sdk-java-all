package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发起呼叫
 *
 * @author auto create
 * @since 1.0, 2023-10-23 13:48:05
 */
public class AnttechOceanbaseObglobalMakecallCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7638566897162174221L;

	/**
	 * 发起外呼的请求体
	 */
	@ApiField("make_call_request")
	private MakeCallRequest makeCallRequest;

	public MakeCallRequest getMakeCallRequest() {
		return this.makeCallRequest;
	}
	public void setMakeCallRequest(MakeCallRequest makeCallRequest) {
		this.makeCallRequest = makeCallRequest;
	}

}
