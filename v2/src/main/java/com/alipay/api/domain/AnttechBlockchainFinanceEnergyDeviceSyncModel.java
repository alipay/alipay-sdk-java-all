package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 可信价值中心实体运行时数据
 *
 * @author auto create
 * @since 1.0, 2024-09-26 11:18:54
 */
public class AnttechBlockchainFinanceEnergyDeviceSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7369943548492552792L;

	/**
	 * 交流充电桩实时数据数据列表。
列表长度最大100 当前字段已废弃(目前无使用，直接删除)
	 */
	@ApiListField("acc_pile_data_list")
	@ApiField("ac_charge_pile_run_time_data")
	@Deprecated
	private List<AcChargePileRunTimeData> accPileDataList;

	/**
	 * 充电设备类型 当前字段已废弃(合并至 data_type)
	 */
	@ApiField("charge_device_type")
	@Deprecated
	private String chargeDeviceType;

	/**
	 * 上报设备信息字符串
	 */
	@ApiField("data_list")
	private String dataList;

	/**
	 * 数据类型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 直流充电桩实时数据列表。
列表长度最大100 当前字段已废弃(目前无使用，直接删除)
	 */
	@ApiListField("dcc_pile_data_list")
	@ApiField("dc_charge_pile_run_time_data")
	@Deprecated
	private List<DcChargePileRunTimeData> dccPileDataList;

	/**
	 * 设备类型 当前字段已废弃(合并至 data_type)
	 */
	@ApiField("device_type")
	@Deprecated
	private String deviceType;

	/**
	 * 产品合约码
	 */
	@ApiField("product_agreement_code")
	private String productAgreementCode;

	/**
	 * 数据生成时标
	 */
	@ApiField("real_time")
	private String realTime;

	/**
	 * 数据上报时间
	 */
	@ApiField("report_time")
	private Date reportTime;

	public List<AcChargePileRunTimeData> getAccPileDataList() {
		return this.accPileDataList;
	}
	public void setAccPileDataList(List<AcChargePileRunTimeData> accPileDataList) {
		this.accPileDataList = accPileDataList;
	}

	public String getChargeDeviceType() {
		return this.chargeDeviceType;
	}
	public void setChargeDeviceType(String chargeDeviceType) {
		this.chargeDeviceType = chargeDeviceType;
	}

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

	public List<DcChargePileRunTimeData> getDccPileDataList() {
		return this.dccPileDataList;
	}
	public void setDccPileDataList(List<DcChargePileRunTimeData> dccPileDataList) {
		this.dccPileDataList = dccPileDataList;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getProductAgreementCode() {
		return this.productAgreementCode;
	}
	public void setProductAgreementCode(String productAgreementCode) {
		this.productAgreementCode = productAgreementCode;
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
