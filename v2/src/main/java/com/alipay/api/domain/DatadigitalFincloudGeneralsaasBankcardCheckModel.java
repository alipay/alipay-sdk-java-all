package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行卡核验
 *
 * @author auto create
 * @since 1.0, 2024-09-20 10:09:43
 */
public class DatadigitalFincloudGeneralsaasBankcardCheckModel extends AlipayObject {

	private static final long serialVersionUID = 7534426628541655874L;

	/**
	 * 需核验的银行卡号
	 */
	@ApiField("bankcard_no")
	private String bankcardNo;

	/**
	 * 银行卡核验具体类型
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 用户姓名，与身份证上的姓名相匹配
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 大陆身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 客户业务单据号
	 */
	@ApiField("outer_biz_no")
	private String outerBizNo;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 产品类型
	 */
	@ApiField("product_type")
	private String productType;

	public String getBankcardNo() {
		return this.bankcardNo;
	}
	public void setBankcardNo(String bankcardNo) {
		this.bankcardNo = bankcardNo;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getOuterBizNo() {
		return this.outerBizNo;
	}
	public void setOuterBizNo(String outerBizNo) {
		this.outerBizNo = outerBizNo;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

}
