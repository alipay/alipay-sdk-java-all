package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VehicleMsgSendResultEntity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehicleowner.message.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:56:36
 */
public class AlipayCommerceTransportVehicleownerMessageSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2535597235367556283L;

	/** 
	 * 批量发送结果
	 */
	@ApiListField("send_result_list")
	@ApiField("vehicle_msg_send_result_entity")
	private List<VehicleMsgSendResultEntity> sendResultList;

	public void setSendResultList(List<VehicleMsgSendResultEntity> sendResultList) {
		this.sendResultList = sendResultList;
	}
	public List<VehicleMsgSendResultEntity> getSendResultList( ) {
		return this.sendResultList;
	}

}
