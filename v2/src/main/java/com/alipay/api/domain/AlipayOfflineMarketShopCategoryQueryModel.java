package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店类目配置查询接口
 *
 * @author auto create
 * @since 1.0, 2017-07-19 16:56:09
 */
public class AlipayOfflineMarketShopCategoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5296813663568891616L;

	/**
	 * 类目ID，如果为空则查询全部类目。
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 表示接口业务的调用方身份,默认不填标识为ISV。
	 */
	@ApiField("op_role")
	private String opRole;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getOpRole() {
		return this.opRole;
	}
	public void setOpRole(String opRole) {
		this.opRole = opRole;
	}

}
