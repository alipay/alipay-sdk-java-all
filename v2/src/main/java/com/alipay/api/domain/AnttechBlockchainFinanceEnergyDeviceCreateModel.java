package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 能源设备创建
 *
 * @author auto create
 * @since 1.0, 2024-09-02 21:57:15
 */
public class AnttechBlockchainFinanceEnergyDeviceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4224547992653247157L;

	/**
	 * 地址，当设备为空调、热水器、地暖时必选；
	 */
	@ApiField("address")
	private EntityAddress address;

	/**
	 * 是否可调节
	 */
	@ApiField("adjustable")
	private Boolean adjustable;

	/**
	 * 通信模组
	 */
	@ApiField("comm_module_no")
	private String commModuleNo;

	/**
	 * 是否仅为控制器

当设备为空调、热水器、地暖时必选；
	 */
	@ApiField("controller_only")
	private Boolean controllerOnly;

	/**
	 * 设备编号
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备专有信息。
	 */
	@ApiField("device_info")
	private String deviceInfo;

	/**
	 * 设备名称
	 */
	@ApiField("device_name")
	private String deviceName;

	/**
	 * 系统类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 设备生产商
	 */
	@ApiField("manufacturer")
	private EntityEnterpriseInfo manufacturer;

	/**
	 * 是否可计量，插座设备必选
	 */
	@ApiField("measurable")
	private Boolean measurable;

	/**
	 * 投入运营时间
	 */
	@ApiField("operate_date")
	private Date operateDate;

	/**
	 * 归属主体
	 */
	@ApiField("owner_entity")
	private TrustEntityInfo ownerEntity;

	/**
	 * 产品合约码
	 */
	@ApiField("product_agreement_code")
	private String productAgreementCode;

	/**
	 * 设备生产型号
	 */
	@ApiField("production_model")
	private String productionModel;

	/**
	 * 额定功率	，单位 KW

当设备为空调、热水器、地暖时必选；
	 */
	@ApiField("rated_power")
	private String ratedPower;

	/**
	 * 额定电压，单位 V

当设备为空调、热水器、地暖时必选；
	 */
	@ApiField("rated_voltage")
	private String ratedVoltage;

	/**
	 * 响应级别
	 */
	@ApiField("response_level")
	private String responseLevel;

	/**
	 * 系统编号
	 */
	@ApiField("system_id")
	private String systemId;

	/**
	 * 是否可定时
	 */
	@ApiField("timeable")
	private Boolean timeable;

	public EntityAddress getAddress() {
		return this.address;
	}
	public void setAddress(EntityAddress address) {
		this.address = address;
	}

	public Boolean getAdjustable() {
		return this.adjustable;
	}
	public void setAdjustable(Boolean adjustable) {
		this.adjustable = adjustable;
	}

	public String getCommModuleNo() {
		return this.commModuleNo;
	}
	public void setCommModuleNo(String commModuleNo) {
		this.commModuleNo = commModuleNo;
	}

	public Boolean getControllerOnly() {
		return this.controllerOnly;
	}
	public void setControllerOnly(Boolean controllerOnly) {
		this.controllerOnly = controllerOnly;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceInfo() {
		return this.deviceInfo;
	}
	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getDeviceName() {
		return this.deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public EntityEnterpriseInfo getManufacturer() {
		return this.manufacturer;
	}
	public void setManufacturer(EntityEnterpriseInfo manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Boolean getMeasurable() {
		return this.measurable;
	}
	public void setMeasurable(Boolean measurable) {
		this.measurable = measurable;
	}

	public Date getOperateDate() {
		return this.operateDate;
	}
	public void setOperateDate(Date operateDate) {
		this.operateDate = operateDate;
	}

	public TrustEntityInfo getOwnerEntity() {
		return this.ownerEntity;
	}
	public void setOwnerEntity(TrustEntityInfo ownerEntity) {
		this.ownerEntity = ownerEntity;
	}

	public String getProductAgreementCode() {
		return this.productAgreementCode;
	}
	public void setProductAgreementCode(String productAgreementCode) {
		this.productAgreementCode = productAgreementCode;
	}

	public String getProductionModel() {
		return this.productionModel;
	}
	public void setProductionModel(String productionModel) {
		this.productionModel = productionModel;
	}

	public String getRatedPower() {
		return this.ratedPower;
	}
	public void setRatedPower(String ratedPower) {
		this.ratedPower = ratedPower;
	}

	public String getRatedVoltage() {
		return this.ratedVoltage;
	}
	public void setRatedVoltage(String ratedVoltage) {
		this.ratedVoltage = ratedVoltage;
	}

	public String getResponseLevel() {
		return this.responseLevel;
	}
	public void setResponseLevel(String responseLevel) {
		this.responseLevel = responseLevel;
	}

	public String getSystemId() {
		return this.systemId;
	}
	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}

	public Boolean getTimeable() {
		return this.timeable;
	}
	public void setTimeable(Boolean timeable) {
		this.timeable = timeable;
	}

}
