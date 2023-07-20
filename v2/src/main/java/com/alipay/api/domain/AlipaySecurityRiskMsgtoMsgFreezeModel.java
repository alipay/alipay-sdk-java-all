package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 文档回归测试勿动msgto带openid含中文参数
 *
 * @author auto create
 * @since 1.0, 2022-11-20 16:01:53
 */
public class AlipaySecurityRiskMsgtoMsgFreezeModel extends AlipayObject {

	private static final long serialVersionUID = 1293829831923216138L;

	/**
	 * 基础类型，string类型，必选，有枚举值json格式：[{"value": "枚举值1","name": "枚举名1"},{"value": "枚举值2","name": "枚举名2"}]
	 */
	@ApiField("c_ka")
	private String cKa;

	/**
	 * 证件号,可选，有映射值,示例值[true,false,true]
	 */
	@ApiListField("cert_no")
	@ApiField("boolean")
	private List<Boolean> certNo;

	/**
	 * 市，可选，复杂类型
	 */
	@ApiField("city_code")
	private JinyouTestFour cityCode;

	/**
	 * 营业执照有效期，特殊可选，具体类型boolean
	 */
	@ApiField("license_expiry_date")
	private Boolean licenseExpiryDate;

	/**
	 * 基础类型，必选，有映射
	 */
	@ApiField("x_dd")
	private String xDd;

	/**
	 * 基础类型，必选，x_dd的映射
	 */
	@ApiField("x_open_id")
	private String xOpenId;

	public String getcKa() {
		return this.cKa;
	}
	public void setcKa(String cKa) {
		this.cKa = cKa;
	}

	public List<Boolean> getCertNo() {
		return this.certNo;
	}
	public void setCertNo(List<Boolean> certNo) {
		this.certNo = certNo;
	}

	public JinyouTestFour getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(JinyouTestFour cityCode) {
		this.cityCode = cityCode;
	}

	public Boolean getLicenseExpiryDate() {
		return this.licenseExpiryDate;
	}
	public void setLicenseExpiryDate(Boolean licenseExpiryDate) {
		this.licenseExpiryDate = licenseExpiryDate;
	}

	public String getxDd() {
		return this.xDd;
	}
	public void setxDd(String xDd) {
		this.xDd = xDd;
	}

	public String getxOpenId() {
		return this.xOpenId;
	}
	public void setxOpenId(String xOpenId) {
		this.xOpenId = xOpenId;
	}

}
