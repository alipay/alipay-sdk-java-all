package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品上下架
 *
 * @author auto create
 * @since 1.0, 2024-11-14 19:51:54
 */
public class AlipayMerchantSolcreditserviceprodProductstatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4389529588449971279L;

	/**
	 * 系统生成的商品编号
	 */
	@ApiField("product_no")
	private String productNo;

	/**
	 * 上架: PRODUCT_UP;下架: PRODUCT_DOWN
	 */
	@ApiField("product_status")
	private String productStatus;

	public String getProductNo() {
		return this.productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getProductStatus() {
		return this.productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

}
