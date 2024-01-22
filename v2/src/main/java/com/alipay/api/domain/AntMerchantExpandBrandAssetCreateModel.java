package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 添加品牌资产
 *
 * @author auto create
 * @since 1.0, 2023-06-01 11:41:10
 */
public class AntMerchantExpandBrandAssetCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6143769164444745984L;

	/**
	 * 资产ID，资产类型为账号时传入pid/smid，为门店时传入shopId，为小程序生活号时传入appid
	 */
	@ApiListField("asset_ids")
	@ApiField("string")
	private List<String> assetIds;

	/**
	 * 资产类型
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 品牌ID
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 品牌运营主体的pid
	 */
	@ApiField("carrier_id")
	private String carrierId;

	public List<String> getAssetIds() {
		return this.assetIds;
	}
	public void setAssetIds(List<String> assetIds) {
		this.assetIds = assetIds;
	}

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getCarrierId() {
		return this.carrierId;
	}
	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}

}
