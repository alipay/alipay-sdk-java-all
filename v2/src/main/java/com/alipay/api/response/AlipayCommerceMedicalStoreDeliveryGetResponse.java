package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeliveryVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.store.delivery.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-20 15:32:28
 */
public class AlipayCommerceMedicalStoreDeliveryGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6733255368569529942L;

	/** 
	 * 配送范围列表
	 */
	@ApiListField("delivery_list")
	@ApiField("delivery_v_o")
	private List<DeliveryVO> deliveryList;

	/** 
	 * 查询门店的门店编码
	 */
	@ApiField("store_code")
	private String storeCode;

	public void setDeliveryList(List<DeliveryVO> deliveryList) {
		this.deliveryList = deliveryList;
	}
	public List<DeliveryVO> getDeliveryList( ) {
		return this.deliveryList;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}
	public String getStoreCode( ) {
		return this.storeCode;
	}

}
