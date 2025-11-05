package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品（学校）模型-输出参数
 *
 * @author auto create
 * @since 1.0, 2022-11-09 17:57:45
 */
public class ExproductconfResponse extends AlipayObject {

	private static final long serialVersionUID = 3269833691688814443L;

	/**
	 * 出账机构
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 出账机构中文名称
	 */
	@ApiField("chargeinst_name")
	private String chargeinstName;

	/**
	 * 销账机构
	 */
	@ApiField("chargeoff_inst")
	private String chargeoffInst;

	/**
	 * 销账机构中文名称
	 */
	@ApiField("chargeoffinst_name")
	private String chargeoffinstName;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 扩展字段
	 */
	@ApiField("extend")
	private String extend;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 产品状态
	 */
	@ApiField("status")
	private String status;

	public String getChargeInst() {
		return this.chargeInst;
	}
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	public String getChargeinstName() {
		return this.chargeinstName;
	}
	public void setChargeinstName(String chargeinstName) {
		this.chargeinstName = chargeinstName;
	}

	public String getChargeoffInst() {
		return this.chargeoffInst;
	}
	public void setChargeoffInst(String chargeoffInst) {
		this.chargeoffInst = chargeoffInst;
	}

	public String getChargeoffinstName() {
		return this.chargeoffinstName;
	}
	public void setChargeoffinstName(String chargeoffinstName) {
		this.chargeoffinstName = chargeoffinstName;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getExtend() {
		return this.extend;
	}
	public void setExtend(String extend) {
		this.extend = extend;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
