package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对账配置查询接口
 *
 * @author auto create
 * @since 1.0, 2020-06-15 10:00:15
 */
public class AlipayEbppProdmodeReconconfQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4827915428878498494L;

	/**
	 * 缴费业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 销账机构编码
	 */
	@ApiField("chargeoff_code")
	private String chargeoffCode;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getChargeoffCode() {
		return this.chargeoffCode;
	}
	public void setChargeoffCode(String chargeoffCode) {
		this.chargeoffCode = chargeoffCode;
	}

}
