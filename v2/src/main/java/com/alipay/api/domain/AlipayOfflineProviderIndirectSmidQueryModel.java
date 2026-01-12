package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间联商户smid查询
 *
 * @author auto create
 * @since 1.0, 2025-12-19 15:05:24
 */
public class AlipayOfflineProviderIndirectSmidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5849244285919359293L;

	/**
	 * 码值
	 */
	@ApiField("origin_qrvalue")
	private String originQrvalue;

	public String getOriginQrvalue() {
		return this.originQrvalue;
	}
	public void setOriginQrvalue(String originQrvalue) {
		this.originQrvalue = originQrvalue;
	}

}
