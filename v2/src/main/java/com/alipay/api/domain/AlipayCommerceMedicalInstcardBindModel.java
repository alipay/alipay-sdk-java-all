package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于支付宝用户通过医院服务窗绑定当地社保卡
 *
 * @author auto create
 * @since 1.0, 2022-02-17 14:07:51
 */
public class AlipayCommerceMedicalInstcardBindModel extends AlipayObject {

	private static final long serialVersionUID = 8791269943664667119L;

	/**
	 * 区域编码，使用国家行政区划代码，可参看
http://www.stats.gov.cn/tjsj/tjbz/xzqhdm
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 业务扩展参数
sys_service_provider_id:返佣商户标记
serial_no:商户业务序列号
return_params:外部商户提交给支付宝处理的请求参数,支付宝在整个处理过程中携带此参数。
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 机构编号
	 */
	@ApiField("ins_code")
	private String insCode;

	/**
	 * 支付宝处理完请求后，如验证成功，当前页面自动跳转到商户网站里指定页面的http路径。
	 */
	@ApiField("return_url")
	private String returnUrl;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getInsCode() {
		return this.insCode;
	}
	public void setInsCode(String insCode) {
		this.insCode = insCode;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

}
