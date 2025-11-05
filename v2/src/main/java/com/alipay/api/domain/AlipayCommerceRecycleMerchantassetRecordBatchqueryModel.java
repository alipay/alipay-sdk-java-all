package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询商户资产的流水
 *
 * @author auto create
 * @since 1.0, 2025-07-02 14:24:50
 */
public class AlipayCommerceRecycleMerchantassetRecordBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7797543675139646729L;

	/**
	 * 资产类型
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 页数
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
