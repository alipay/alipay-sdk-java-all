package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码门店录入
 *
 * @author auto create
 * @since 1.0, 2023-07-07 19:21:17
 */
public class AlipayCommerceEcShopCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8248318514745818464L;

	/**
	 * 操作人ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 服务商发布的服务id
	 */
	@ApiField("service_product_id")
	private String serviceProductId;

	/**
	 * 门店信息
	 */
	@ApiField("shop_info")
	private EcShop shopInfo;

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getServiceProductId() {
		return this.serviceProductId;
	}
	public void setServiceProductId(String serviceProductId) {
		this.serviceProductId = serviceProductId;
	}

	public EcShop getShopInfo() {
		return this.shopInfo;
	}
	public void setShopInfo(EcShop shopInfo) {
		this.shopInfo = shopInfo;
	}

}
