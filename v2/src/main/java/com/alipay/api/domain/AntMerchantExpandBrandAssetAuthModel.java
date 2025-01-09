package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 品牌资产授权
 *
 * @author auto create
 * @since 1.0, 2023-06-01 11:41:41
 */
public class AntMerchantExpandBrandAssetAuthModel extends AlipayObject {

	private static final long serialVersionUID = 1327375128744331798L;

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
	 * 授权人的PID
	 */
	@ApiField("authorize_id")
	private String authorizeId;

	/**
	 * 授权类型
	 */
	@ApiField("authorize_type")
	private String authorizeType;

	/**
	 * 品牌ID
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 运营主体的pid
	 */
	@ApiField("carrier_id")
	private String carrierId;

	/**
	 * 授权状态
	 */
	@ApiField("status")
	private String status;

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

	public String getAuthorizeId() {
		return this.authorizeId;
	}
	public void setAuthorizeId(String authorizeId) {
		this.authorizeId = authorizeId;
	}

	public String getAuthorizeType() {
		return this.authorizeType;
	}
	public void setAuthorizeType(String authorizeType) {
		this.authorizeType = authorizeType;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
