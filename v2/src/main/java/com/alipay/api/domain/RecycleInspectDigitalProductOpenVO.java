package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 3C产品质检扩展属性模型
 *
 * @author auto create
 * @since 1.0, 2025-08-21 14:42:01
 */
public class RecycleInspectDigitalProductOpenVO extends AlipayObject {

	private static final long serialVersionUID = 6573875498326424323L;

	/**
	 * imei号
	 */
	@ApiField("imei")
	private String imei;

	public String getImei() {
		return this.imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}

}
