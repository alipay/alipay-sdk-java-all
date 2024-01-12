package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.prodmode.instshortname.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 22:29:54
 */
public class AlipayEbppProdmodeInstshortnameQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4443286885356826625L;

	/** 
	 * 出账机构中文名称
	 */
	@ApiField("chargeinst_cn_name")
	private String chargeinstCnName;

	/** 
	 * 出账机构英文名称
	 */
	@ApiField("chargeinst_en_name")
	private String chargeinstEnName;

	public void setChargeinstCnName(String chargeinstCnName) {
		this.chargeinstCnName = chargeinstCnName;
	}
	public String getChargeinstCnName( ) {
		return this.chargeinstCnName;
	}

	public void setChargeinstEnName(String chargeinstEnName) {
		this.chargeinstEnName = chargeinstEnName;
	}
	public String getChargeinstEnName( ) {
		return this.chargeinstEnName;
	}

}
