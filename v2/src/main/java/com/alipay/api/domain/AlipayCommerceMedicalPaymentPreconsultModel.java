package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医保支付预咨询接口
 *
 * @author auto create
 * @since 1.0, 2024-11-05 10:52:54
 */
public class AlipayCommerceMedicalPaymentPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 8669562534557187272L;

	/**
	 * 药店标签，在异地就医场景中用于判断门店是否支持异地医保结算
	 */
	@ApiField("drug_store_tag")
	private String drugStoreTag;

	/**
	 * 定点医药机构所在地标准行政区划编码。可在<a href="http://xzqh.mca.gov.cn/map">民政部全国行政区划信息查询平台</a>查询
	 */
	@ApiField("payment_city_code")
	private String paymentCityCode;

	public String getDrugStoreTag() {
		return this.drugStoreTag;
	}
	public void setDrugStoreTag(String drugStoreTag) {
		this.drugStoreTag = drugStoreTag;
	}

	public String getPaymentCityCode() {
		return this.paymentCityCode;
	}
	public void setPaymentCityCode(String paymentCityCode) {
		this.paymentCityCode = paymentCityCode;
	}

}
