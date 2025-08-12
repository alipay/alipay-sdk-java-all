package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 加入购物车
 *
 * @author auto create
 * @since 1.0, 2025-06-27 14:17:29
 */
public class AlipayOfflineSmddCustomerCartModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2371387291272125339L;

	/**
	 * 买家唯一标识
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 桌码拓展对象
	 */
	@ApiField("code_ext")
	private CodeExtBean codeExt;

	/**
	 * 购物车操作类型
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * sku列表
	 */
	@ApiListField("sku_list")
	@ApiField("sku_bean")
	private List<SkuBean> skuList;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public CodeExtBean getCodeExt() {
		return this.codeExt;
	}
	public void setCodeExt(CodeExtBean codeExt) {
		this.codeExt = codeExt;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public List<SkuBean> getSkuList() {
		return this.skuList;
	}
	public void setSkuList(List<SkuBean> skuList) {
		this.skuList = skuList;
	}

}
