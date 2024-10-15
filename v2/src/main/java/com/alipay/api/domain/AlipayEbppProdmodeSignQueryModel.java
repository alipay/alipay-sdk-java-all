package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询签约信息接口
 *
 * @author auto create
 * @since 1.0, 2020-06-15 10:02:13
 */
public class AlipayEbppProdmodeSignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8359756791858455217L;

	/**
	 * 出账/销账机构支付宝账号
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 产品编号
	 */
	@ApiField("prod_code")
	private String prodCode;

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

}
