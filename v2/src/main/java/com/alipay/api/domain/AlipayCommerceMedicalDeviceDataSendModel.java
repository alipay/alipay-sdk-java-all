package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 设备厂商数据上报标准化接口
 *
 * @author auto create
 * @since 1.0, 2026-05-06 10:14:39
 */
public class AlipayCommerceMedicalDeviceDataSendModel extends AlipayObject {

	private static final long serialVersionUID = 7824361399174411724L;

	/**
	 * null
	 */
	@ApiListField("details")
	@ApiField("detail_v_o")
	private List<DetailVO> details;

	/**
	 * 设备唯一id
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 厂商名称
	 */
	@ApiField("device_vendor")
	private String deviceVendor;

	/**
	 * 厂商侧的用户id
	 */
	@ApiField("out_id")
	private String outId;

	/**
	 * null
	 */
	@ApiListField("statistics")
	@ApiField("statistic_v_o")
	private List<StatisticVO> statistics;

	public List<DetailVO> getDetails() {
		return this.details;
	}
	public void setDetails(List<DetailVO> details) {
		this.details = details;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceVendor() {
		return this.deviceVendor;
	}
	public void setDeviceVendor(String deviceVendor) {
		this.deviceVendor = deviceVendor;
	}

	public String getOutId() {
		return this.outId;
	}
	public void setOutId(String outId) {
		this.outId = outId;
	}

	public List<StatisticVO> getStatistics() {
		return this.statistics;
	}
	public void setStatistics(List<StatisticVO> statistics) {
		this.statistics = statistics;
	}

}
