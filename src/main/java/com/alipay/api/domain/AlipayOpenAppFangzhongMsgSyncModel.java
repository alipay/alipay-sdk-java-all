package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 方仲入口消息测试接口
 *
 * @author auto create
 * @since 1.0, 2019-02-14 18:17:22
 */
public class AlipayOpenAppFangzhongMsgSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8312223433316963191L;

	/**
	 * aaa111
	 */
	@ApiField("key_a")
	private String keyA;

	public String getKeyA() {
		return this.keyA;
	}
	public void setKeyA(String keyA) {
		this.keyA = keyA;
	}

}
