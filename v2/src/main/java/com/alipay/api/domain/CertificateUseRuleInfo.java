package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证核销规则
 *
 * @author auto create
 * @since 1.0, 2023-08-24 17:20:06
 */
public class CertificateUseRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 6246535262139581521L;

	/**
	 * 对应本地生活商品模版属性中的时间限制(use_limit)，参考本地生活商品模板文档：https://opendocs.alipay.com/pre-open/07pywg?pathHash=1c499cb5
	 */
	@ApiField("use_limit")
	private String useLimit;

	/**
	 * 对应本地生活商品模版属性中的使用张数限制(use_num_limit)，参考本地生活商品模板文档：https://opendocs.alipay.com/pre-open/07pywg?pathHash=1c499cb5
	 */
	@ApiField("use_num_limit")
	private String useNumLimit;

	public String getUseLimit() {
		return this.useLimit;
	}
	public void setUseLimit(String useLimit) {
		this.useLimit = useLimit;
	}

	public String getUseNumLimit() {
		return this.useNumLimit;
	}
	public void setUseNumLimit(String useNumLimit) {
		this.useNumLimit = useNumLimit;
	}

}
