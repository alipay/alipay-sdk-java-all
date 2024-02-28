package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放平台系统接口测试（老上下文_默认场景_输入PID_不输出OID）
 *
 * @author auto create
 * @since 1.0, 2021-06-29 21:16:22
 */
public class AlipayOpenAppSystemOldcontextTransferModel extends AlipayObject {

	private static final long serialVersionUID = 2648864236445199275L;

	/**
	 * 10
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
