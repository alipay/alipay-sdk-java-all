package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 圈选人群，选择的标签信息
 *
 * @author auto create
 * @since 1.0, 2022-12-29 19:24:39
 */
public class CrowdSelectTagOpenRequest extends AlipayObject {

	private static final long serialVersionUID = 8687777659726394215L;

	/**
	 * 圈选标签值
	 */
	@ApiField("select_tag_values")
	private CrowdSelectTagValuesOpenRequest selectTagValues;

	public CrowdSelectTagValuesOpenRequest getSelectTagValues() {
		return this.selectTagValues;
	}
	public void setSelectTagValues(CrowdSelectTagValuesOpenRequest selectTagValues) {
		this.selectTagValues = selectTagValues;
	}

}
