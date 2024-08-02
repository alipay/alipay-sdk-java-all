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
 * @since 1.0, 2024-07-19 17:26:19
 */
public class AnttechBlockchainFinanceEnergyDeviceSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2418181513382315318L;

	/**
	 * 交流充电桩实时数据数据列表
	 */
	@ApiListField("acc_pile_data_list")
	@ApiField("ac_charge_pile_run_time_data")
	private List<AcChargePileRunTimeData> accPileDataList;

	/**
	 * 充电设备类型
	 */
	@ApiField("charge_device_type")
	private String chargeDeviceType;

	/**
	 * 直流充电桩实时数据列表
	 */
	@ApiListField("dcc_pile_data_list")
	@ApiField("dc_charge_pile_run_time_data")
	private List<DcChargePileRunTimeData> dccPileDataList;

	/**
	 * 设备类型
	 */
	@ApiField("device_type")
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
