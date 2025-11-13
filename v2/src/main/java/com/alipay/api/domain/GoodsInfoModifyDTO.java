package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品修改信息
 *
 * @author auto create
 * @since 1.0, 2025-08-07 19:10:39
 */
public class GoodsInfoModifyDTO extends AlipayObject {

	private static final long serialVersionUID = 1249796693998195897L;

	/**
	 * 商品属性信息
	 */
	@ApiListField("attr_ext_info_list")
	@ApiField("attr_ext_info_d_t_o")
	private List<AttrExtInfoDTO> attrExtInfoList;

	/**
	 * 质检金额，单位为元
	 */
	@ApiField("inspect_price")
	private String inspectPrice;

	/**
	 * 提报商品库的商品
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 提报商品库的商品
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 商品回收状态
	 */
	@ApiField("recycle_status")
	private String recycleStatus;

	/**
	 * 商品租赁信息
	 */
	@ApiField("rent_info")
	private RentInfoDTO rentInfo;

	public List<AttrExtInfoDTO> getAttrExtInfoList() {
		return this.attrExtInfoList;
	}
	public void setAttrExtInfoList(List<AttrExtInfoDTO> attrExtInfoList) {
		this.attrExtInfoList = attrExtInfoList;
	}

	public String getInspectPrice() {
		return this.inspectPrice;
	}
	public void setInspectPrice(String inspectPrice) {
		this.inspectPrice = inspectPrice;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getRecycleStatus() {
		return this.recycleStatus;
	}
	public void setRecycleStatus(String recycleStatus) {
		this.recycleStatus = recycleStatus;
	}

	public RentInfoDTO getRentInfo() {
		return this.rentInfo;
	}
	public void setRentInfo(RentInfoDTO rentInfo) {
		this.rentInfo = rentInfo;
	}

}
