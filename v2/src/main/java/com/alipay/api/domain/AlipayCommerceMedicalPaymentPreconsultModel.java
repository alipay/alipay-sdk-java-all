package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医保支付预咨询接口
 *
 * @author auto create
 * @since 1.0, 2024-05-13 19:02:26
 */
public class AlipayCommerceMedicalPaymentPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 5781528849355674146L;

	/**
	 * 定点医药机构所在地标准行政区划编码。可在<a href="http://xzqh.mca.gov.cn/map">民政部全国行政区划信息查询平台</a>查询
	 */
	@ApiField("payment_city_code")
	private String paymentCityCode;

	public String getPaymentCityCode() {
		return this.paymentCityCode;
	}
	public void setPaymentCityCode(String paymentCityCode) {
		this.paymentCityCode = paymentCityCode;
	}

}
