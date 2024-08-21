package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放平台系统接口测试（新上下文_默认场景_输出PID_输出OID）	
 *
 * @author auto create
 * @since 1.0, 2020-07-20 19:42:23
 */
public class AlipayOpenAppSystemNewcontextupiduoidTransferModel extends AlipayObject {

	private static final long serialVersionUID = 1889416525368713329L;

	/**
	 * 101
	 */
	@ApiField("param_one")
	private String paramOne;

	public String getParamOne() {
		return this.paramOne;
	}
	public void setParamOne(String paramOne) {
		this.paramOne = paramOne;
	}

}
