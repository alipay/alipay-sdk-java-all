package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请开通教育行业服务
 *
 * @author auto create
 * @since 1.0, 2023-04-14 10:15:03
 */
public class AlipayCommerceEducateBusinessServiceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8688828144121439922L;

	/**
	 * 如果所在学校有多个校区，传入分校区名称
	 */
	@ApiField("campus_name")
	private String campusName;

	/**
	 * 城市国家编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 区县国家编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * ISV名称
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * ISV联系电话
	 */
	@ApiField("isv_telephone")
	private String isvTelephone;

	/**
	 * 省份国家编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	/**
	 * 学校企业支付宝账户。直连模式下必填。
	 */
	@ApiField("school_pid")
	private String schoolPid;

	/**
	 * 学校性质 枚举值如下：
1：公立
2：民办
	 */
	@ApiField("school_property")
	private String schoolProperty;

	/**
	 * 学校外标
	 */
	@ApiField("school_std_code")
	private String schoolStdCode;

	/**
	 * 学校类型。枚举值如下：0:幼儿园
1:小学
2:初中
3:高中
4:大学
5:中职中专
6:培训机构
7:高职高专
8:成人教育、函授等
10.政务机关
注意：如果学校兼有多种属性，可以连写用英文逗号拆分，比如：2,3：代表兼有初中部高中部；
	 */
	@ApiField("school_type")
	private String schoolType;

	/**
	 * 直付通二级服务商编号。直付通模式下必填
	 */
	@ApiField("smid")
	private String smid;

	public String getCampusName() {
		return this.campusName;
	}
	public void setCampusName(String campusName) {
		this.campusName = campusName;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getIsvTelephone() {
		return this.isvTelephone;
	}
	public void setIsvTelephone(String isvTelephone) {
		this.isvTelephone = isvTelephone;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getSchoolName() {
		return this.schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolPid() {
		return this.schoolPid;
	}
	public void setSchoolPid(String schoolPid) {
		this.schoolPid = schoolPid;
	}

	public String getSchoolProperty() {
		return this.schoolProperty;
	}
	public void setSchoolProperty(String schoolProperty) {
		this.schoolProperty = schoolProperty;
	}

	public String getSchoolStdCode() {
		return this.schoolStdCode;
	}
	public void setSchoolStdCode(String schoolStdCode) {
		this.schoolStdCode = schoolStdCode;
	}

	public String getSchoolType() {
		return this.schoolType;
	}
	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
