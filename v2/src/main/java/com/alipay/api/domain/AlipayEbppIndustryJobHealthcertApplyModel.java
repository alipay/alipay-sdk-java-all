package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝就业电子健康证认证页申请
 *
 * @author auto create
 * @since 1.0, 2024-09-29 14:58:49
 */
public class AlipayEbppIndustryJobHealthcertApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8147795796816526128L;

	/**
	 * 使用支付宝就业健康证认证服务后，回跳到该商户指定的地址
	 */
	@ApiField("certify_return_url")
	private String certifyReturnUrl;

	/**
	 * 6位行政区域编码
至少到城市级编码，否则岗位无法展示，建议传到区(县)级编码，如: 浙江省杭州市西湖区=330106。
<a href="https://jiuye.yuque.com/org-wiki-jiuye-cpfcqs/araxo9/yi0uix3f0babcfzi">全量城市行政区划编码（2020Q1版本）</a>
<a href="https://jiuye.yuque.com/org-wiki-jiuye-cpfcqs/araxo9/ed5yn3asbtes7ni4">全量区县行政区划编码（2020Q1版本）</a>
	 */
	@ApiField("city_code")
	private String cityCode;

	public String getCertifyReturnUrl() {
		return this.certifyReturnUrl;
	}
	public void setCertifyReturnUrl(String certifyReturnUrl) {
		this.certifyReturnUrl = certifyReturnUrl;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

}
