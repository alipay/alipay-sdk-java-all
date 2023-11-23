package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 洗车保养服务商品变更
 *
 * @author auto create
 * @since 1.0, 2017-04-12 11:49:05
 */
public class AlipayEcoMycarMaintainServiceproductUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 7283467898689534421L;

	/**
	 * 请求操作（INSERT：新增；MODIFY：修改；DELETE：删除；QUERY：查询）
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 外部服务商品标示，ISV保证唯一性。ISV同一门店同一服务项同一产品名称，只能配置一个商品。（存在同一服务项类目对应多个产品情况，5座普通洗车、5座SUV洗车）
	 */
	@ApiField("out_product_id")
	private String outProductId;

	/**
	 * 查询删除：否
新增修改：必填
	 */
	@ApiField("shop_product")
	private MaitainShopProduct shopProduct;

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getOutProductId() {
		return this.outProductId;
	}
	public void setOutProductId(String outProductId) {
		this.outProductId = outProductId;
	}

	public MaitainShopProduct getShopProduct() {
		return this.shopProduct;
	}
	public void setShopProduct(MaitainShopProduct shopProduct) {
		this.shopProduct = shopProduct;
	}

}
