package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预下单的码信息
格式为json
 *
 * @author auto create
 * @since 1.0, 2019-07-23 11:48:15
 */
public class TradePrecreateConfirmPrecreateCodeInfo extends AlipayObject {

	private static final long serialVersionUID = 2319882757154445799L;

	/**
	 * 预下单阶段产生的码串，对应预下单订单。
	 */
	@ApiField("precreate_code")
	private String precreateCode;

	/**
	 * 码创建时间
	 */
	@ApiField("precreate_code_create_time")
	private Date precreateCodeCreateTime;

	/**
	 * 预下单阶段的码串类型 
订单二维码，取值：qr_code
	 */
	@ApiField("precreate_code_type")
	private String precreateCodeType;

	public String getPrecreateCode() {
		return this.precreateCode;
	}
	public void setPrecreateCode(String precreateCode) {
		this.precreateCode = precreateCode;
	}

	public Date getPrecreateCodeCreateTime() {
		return this.precreateCodeCreateTime;
	}
	public void setPrecreateCodeCreateTime(Date precreateCodeCreateTime) {
		this.precreateCodeCreateTime = precreateCodeCreateTime;
	}

	public String getPrecreateCodeType() {
		return this.precreateCodeType;
	}
	public void setPrecreateCodeType(String precreateCodeType) {
		this.precreateCodeType = precreateCodeType;
	}

}
