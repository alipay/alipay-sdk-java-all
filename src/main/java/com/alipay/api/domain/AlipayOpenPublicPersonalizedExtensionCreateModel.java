package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 个性化扩展区创建接口
 *
 * @author auto create
 * @since 1.0, 2020-01-10 18:10:55
 */
public class AlipayOpenPublicPersonalizedExtensionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1867355371251462897L;

	/**
	 * 扩展区列表，最大条数为3
	 */
	@ApiListField("areas")
	@ApiField("extension_area")
	private List<ExtensionArea> areas;

	/**
	 * 标签规则，目前限定只能传入1条，在扩展区上线后，满足该标签规则的用户进入生活号首页，将看到该套扩展区。
	 */
	@ApiListField("label_rule")
	@ApiField("label_rule")
	private List<LabelRule> labelRule;

	public List<ExtensionArea> getAreas() {
		return this.areas;
	}
	public void setAreas(List<ExtensionArea> areas) {
		this.areas = areas;
	}

	public List<LabelRule> getLabelRule() {
		return this.labelRule;
	}
	public void setLabelRule(List<LabelRule> labelRule) {
		this.labelRule = labelRule;
	}

}
