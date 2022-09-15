package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 占比类接口返回的数据类型
 *
 * @author auto create
 * @since 1.0, 2019-09-06 20:54:35
 */
public class RatioDetail extends AlipayObject {

	private static final long serialVersionUID = 2725744151612827521L;

	/**
	 * 区域编码
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 区域名称
	 */
	@ApiField("area_name")
	private String areaName;

	/**
	 * 主键
	 */
	@ApiField("id")
	private String id;

	/**
	 * 年月
	 */
	@ApiField("period")
	private String period;

	/**
	 * 占比的标签名称
	 */
	@ApiField("ratio_label")
	private String ratioLabel;

	/**
	 * 占比数值，为百分比的小数数值
	 */
	@ApiField("ratio_val")
	private String ratioVal;

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaName() {
		return this.areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getRatioLabel() {
		return this.ratioLabel;
	}
	public void setRatioLabel(String ratioLabel) {
		this.ratioLabel = ratioLabel;
	}

	public String getRatioVal() {
		return this.ratioVal;
	}
	public void setRatioVal(String ratioVal) {
		this.ratioVal = ratioVal;
	}

}
