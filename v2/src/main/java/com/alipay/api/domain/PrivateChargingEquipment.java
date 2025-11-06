package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 私有四轮充电桩的基本信息
 *
 * @author auto create
 * @since 1.0, 2025-11-05 10:31:36
 */
public class PrivateChargingEquipment extends AlipayObject {

	private static final long serialVersionUID = 8372771478267532754L;

	/**
	 * 充电桩二维码值
	 */
	@ApiField("bind_qrcode")
	private String bindQrcode;

	/**
	 * 设备接口类型
	 */
	@ApiField("connector_type")
	private String connectorType;

	/**
	 * 设备输出接口类型
	 */
	@ApiField("current_output_type")
	private String currentOutputType;

	/**
	 * 设备编号
	 */
	@ApiField("equip_id")
	private String equipId;

	/**
	 * 设备IMEI号
	 */
	@ApiField("equip_imei_no")
	private String equipImeiNo;

	/**
	 * 充电桩名称
	 */
	@ApiField("equip_name")
	private String equipName;

	/**
	 * 设备sn号
	 */
	@ApiField("equip_sn")
	private String equipSn;

	/**
	 * 充电桩的设备类型。智能开关是指与无联网功能充电桩配套使用的可以联网控制充放电的开关
	 */
	@ApiField("equip_type")
	private String equipType;

	/**
	 * 设备型号编码
	 */
	@ApiField("equip_type_no")
	private String equipTypeNo;

	/**
	 * 启动模式
	 */
	@ApiListField("modes")
	@ApiField("string")
	private List<String> modes;

	/**
	 * 充电桩设备的联网流量生效时间，一般指4G流量卡或者物联网有效的起始时间
	 */
	@ApiField("network_data_begin_time")
	private Date networkDataBeginTime;

	/**
	 * 充电桩设备的联网流量失效时间，一般指4G流量卡或者物联网的失效时间
	 */
	@ApiField("network_data_end_time")
	private Date networkDataEndTime;

	/**
	 * 充电桩的额定电流，单位为安倍（A），请传入转换单位后的数值
	 */
	@ApiField("rated_current")
	private String ratedCurrent;

	/**
	 * 充电桩的额定功率，单位为千瓦（kW），请传入转换单位后的数值
	 */
	@ApiField("rated_power")
	private String ratedPower;

	/**
	 * 充电桩的额定电压，单位为伏特（V），请传入转换单位后的数值
	 */
	@ApiField("rated_voltage")
	private String ratedVoltage;

	/**
	 * 充电桩设备的关联二级品牌商编号，一般指生产商或制造商。若需要关联二级品牌商，则需要传入
	 */
	@ApiField("s_brand_code")
	private String sBrandCode;

	public String getBindQrcode() {
		return this.bindQrcode;
	}
	public void setBindQrcode(String bindQrcode) {
		this.bindQrcode = bindQrcode;
	}

	public String getConnectorType() {
		return this.connectorType;
	}
	public void setConnectorType(String connectorType) {
		this.connectorType = connectorType;
	}

	public String getCurrentOutputType() {
		return this.currentOutputType;
	}
	public void setCurrentOutputType(String currentOutputType) {
		this.currentOutputType = currentOutputType;
	}

	public String getEquipId() {
		return this.equipId;
	}
	public void setEquipId(String equipId) {
		this.equipId = equipId;
	}

	public String getEquipImeiNo() {
		return this.equipImeiNo;
	}
	public void setEquipImeiNo(String equipImeiNo) {
		this.equipImeiNo = equipImeiNo;
	}

	public String getEquipName() {
		return this.equipName;
	}
	public void setEquipName(String equipName) {
		this.equipName = equipName;
	}

	public String getEquipSn() {
		return this.equipSn;
	}
	public void setEquipSn(String equipSn) {
		this.equipSn = equipSn;
	}

	public String getEquipType() {
		return this.equipType;
	}
	public void setEquipType(String equipType) {
		this.equipType = equipType;
	}

	public String getEquipTypeNo() {
		return this.equipTypeNo;
	}
	public void setEquipTypeNo(String equipTypeNo) {
		this.equipTypeNo = equipTypeNo;
	}

	public List<String> getModes() {
		return this.modes;
	}
	public void setModes(List<String> modes) {
		this.modes = modes;
	}

	public Date getNetworkDataBeginTime() {
		return this.networkDataBeginTime;
	}
	public void setNetworkDataBeginTime(Date networkDataBeginTime) {
		this.networkDataBeginTime = networkDataBeginTime;
	}

	public Date getNetworkDataEndTime() {
		return this.networkDataEndTime;
	}
	public void setNetworkDataEndTime(Date networkDataEndTime) {
		this.networkDataEndTime = networkDataEndTime;
	}

	public String getRatedCurrent() {
		return this.ratedCurrent;
	}
	public void setRatedCurrent(String ratedCurrent) {
		this.ratedCurrent = ratedCurrent;
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

	public String getsBrandCode() {
		return this.sBrandCode;
	}
	public void setsBrandCode(String sBrandCode) {
		this.sBrandCode = sBrandCode;
	}

}
