package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 通过itemId批量上下架商品
 *
 * @author auto create
 * @since 1.0, 2025-01-14 14:27:46
 */
public class AlipayCommerceMedicalItemstatusByidModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7895622366155497718L;

	/**
	 * 要操作的上下架商品列表, 元素包含商品平台id和上下架状态
	 */
	@ApiListField("item_info_list")
	@ApiField("item_id_status_info")
	private List<ItemIdStatusInfo> itemInfoList;

	/**
	 * app方门店编码, 用于标识定位要操作商品的指定门店, 创建门店时设置的值
	 */
	@ApiField("store_code")
	private String storeCode;

	public List<ItemIdStatusInfo> getItemInfoList() {
		return this.itemInfoList;
	}
	public void setItemInfoList(List<ItemIdStatusInfo> itemInfoList) {
		this.itemInfoList = itemInfoList;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
