package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 规格类型
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:26:31
 */
public class SpecEntity extends AlipayObject {

	private static final long serialVersionUID = 1417897955772797633L;

	/**
	 * 新增不用传，修改必须传
	 */
	@ApiField("id")
	private String id;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 规格名称
	 */
	@ApiField("spec_name")
	private String specName;

	/**
	 * 是否为系统默认规格,同步时，默认为false，设置不生效，只有查询现实时用
	 */
	@ApiField("system")
	private Boolean system;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSpecName() {
		return this.specName;
	}
	public void setSpecName(String specName) {
		this.specName = specName;
	}

	public Boolean getSystem() {
		return this.system;
	}
	public void setSystem(Boolean system) {
		this.system = system;
	}

}
