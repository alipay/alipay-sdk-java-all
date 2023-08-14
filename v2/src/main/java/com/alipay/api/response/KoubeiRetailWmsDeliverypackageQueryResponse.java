package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeliveryPackageVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.deliverypackage.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:25:07
 */
public class KoubeiRetailWmsDeliverypackageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2584452888878235415L;

	/** 
	 * 包裹列表
	 */
	@ApiListField("delivery_package_vo_list")
	@ApiField("delivery_package_v_o")
	private List<DeliveryPackageVO> deliveryPackageVoList;

	public void setDeliveryPackageVoList(List<DeliveryPackageVO> deliveryPackageVoList) {
		this.deliveryPackageVoList = deliveryPackageVoList;
	}
	public List<DeliveryPackageVO> getDeliveryPackageVoList( ) {
		return this.deliveryPackageVoList;
	}

}
