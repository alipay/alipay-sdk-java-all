package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户口碑优惠资产查询接口
 *
 * @author auto create
 * @since 1.0, 2018-03-21 15:19:49
 */
public class KoubeiMarketingCampaignUserAssetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7686333257953782291L;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页显示数目(最大查询50)
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询范围:用户所有资产(USER_ALL_ASSET)，用户指定商户可用资产(USER_MERCHANT_ASSET),用户指定门店可用资产（USER_SHOP_ASSET）;指定USER_SHOP_ASSET必须传递shopid
	 */
	@ApiField("scope")
	private String scope;

	/**
	 * 门店id，如果查询范围是门店，门店id不能为空
	 */
	@ApiField("shop_id")
	private String shopId;

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getScope() {
		return this.scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
