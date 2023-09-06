package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌资产查询
 *
 * @author auto create
 * @since 1.0, 2023-06-01 11:41:21
 */
public class AntMerchantExpandBrandAssetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4558829727863611845L;

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

	/**
	 * 资产是否已确认
true=仅确认资产，false=仅未确认资产，null=所有资产
	 */
	@ApiField("confirm")
	private Boolean confirm;

	/**
	 * 页码，默认为1
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 单页行数，默认为10，最大不能超过100行
	 */
	@ApiField("page_size")
	private Long pageSize;

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

	public Boolean getConfirm() {
		return this.confirm;
	}
	public void setConfirm(Boolean confirm) {
		this.confirm = confirm;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
