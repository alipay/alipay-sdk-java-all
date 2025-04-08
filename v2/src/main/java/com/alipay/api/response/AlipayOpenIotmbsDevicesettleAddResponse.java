package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeviceSettleApplicantResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.devicesettle.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-19 16:07:25
 */
public class AlipayOpenIotmbsDevicesettleAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 3484537619375374521L;

	/** 
	 * 获取签名后的业务数据
	 */
	@ApiField("orderStr")
	private String orderStr;

	/** 
	 * 设备进件的结果，会返回每个进件的设备的处理结果
	 */
	@ApiListField("settle_results")
	@ApiField("device_settle_applicant_result")
	private List<DeviceSettleApplicantResult> settleResults;

	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}
	public String getOrderStr( ) {
		return this.orderStr;
	}

	public void setSettleResults(List<DeviceSettleApplicantResult> settleResults) {
		this.settleResults = settleResults;
	}
	public List<DeviceSettleApplicantResult> getSettleResults( ) {
		return this.settleResults;
	}

}
