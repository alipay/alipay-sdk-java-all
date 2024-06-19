package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商家商品信息拓展字段
 *
 * @author auto create
 * @since 1.0, 2024-01-03 14:48:58
 */
public class MerchantItemExtParam extends AlipayObject {

	private static final long serialVersionUID = 7137628238295597538L;

	/**
	 * 扩展信息查询，如淘宝定向优惠渠道参数，是否猫超商品等
	 */
	@ApiField("param_key")
	private String paramKey;

	/**
	 * 参数key对应的具体值
	 */
	@ApiField("param_value")
	private String paramValue;

	public String getParamKey() {
		return this.paramKey;
	}
	public void setParamKey(String paramKey) {
		this.paramKey = paramKey;
	}

	public String getParamValue() {
		return this.paramValue;
	}
	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

}
