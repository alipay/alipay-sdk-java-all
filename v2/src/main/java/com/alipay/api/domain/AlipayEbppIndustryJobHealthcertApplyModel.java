package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝就业电子健康证认证页申请
 *
 * @author auto create
 * @since 1.0, 2024-11-07 19:18:52
 */
public class AlipayEbppIndustryJobHealthcertApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7186842527822936732L;

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

	/**
	 * 条件必填，授权失败回跳地址
回跳方式=TO_MINI_PROGRAM时必填，可以和certify_return_url一致；
回跳方式=BACK_MINI_PROGRAM时该入参无效
	 */
	@ApiField("fail_return_url")
	private String failReturnUrl;

	/**
	 * 回跳方式：

TO_MINI_PROGRAM，打开新的应用模式，支持小程序和三方APP调用授权页

BACK_MINI_PROGRAM，返回原小程序模式，使用该模式时授权后回到原有页面
若参数为空，默认为BACK_MINI_PROGRAM
	 */
	@ApiField("jump_type")
	private String jumpType;

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

	public String getFailReturnUrl() {
		return this.failReturnUrl;
	}
	public void setFailReturnUrl(String failReturnUrl) {
		this.failReturnUrl = failReturnUrl;
	}

	public String getJumpType() {
		return this.jumpType;
	}
	public void setJumpType(String jumpType) {
		this.jumpType = jumpType;
	}

}
