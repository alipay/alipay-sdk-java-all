package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 通过itemCode批量上下架商品
 *
 * @author auto create
 * @since 1.0, 2025-01-14 14:27:23
 */
public class AlipayCommerceMedicalItemstatusBycodeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1678395376551179864L;

	/**
	 * 要操作上下架的商品, itemCode和操作类型信息
	 */
	@ApiListField("item_info_list")
	@ApiField("item_code_status_info")
	private List<ItemCodeStatusInfo> itemInfoList;

	/**
	 * app方门店编码, 用于标识定位要操作商品的指定门店, 创建门店时设置的值
	 */
	@ApiField("store_code")
	private String storeCode;

	public List<ItemCodeStatusInfo> getItemInfoList() {
		return this.itemInfoList;
	}
	public void setItemInfoList(List<ItemCodeStatusInfo> itemInfoList) {
		this.itemInfoList = itemInfoList;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
