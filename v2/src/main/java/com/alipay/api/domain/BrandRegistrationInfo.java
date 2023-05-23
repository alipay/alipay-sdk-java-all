package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 品牌注册信息
 *
 * @author auto create
 * @since 1.0, 2020-10-21 11:44:15
 */
public class BrandRegistrationInfo extends AlipayObject {

	private static final long serialVersionUID = 2359379411132387583L;

	/**
	 * 商标有效期(结束日期)
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 商标注册证书信息(当前只支持图片类型，请调用alipay.open.mini.miniapp.brand.upload接口上传图片,可以上传多个商标注册证书信息)
	 */
	@ApiListField("reg_materials")
	@ApiField("string")
	private List<String> regMaterials;

	/**
	 * 商标注册号
	 */
	@ApiField("reg_number")
	private String regNumber;

	/**
	 * 商标注册人
	 */
	@ApiField("registrant")
	private String registrant;

	/**
	 * 商标有效期(开始日期)
	 */
	@ApiField("start_date")
	private String startDate;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public List<String> getRegMaterials() {
		return this.regMaterials;
	}
	public void setRegMaterials(List<String> regMaterials) {
		this.regMaterials = regMaterials;
	}

	public String getRegNumber() {
		return this.regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public String getRegistrant() {
		return this.registrant;
	}
	public void setRegistrant(String registrant) {
		this.registrant = registrant;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
