package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 教育学校信息查询
 *
 * @author auto create
 * @since 1.0, 2022-05-27 11:27:15
 */
public class AlipayCommerceEducateCampusInstitutionsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6841367846854463799L;

	/**
	 * 城市编码，编码标准为中华人民共和国行政区划代码，参见 2020年12月中华人民共和国县以上行政区划代码。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 学校内标：支付宝内部学校唯一编号。使用内标查询时，默认使用内标进行精确匹配。
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 学校名称
	 */
	@ApiField("inst_name")
	private String instName;

	/**
	 * 学校外标：统一社会信用编码或教育部提供的学校标识码。使用学校外标查询时，默认使用外标进行精确匹配。
	 */
	@ApiField("inst_std_code")
	private String instStdCode;

	/**
	 * 是否使用学校名称模糊匹配进行查询，默认精确匹配。
枚举值如下：
1：精确匹配；
0：模糊匹配
	 */
	@ApiField("like_property")
	private String likeProperty;

	/**
	 * 省份编码，编码标准为中华人民共和国行政区划代码，参见 2020年12月中华人民共和国县以上行政区划代码。
	 */
	@ApiField("province_code")
	private String provinceCode;

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

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String getInstStdCode() {
		return this.instStdCode;
	}
	public void setInstStdCode(String instStdCode) {
		this.instStdCode = instStdCode;
	}

	public String getLikeProperty() {
		return this.likeProperty;
	}
	public void setLikeProperty(String likeProperty) {
		this.likeProperty = likeProperty;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}
