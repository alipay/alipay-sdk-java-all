package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康服务标的刷新接口
 *
 * @author auto create
 * @since 1.0, 2022-03-15 15:13:39
 */
public class AlipayInsSceneInshealthserviceprodItemRefreshModel extends AlipayObject {

	private static final long serialVersionUID = 2848498958439131374L;

	/**
	 * 支付宝的服务产品编号
	 */
	@ApiField("ant_ser_prod_no")
	private String antSerProdNo;

	/**
	 * 机构商品编码
	 */
	@ApiField("merchant_item_code")
	private String merchantItemCode;

	/**
	 * 刷新内容类型
	 */
	@ApiField("refresh_type")
	private String refreshType;

	public String getAntSerProdNo() {
		return this.antSerProdNo;
	}
	public void setAntSerProdNo(String antSerProdNo) {
		this.antSerProdNo = antSerProdNo;
	}

	public String getMerchantItemCode() {
		return this.merchantItemCode;
	}
	public void setMerchantItemCode(String merchantItemCode) {
		this.merchantItemCode = merchantItemCode;
	}

	public String getRefreshType() {
		return this.refreshType;
	}
	public void setRefreshType(String refreshType) {
		this.refreshType = refreshType;
	}

}
