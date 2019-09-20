package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询机构英文名称
 *
 * @author auto create
 * @since 1.0, 2018-04-26 13:56:59
 */
public class AlipayEbppProdmodeInstshortnameQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5758129292876311623L;

	/**
	 * 出账机构中文名称
	 */
	@ApiField("chargeinst_cn_name")
	private String chargeinstCnName;

	public String getChargeinstCnName() {
		return this.chargeinstCnName;
	}
	public void setChargeinstCnName(String chargeinstCnName) {
		this.chargeinstCnName = chargeinstCnName;
	}

}
