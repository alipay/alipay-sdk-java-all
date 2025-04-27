package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询类目所需资质信息
 *
 * @author auto create
 * @since 1.0, 2023-01-13 17:27:37
 */
public class AlipayOpenMiniCategoryRequireQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7375753786212729283L;

	/**
	 * 类目列表，不超过五个
	 */
	@ApiListField("category_code_list")
	@ApiField("string")
	private List<String> categoryCodeList;

	public List<String> getCategoryCodeList() {
		return this.categoryCodeList;
	}
	public void setCategoryCodeList(List<String> categoryCodeList) {
		this.categoryCodeList = categoryCodeList;
	}

}
