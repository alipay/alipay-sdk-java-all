package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 余额宝外部渠道广告投放决策接口
 *
 * @author auto create
 * @since 1.0, 2019-01-28 15:18:51
 */
public class AntfortuneYebInfoAdvertisingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2119311595262161561L;

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
