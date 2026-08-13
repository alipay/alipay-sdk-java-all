package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商品信息
 *
 * @author auto create
 * @since 1.0, 2026-08-10 11:24:11
 */
public class AlipayInsSceneInshealthserviceprodMallitemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6553766163884889715L;

	/**
	 * 服务产品ID
	 */
	@ApiField("ser_prod_no")
	private String serProdNo;

	/**
	 * 商家商品Id
	 */
	@ApiField("source_product_id")
	private String sourceProductId;

	public String getSerProdNo() {
		return this.serProdNo;
	}
	public void setSerProdNo(String serProdNo) {
		this.serProdNo = serProdNo;
	}

	public String getSourceProductId() {
		return this.sourceProductId;
	}
	public void setSourceProductId(String sourceProductId) {
		this.sourceProductId = sourceProductId;
	}

}
