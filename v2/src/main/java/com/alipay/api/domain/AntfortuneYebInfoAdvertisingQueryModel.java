package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 余额宝外部渠道广告投放决策接口
 *
 * @author auto create
 * @since 1.0, 2022-12-26 18:04:43
 */
public class AntfortuneYebInfoAdvertisingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7144356116353825188L;

	/**
	 * 参数名:mobile
应用场景:外部渠道传递手机号，由余额宝来判断是否需要进行投放并告知外部渠道
如何获取：外部渠道自己获取传过来
	 */
	@ApiField("mobile")
	private String mobile;

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
