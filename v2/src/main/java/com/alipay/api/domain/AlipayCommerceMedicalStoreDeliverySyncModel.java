package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 同步门店配送范围
 *
 * @author auto create
 * @since 1.0, 2025-05-30 16:38:54
 */
public class AlipayCommerceMedicalStoreDeliverySyncModel extends AlipayObject {

	private static final long serialVersionUID = 8251957825747173259L;

	/**
	 * 配送范围集合，仅支持高德坐标系的经纬度集。坐标数上限：99；电子围栏首尾坐标需闭合。
	 */
	@ApiListField("delivery_area_list")
	@ApiField("delivery_point_d_t_o")
	private List<DeliveryPointDTO> deliveryAreaList;

	/**
	 * 门店编码
	 */
	@ApiField("store_code")
	private String storeCode;

	public List<DeliveryPointDTO> getDeliveryAreaList() {
		return this.deliveryAreaList;
	}
	public void setDeliveryAreaList(List<DeliveryPointDTO> deliveryAreaList) {
		this.deliveryAreaList = deliveryAreaList;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
