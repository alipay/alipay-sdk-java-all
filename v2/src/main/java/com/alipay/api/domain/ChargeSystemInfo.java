package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 充电系统信息
 *
 * @author auto create
 * @since 1.0, 2024-07-19 15:27:47
 */
public class ChargeSystemInfo extends AlipayObject {

	private static final long serialVersionUID = 5467546666641349947L;

	/**
	 * 交流充电桩数量
	 */
	@ApiField("ac_pile_num")
	private Long acPileNum;

	/**
	 * 直流充电桩数量
	 */
	@ApiField("dc_pile_num")
	private Long dcPileNum;

	/**
	 * 电表列表
	 */
	@ApiListField("electric_meter_no")
	@ApiField("string")
	private List<String> electricMeterNo;

	/**
	 * 是否有序充电
	 */
	@ApiField("orderable")
	private Boolean orderable;

	/**
	 * 车位数量，默认0
	 */
	@ApiField("park_num")
	private Long parkNum;

	/**
	 * 充电系统种类
	 */
	@ApiField("system_category")
	private String systemCategory;

	/**
	 * 总额定功率, 单位kw
	 */
	@ApiField("total_rated_power")
	private String totalRatedPower;

	/**
	 * 充电用途分类
	 */
	@ApiField("use_type")
	private String useType;

	/**
	 * 电压等级
	 */
	@ApiField("voltag_level")
	private String voltagLevel;

	public Long getAcPileNum() {
		return this.acPileNum;
	}
	public void setAcPileNum(Long acPileNum) {
		this.acPileNum = acPileNum;
	}

	public Long getDcPileNum() {
		return this.dcPileNum;
	}
	public void setDcPileNum(Long dcPileNum) {
		this.dcPileNum = dcPileNum;
	}

	public List<String> getElectricMeterNo() {
		return this.electricMeterNo;
	}
	public void setElectricMeterNo(List<String> electricMeterNo) {
		this.electricMeterNo = electricMeterNo;
	}

	public Boolean getOrderable() {
		return this.orderable;
	}
	public void setOrderable(Boolean orderable) {
		this.orderable = orderable;
	}

	public Long getParkNum() {
		return this.parkNum;
	}
	public void setParkNum(Long parkNum) {
		this.parkNum = parkNum;
	}

	public String getSystemCategory() {
		return this.systemCategory;
	}
	public void setSystemCategory(String systemCategory) {
		this.systemCategory = systemCategory;
	}

	public String getTotalRatedPower() {
		return this.totalRatedPower;
	}
	public void setTotalRatedPower(String totalRatedPower) {
		this.totalRatedPower = totalRatedPower;
	}

	public String getUseType() {
		return this.useType;
	}
	public void setUseType(String useType) {
		this.useType = useType;
	}

	public String getVoltagLevel() {
		return this.voltagLevel;
	}
	public void setVoltagLevel(String voltagLevel) {
		this.voltagLevel = voltagLevel;
	}

}
