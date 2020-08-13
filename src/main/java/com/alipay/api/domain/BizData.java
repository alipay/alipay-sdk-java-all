package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区素材对象
 *
 * @author auto create
 * @since 1.0, 2019-12-03 14:17:04
 */
public class BizData extends AlipayObject {

	private static final long serialVersionUID = 1282685351478421251L;

	/**
	 * 素材内容数据
	 */
	@ApiField("data")
	private String data;

	/**
	 * 业务数据唯一标识
	 */
	@ApiField("key")
	private String key;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

}
