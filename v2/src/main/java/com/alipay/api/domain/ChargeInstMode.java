package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出账机构接口输出参数列表 ChargeInstResult{ List<ChargeInstMode>}对象
 *
 * @author auto create
 * @since 1.0, 2022-11-09 17:57:45
 */
public class ChargeInstMode extends AlipayObject {

	private static final long serialVersionUID = 4219183695894431989L;

	/**
	 * 机构简称(英文名称)
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 机构中文名称
	 */
	@ApiField("charge_inst_name")
	private String chargeInstName;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	public String getChargeInst() {
		return this.chargeInst;
	}
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	public String getChargeInstName() {
		return this.chargeInstName;
	}
	public void setChargeInstName(String chargeInstName) {
		this.chargeInstName = chargeInstName;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

}
