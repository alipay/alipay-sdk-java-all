package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商铺服务能力查询
 *
 * @author auto create
 * @since 1.0, 2025-05-19 19:32:33
 */
public class AlipayCommerceMedicalMiorinsuranceJumpurlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5443821796874351868L;

	/**
	 * 商品的医保编码
	 */
	@ApiField("insurance_code")
	private String insuranceCode;

	/**
	 * 医保国标编码
	 */
	@ApiField("mi_code")
	private String miCode;

	/**
	 * 渠道（区分渠道兼容后续多平台、对于这种模式默认要打公域标）
	 */
	@ApiField("source")
	private String source;

	public String getInsuranceCode() {
		return this.insuranceCode;
	}
	public void setInsuranceCode(String insuranceCode) {
		this.insuranceCode = insuranceCode;
	}

	public String getMiCode() {
		return this.miCode;
	}
	public void setMiCode(String miCode) {
		this.miCode = miCode;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
