package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户限制模型
 *
 * @author auto create
 * @since 1.0, 2022-08-16 17:43:43
 */
public class MerchantLimit extends AlipayObject {

	private static final long serialVersionUID = 3252657433517544617L;

	/**
	 * 限制的商户列表。商户的SMID或者PID。若想设置无限制类型，则只传单个ALL值
	 */
	@ApiListField("limit_merchant_list")
	@ApiField("string")
	private List<String> limitMerchantList;

	/**
	 * 限制类型：
WHITELIST-白名单
BLACKLIST-黑名单
	 */
	@ApiField("limit_type")
	private String limitType;

	public List<String> getLimitMerchantList() {
		return this.limitMerchantList;
	}
	public void setLimitMerchantList(List<String> limitMerchantList) {
		this.limitMerchantList = limitMerchantList;
	}

	public String getLimitType() {
		return this.limitType;
	}
	public void setLimitType(String limitType) {
		this.limitType = limitType;
	}

}
