package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 输出的出账机构模型
 *
 * @author auto create
 * @since 1.0, 2017-09-19 12:38:02
 */
public class JfExportChargeInstModel extends AlipayObject {

	private static final long serialVersionUID = 4624415776524833338L;

	/**
	 * 出账机构英文简称
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 出账机构中文名称
	 */
	@ApiField("charge_inst_name")
	private String chargeInstName;

	/**
	 * 出账机构所在城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 拓展字段
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 出账机构所在省份
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

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

}
