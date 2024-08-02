package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业联系方式查询服务
 *
 * @author auto create
 * @since 1.0, 2024-05-15 13:38:45
 */
public class ZhimaCreditEpContactinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2638118744171211663L;

	/**
	 * 企业名称
	 */
	@ApiField("ent_name")
	private String entName;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 企业注册号
	 */
	@ApiField("reg_no")
	private String regNo;

	/**
	 * 企业18位统一社会信用代码
	 */
	@ApiField("uscc")
	private String uscc;

	public String getEntName() {
		return this.entName;
	}
	public void setEntName(String entName) {
		this.entName = entName;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRegNo() {
		return this.regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getUscc() {
		return this.uscc;
	}
	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

}
