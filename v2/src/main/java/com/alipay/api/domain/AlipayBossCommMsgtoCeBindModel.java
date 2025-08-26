package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 文档回归测试勿动msgto不带openid不含中文参数
 *
 * @author auto create
 * @since 1.0, 2023-08-25 16:46:34
 */
public class AlipayBossCommMsgtoCeBindModel extends AlipayObject {

	private static final long serialVersionUID = 5616522729419847694L;

	/**
	 * 特殊可选，Date类型
	 */
	@ApiField("business_scope")
	private Date businessScope;

	/**
	 * ,必选，复杂类型
	 */
	@ApiField("cert_no")
	private ActivityGoods certNo;

	/**
	 * ,boolean，可选 示例值false
	 */
	@ApiField("hascode")
	private Boolean hascode;

	/**
	 * number类型，必选
	 */
	@ApiField("mobile")
	private Long mobile;

	/**
	 * 省份,必选，具体类型string，安全等级R0，
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 特殊可选，price类型
	 */
	@ApiListField("user_name")
	@ApiField("price")
	private List<String> userName;

	public Date getBusinessScope() {
		return this.businessScope;
	}
	public void setBusinessScope(Date businessScope) {
		this.businessScope = businessScope;
	}

	public ActivityGoods getCertNo() {
		return this.certNo;
	}
	public void setCertNo(ActivityGoods certNo) {
		this.certNo = certNo;
	}

	public Boolean getHascode() {
		return this.hascode;
	}
	public void setHascode(Boolean hascode) {
		this.hascode = hascode;
	}

	public Long getMobile() {
		return this.mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public List<String> getUserName() {
		return this.userName;
	}
	public void setUserName(List<String> userName) {
		this.userName = userName;
	}

}
