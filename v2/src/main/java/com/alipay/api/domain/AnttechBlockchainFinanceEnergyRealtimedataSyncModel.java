package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 能源系统实时数据同步接口
 *
 * @author auto create
 * @since 1.0, 2025-06-27 12:07:15
 */
public class AnttechBlockchainFinanceEnergyRealtimedataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3814552196833421457L;

	/**
	 * 设备上报信息字符串
	 */
	@ApiField("data_list")
	private String dataList;

	/**
	 * 数据类型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 数据生成时间，时标。 格式 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("real_time")
	private String realTime;

	/**
	 * 数据上报时间
	 */
	@ApiField("report_time")
	private Date reportTime;

	public String getDataList() {
		return this.dataList;
	}
	public void setDataList(String dataList) {
		this.dataList = dataList;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getRealTime() {
		return this.realTime;
	}
	public void setRealTime(String realTime) {
		this.realTime = realTime;
	}

	public Date getReportTime() {
		return this.reportTime;
	}
	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}

}
