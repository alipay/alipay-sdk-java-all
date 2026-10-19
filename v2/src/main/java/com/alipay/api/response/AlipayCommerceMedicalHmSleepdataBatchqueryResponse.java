package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MedicalHmDailySleepRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hm.sleepdata.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-29 17:52:53
 */
public class AlipayCommerceMedicalHmSleepdataBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4578577849728273785L;

	/** 
	 * 是否已经绑定硬件设备 Y/N
	 */
	@ApiField("is_hardware_device_bound")
	private String isHardwareDeviceBound;

	/** 
	 * null
	 */
	@ApiListField("sleepdata_list")
	@ApiField("medical_hm_daily_sleep_record")
	private List<MedicalHmDailySleepRecord> sleepdataList;

	public void setIsHardwareDeviceBound(String isHardwareDeviceBound) {
		this.isHardwareDeviceBound = isHardwareDeviceBound;
	}
	public String getIsHardwareDeviceBound( ) {
		return this.isHardwareDeviceBound;
	}

	public void setSleepdataList(List<MedicalHmDailySleepRecord> sleepdataList) {
		this.sleepdataList = sleepdataList;
	}
	public List<MedicalHmDailySleepRecord> getSleepdataList( ) {
		return this.sleepdataList;
	}

}
