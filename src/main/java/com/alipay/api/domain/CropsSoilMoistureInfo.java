package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作物土壤墒情信息
 *
 * @author auto create
 * @since 1.0, 2022-09-27 15:09:22
 */
public class CropsSoilMoistureInfo extends AlipayObject {

	private static final long serialVersionUID = 3685429923539311463L;

	/**
	 * 数据实际日期，YYYYMMDD
	 */
	@ApiField("actual_date")
	private String actualDate;

	/**
	 * 附加信息
	 */
	@ApiField("addition_info")
	private String additionInfo;

	/**
	 * 作物编码
	 */
	@ApiField("crop_code")
	private String cropCode;

	/**
	 * 风险监测指数，值域0～1
	 */
	@ApiField("risk_index")
	private String riskIndex;

	/**
	 * 风险等级，值域0～4，按严重程度递增
	 */
	@ApiField("risk_level")
	private Long riskLevel;

	public String getActualDate() {
		return this.actualDate;
	}
	public void setActualDate(String actualDate) {
		this.actualDate = actualDate;
	}

	public String getAdditionInfo() {
		return this.additionInfo;
	}
	public void setAdditionInfo(String additionInfo) {
		this.additionInfo = additionInfo;
	}

	public String getCropCode() {
		return this.cropCode;
	}
	public void setCropCode(String cropCode) {
		this.cropCode = cropCode;
	}

	public String getRiskIndex() {
		return this.riskIndex;
	}
	public void setRiskIndex(String riskIndex) {
		this.riskIndex = riskIndex;
	}

	public Long getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(Long riskLevel) {
		this.riskLevel = riskLevel;
	}

}
