package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 人群显著标签列表
 *
 * @author auto create
 * @since 1.0, 2023-10-16 14:06:34
 */
public class TgiTagVO extends AlipayObject {

	private static final long serialVersionUID = 6458726356382829215L;

	/**
	 * 显著性特征推荐
	 */
	@ApiListField("tgi_name_list")
	@ApiField("string")
	private List<String> tgiNameList;

	public List<String> getTgiNameList() {
		return this.tgiNameList;
	}
	public void setTgiNameList(List<String> tgiNameList) {
		this.tgiNameList = tgiNameList;
	}

}
