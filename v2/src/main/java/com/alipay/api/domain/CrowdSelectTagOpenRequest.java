package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 圈选人群，选择的标签信息
 *
 * @author auto create
 * @since 1.0, 2023-01-30 13:44:47
 */
public class CrowdSelectTagOpenRequest extends AlipayObject {

	private static final long serialVersionUID = 3135941988193135726L;

	/**
	 * 圈选标签值
	 */
	@ApiListField("select_tag_values")
	@ApiField("crowd_select_tag_values_open_request")
	private List<CrowdSelectTagValuesOpenRequest> selectTagValues;

	public List<CrowdSelectTagValuesOpenRequest> getSelectTagValues() {
		return this.selectTagValues;
	}
	public void setSelectTagValues(List<CrowdSelectTagValuesOpenRequest> selectTagValues) {
		this.selectTagValues = selectTagValues;
	}

}
