package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.order.sign response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-02 14:27:43
 */
public class AlipayCommerceRentOrderSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 1227255265632336697L;

	/** 
	 * 签约方式，使用插件拉起受理台进行签约，具体使用方法请参考 <a href="https://opendocs.alipay.com/solution/0h845z?pathHash=d2c7ca4f#%E7%AD%BE%E7%BA%A6%E8%AE%A2%E5%8D%95" target="_blank">接入指南-签约订单</a>
	 */
	@ApiField("sign_launch_method")
	private String signLaunchMethod;

	/** 
	 * 授权签名字符串
	 */
	@ApiField("sign_str")
	private String signStr;

	public void setSignLaunchMethod(String signLaunchMethod) {
		this.signLaunchMethod = signLaunchMethod;
	}
	public String getSignLaunchMethod( ) {
		return this.signLaunchMethod;
	}

	public void setSignStr(String signStr) {
		this.signStr = signStr;
	}
	public String getSignStr( ) {
		return this.signStr;
	}

}
