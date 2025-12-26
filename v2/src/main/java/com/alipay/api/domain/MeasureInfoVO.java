package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 属性度量衡信息
 *
 * @author auto create
 * @since 1.0, 2025-11-07 19:11:13
 */
public class MeasureInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1195132661786325431L;

	/**
	 * 度量衡百分比单位信息，仅营养成分属性需要
	 */
	@ApiField("percent_unit")
	private MeasureUnitInfoVO percentUnit;

	/**
	 * 度量衡的模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 度量单位信息
	 */
	@ApiField("unit_info")
	private MeasureUnitInfoVO unitInfo;

	public MeasureUnitInfoVO getPercentUnit() {
		return this.percentUnit;
	}
	public void setPercentUnit(MeasureUnitInfoVO percentUnit) {
		this.percentUnit = percentUnit;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public MeasureUnitInfoVO getUnitInfo() {
		return this.unitInfo;
	}
	public void setUnitInfo(MeasureUnitInfoVO unitInfo) {
		this.unitInfo = unitInfo;
	}

}
