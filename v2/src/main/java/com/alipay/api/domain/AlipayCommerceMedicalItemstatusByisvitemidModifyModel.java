package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量修改疫苗商品状态
 *
 * @author auto create
 * @since 1.0, 2025-09-19 16:39:54
 */
public class AlipayCommerceMedicalItemstatusByisvitemidModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3146958346581731692L;

	/**
	 * OMS厂商门店编码, 厂商自行维护
	 */
	@ApiField("isv_store_code")
	private String isvStoreCode;

	/**
	 * 商品信息
	 */
	@ApiListField("item_status_list")
	@ApiField("item_status_update_by_isv_item_id_param")
	private List<ItemStatusUpdateByIsvItemIdParam> itemStatusList;

	public String getIsvStoreCode() {
		return this.isvStoreCode;
	}
	public void setIsvStoreCode(String isvStoreCode) {
		this.isvStoreCode = isvStoreCode;
	}

	public List<ItemStatusUpdateByIsvItemIdParam> getItemStatusList() {
		return this.itemStatusList;
	}
	public void setItemStatusList(List<ItemStatusUpdateByIsvItemIdParam> itemStatusList) {
		this.itemStatusList = itemStatusList;
	}

}
