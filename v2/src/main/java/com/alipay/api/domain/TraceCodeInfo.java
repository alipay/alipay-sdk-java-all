package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品追溯码信息
 *
 * @author auto create
 * @since 1.0, 2025-01-16 14:28:37
 */
public class TraceCodeInfo extends AlipayObject {

	private static final long serialVersionUID = 8668142391949675715L;

	/**
	 * APP方商品编码，对应商品接口的sku_code｜商品编码
	 */
	@ApiField("app_item_code")
	private String appItemCode;

	/**
	 * 商品追溯码集合
	 */
	@ApiListField("trace_codes")
	@ApiField("string")
	private List<String> traceCodes;

	public String getAppItemCode() {
		return this.appItemCode;
	}
	public void setAppItemCode(String appItemCode) {
		this.appItemCode = appItemCode;
	}

	public List<String> getTraceCodes() {
		return this.traceCodes;
	}
	public void setTraceCodes(List<String> traceCodes) {
		this.traceCodes = traceCodes;
	}

}
