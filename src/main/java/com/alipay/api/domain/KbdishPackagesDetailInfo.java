package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品套餐组明细
 *
 * @author auto create
 * @since 1.0, 2018-12-27 14:36:27
 */
public class KbdishPackagesDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 1727442674688418888L;

	/**
	 * 明细菜品在套餐里的个数, 不填默认为1
	 */
	@ApiField("detail_count")
	private String detailCount;

	/**
	 * 是否追加可选 Y .N  明细是否追加可选
	 */
	@ApiField("detail_is_select")
	private String detailIsSelect;

	/**
	 * 明细菜品的会员价格单价
	 */
	@ApiField("detail_member_price")
	private String detailMemberPrice;

	/**
	 * 明细菜品在套餐里的售卖单价
	 */
	@ApiField("detail_sell_price")
	private String detailSellPrice;

	/**
	 * 套餐明细的skuId
	 */
	@ApiField("detail_sku_id")
	private String detailSkuId;

	/**
	 * 排序字段 必输 仅为数字 越小排在前面
	 */
	@ApiField("detail_sort")
	private String detailSort;

	/**
	 * 明细的类型，dish:单品 还是 group:项目
	 */
	@ApiField("detail_type")
	private String detailType;

	/**
	 * 套餐组id,如果类型是group 必须要填groupId
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 套餐的sku_code
	 */
	@ApiField("packages_sku_id")
	private String packagesSkuId;

	public String getDetailCount() {
		return this.detailCount;
	}
	public void setDetailCount(String detailCount) {
		this.detailCount = detailCount;
	}

	public String getDetailIsSelect() {
		return this.detailIsSelect;
	}
	public void setDetailIsSelect(String detailIsSelect) {
		this.detailIsSelect = detailIsSelect;
	}

	public String getDetailMemberPrice() {
		return this.detailMemberPrice;
	}
	public void setDetailMemberPrice(String detailMemberPrice) {
		this.detailMemberPrice = detailMemberPrice;
	}

	public String getDetailSellPrice() {
		return this.detailSellPrice;
	}
	public void setDetailSellPrice(String detailSellPrice) {
		this.detailSellPrice = detailSellPrice;
	}

	public String getDetailSkuId() {
		return this.detailSkuId;
	}
	public void setDetailSkuId(String detailSkuId) {
		this.detailSkuId = detailSkuId;
	}

	public String getDetailSort() {
		return this.detailSort;
	}
	public void setDetailSort(String detailSort) {
		this.detailSort = detailSort;
	}

	public String getDetailType() {
		return this.detailType;
	}
	public void setDetailType(String detailType) {
		this.detailType = detailType;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getPackagesSkuId() {
		return this.packagesSkuId;
	}
	public void setPackagesSkuId(String packagesSkuId) {
		this.packagesSkuId = packagesSkuId;
	}

}
