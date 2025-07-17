package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 不动产信息
 *
 * @author auto create
 * @since 1.0, 2025-06-12 22:56:35
 */
public class IndustryInvoiceRealPropertyBusiness extends AlipayObject {

	private static final long serialVersionUID = 7842199833443923434L;

	/**
	 * 跨地（市）标志
	 */
	@ApiField("cross_city_flag")
	private String crossCityFlag;

	/**
	 * 使用结束时间，yyyy-MM-dd HH:mm
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 车牌号，最多三个
	 */
	@ApiListField("plate_no_list")
	@ApiField("string")
	private List<String> plateNoList;

	/**
	 * 必须包含街、路、村、乡、镇、道、巷、号任意一个关键词
	 */
	@ApiField("real_property_address")
	private String realPropertyAddress;

	/**
	 * 不动产使用面积，整数最长七位，小数最长六位
	 */
	@ApiField("real_property_area")
	private String realPropertyArea;

	/**
	 * 不动产权证号，无值时传“无”
	 */
	@ApiField("real_property_cert_no")
	private String realPropertyCertNo;

	/**
	 * 不动产地址所属市级行政区，必须以市、盟、自治州、地区、区任意一个关键词结尾
	 */
	@ApiField("real_property_city")
	private String realPropertyCity;

	/**
	 * 不动产自定义编码，仅支持英文字母（大写和小写）、数字、短横线（-）和下划线（_）
	 */
	@ApiField("real_property_code")
	private String realPropertyCode;

	/**
	 * 不动产地址省级行政区，必须以省、自治区、特别行政区、北京市、天津市、上海市、重庆市任意一个关键词结尾
	 */
	@ApiField("real_property_province")
	private String realPropertyProvince;

	/**
	 * 明细行号，与商品明细行号对应
	 */
	@ApiField("serial_no")
	private Long serialNo;

	/**
	 * 使用开始时间，格式为yyyy-MM-dd HH:mm
	 */
	@ApiField("start_time")
	private String startTime;

	public String getCrossCityFlag() {
		return this.crossCityFlag;
	}
	public void setCrossCityFlag(String crossCityFlag) {
		this.crossCityFlag = crossCityFlag;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public List<String> getPlateNoList() {
		return this.plateNoList;
	}
	public void setPlateNoList(List<String> plateNoList) {
		this.plateNoList = plateNoList;
	}

	public String getRealPropertyAddress() {
		return this.realPropertyAddress;
	}
	public void setRealPropertyAddress(String realPropertyAddress) {
		this.realPropertyAddress = realPropertyAddress;
	}

	public String getRealPropertyArea() {
		return this.realPropertyArea;
	}
	public void setRealPropertyArea(String realPropertyArea) {
		this.realPropertyArea = realPropertyArea;
	}

	public String getRealPropertyCertNo() {
		return this.realPropertyCertNo;
	}
	public void setRealPropertyCertNo(String realPropertyCertNo) {
		this.realPropertyCertNo = realPropertyCertNo;
	}

	public String getRealPropertyCity() {
		return this.realPropertyCity;
	}
	public void setRealPropertyCity(String realPropertyCity) {
		this.realPropertyCity = realPropertyCity;
	}

	public String getRealPropertyCode() {
		return this.realPropertyCode;
	}
	public void setRealPropertyCode(String realPropertyCode) {
		this.realPropertyCode = realPropertyCode;
	}

	public String getRealPropertyProvince() {
		return this.realPropertyProvince;
	}
	public void setRealPropertyProvince(String realPropertyProvince) {
		this.realPropertyProvince = realPropertyProvince;
	}

	public Long getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(Long serialNo) {
		this.serialNo = serialNo;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
