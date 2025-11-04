package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益模板查询
 *
 * @author auto create
 * @since 1.0, 2024-05-27 13:58:32
 */
public class AlipayAssetPointVoucherprodBenefittemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1625424779193681469L;

	/**
	 * 资产id，即权益模板id，创建权益模板时返回的id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 资产类型，由支付宝权益结算平台定义，BENEFIT_TEMPLATE表示权益模板
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 权益产品码，不同场景下会有不同的产品码，由支付宝权益结算平台指定，GAODE_GENERAL_SHADOW表示高德权益结算场景下的产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 支付宝会员id，需要查询的权益模板所属商家的支付宝会员id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
