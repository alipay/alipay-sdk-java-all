package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务商学校入驻信息查询
 *
 * @author auto create
 * @since 1.0, 2021-10-08 11:02:50
 */
public class AlipayCommerceEducateCampusSchoolQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6346535971349467551L;

	/**
	 * 市
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 内标列表
	 */
	@ApiListField("inst_id_list")
	@ApiField("string")
	private List<String> instIdList;

	/**
	 * 机构名称
	 */
	@ApiField("inst_name")
	private String instName;

	/**
	 * 名称模糊匹配
	 */
	@ApiField("inst_name_like")
	private String instNameLike;

	/**
	 * 外标
	 */
	@ApiField("inst_std_code")
	private String instStdCode;

	/**
	 * 外标列表
	 */
	@ApiListField("inst_std_code_list")
	@ApiField("string")
	private List<String> instStdCodeList;

	/**
	 * 省份
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 学校性质
	 */
	@ApiField("school_property")
	private String schoolProperty;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public List<String> getInstIdList() {
		return this.instIdList;
	}
	public void setInstIdList(List<String> instIdList) {
		this.instIdList = instIdList;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String getInstNameLike() {
		return this.instNameLike;
	}
	public void setInstNameLike(String instNameLike) {
		this.instNameLike = instNameLike;
	}

	public String getInstStdCode() {
		return this.instStdCode;
	}
	public void setInstStdCode(String instStdCode) {
		this.instStdCode = instStdCode;
	}

	public List<String> getInstStdCodeList() {
		return this.instStdCodeList;
	}
	public void setInstStdCodeList(List<String> instStdCodeList) {
		this.instStdCodeList = instStdCodeList;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getSchoolProperty() {
		return this.schoolProperty;
	}
	public void setSchoolProperty(String schoolProperty) {
		this.schoolProperty = schoolProperty;
	}

}
