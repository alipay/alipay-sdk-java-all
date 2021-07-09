package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeviceBehaviorLogResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.mdeviceprod.behaviorlog.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-21 19:52:03
 */
public class AlipayCommerceIotMdeviceprodBehaviorlogBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2127625857657512219L;

	/** 
	 * 日志关联的设备信息
	 */
	@ApiListField("result_list")
	@ApiField("device_behavior_log_response")
	private List<DeviceBehaviorLogResponse> resultList;

	public void setResultList(List<DeviceBehaviorLogResponse> resultList) {
		this.resultList = resultList;
	}
	public List<DeviceBehaviorLogResponse> getResultList( ) {
		return this.resultList;
	}

}
