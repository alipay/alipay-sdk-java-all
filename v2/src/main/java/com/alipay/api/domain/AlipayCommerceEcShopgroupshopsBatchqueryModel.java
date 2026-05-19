package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询企业码门店组门店详情
 *
 * @author auto create
 * @since 1.0, 2026-05-18 15:47:48
 */
public class AlipayCommerceEcShopgroupshopsBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4825746542553275576L;

	/**
	 * 企业码企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 是否返回指定的行业数据详情
	 */
	@ApiField("industry_query_option")
	private IndustryQueryOption industryQueryOption;

	/**
	 * 页码，最小1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 页大小，最大100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 门店组id
	 */
	@ApiField("shop_group_id")
	private String shopGroupId;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public IndustryQueryOption getIndustryQueryOption() {
		return this.industryQueryOption;
	}
	public void setIndustryQueryOption(IndustryQueryOption industryQueryOption) {
		this.industryQueryOption = industryQueryOption;
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

	public String getShopGroupId() {
		return this.shopGroupId;
	}
	public void setShopGroupId(String shopGroupId) {
		this.shopGroupId = shopGroupId;
	}

}
