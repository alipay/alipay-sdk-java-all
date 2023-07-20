package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 易联云极速授权回调接口服务
 *
 * @author auto create
 * @since 1.0, 2019-09-06 17:56:55
 */
public class AlipayEcoEprintCodeNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 7511715485484831451L;

	/**
	 * 授权code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 授权门店ID
	 */
	@ApiField("store_id")
	private String storeId;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
