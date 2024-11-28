package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医疗药品门店修改配送配置信息接口
 *
 * @author auto create
 * @since 1.0, 2024-06-12 16:00:06
 */
public class AlipayCommerceMedicalMedicineShopdeliveryModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1854253319776524953L;

	/**
	 * 门店配送配置信息
	 */
	@ApiListField("delivery_info")
	@ApiField("medical_shop_delivery_info")
	private List<MedicalShopDeliveryInfo> deliveryInfo;

	/**
	 * 外部门店Id
	 */
	@ApiField("out_store_id")
	private String outStoreId;

	/**
	 * 支付宝门店Id
	 */
	@ApiField("shop_id")
	private String shopId;

	public List<MedicalShopDeliveryInfo> getDeliveryInfo() {
		return this.deliveryInfo;
	}
	public void setDeliveryInfo(List<MedicalShopDeliveryInfo> deliveryInfo) {
		this.deliveryInfo = deliveryInfo;
	}

	public String getOutStoreId() {
		return this.outStoreId;
	}
	public void setOutStoreId(String outStoreId) {
		this.outStoreId = outStoreId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
