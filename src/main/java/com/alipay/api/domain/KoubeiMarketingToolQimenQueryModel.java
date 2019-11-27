package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 弘智的测试
 *
 * @author auto create
 * @since 1.0, 2017-09-29 16:24:27
 */
public class KoubeiMarketingToolQimenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2573138516186941169L;

	/**
	 * 名称
	 */
	@ApiListField("name")
	@ApiField("access_params")
	private List<AccessParams> name;

	public List<AccessParams> getName() {
		return this.name;
	}
	public void setName(List<AccessParams> name) {
		this.name = name;
	}

}
