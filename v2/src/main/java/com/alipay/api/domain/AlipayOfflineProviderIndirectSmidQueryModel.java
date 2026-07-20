package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间联商户smid查询
 *
 * @author auto create
 * @since 1.0, 2026-05-13 09:59:40
 */
public class AlipayOfflineProviderIndirectSmidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1168418667143352238L;

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
