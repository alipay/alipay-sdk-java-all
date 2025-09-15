package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑零售商品类目信息查询
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:16:55
 */
public class KoubeiRetailWmsCategoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6468263345847467343L;

	/**
	 * 根据类目ID查询
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 操作上下文
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public OperateContext getOperateContext() {
		return this.operateContext;
	}
	public void setOperateContext(OperateContext operateContext) {
		this.operateContext = operateContext;
	}

}
