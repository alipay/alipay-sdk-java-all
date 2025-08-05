package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量查询标准后台类目
 *
 * @author auto create
 * @since 1.0, 2022-11-24 17:23:43
 */
public class KoubeiItemCategoryChildrenBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5487275558556618491L;

	/**
	 * 根类目ID. 参数非必传，不传该参数时查询所有的一级类目及递归子类目； 传该参数时，根据入参递归查询子类目信息的列表返回
	 */
	@ApiField("root_category_id")
	private String rootCategoryId;

	public String getRootCategoryId() {
		return this.rootCategoryId;
	}
	public void setRootCategoryId(String rootCategoryId) {
		this.rootCategoryId = rootCategoryId;
	}

}
