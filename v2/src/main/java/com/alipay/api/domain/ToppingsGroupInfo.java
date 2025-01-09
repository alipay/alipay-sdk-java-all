package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品加料分组信息
 *
 * @author auto create
 * @since 1.0, 2025-01-06 19:03:47
 */
public class ToppingsGroupInfo extends AlipayObject {

	private static final long serialVersionUID = 7114358568849681763L;

	/**
	 * 商品加料分组id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商品加料分组名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 可选加料
	 */
	@ApiListField("optional_toppings")
	@ApiField("toppings_info")
	private List<ToppingsInfo> optionalToppings;

	/**
	 * 做法分组选择限制
	 */
	@ApiField("restriction_info")
	private GroupRestrictionInfo restrictionInfo;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<ToppingsInfo> getOptionalToppings() {
		return this.optionalToppings;
	}
	public void setOptionalToppings(List<ToppingsInfo> optionalToppings) {
		this.optionalToppings = optionalToppings;
	}

	public GroupRestrictionInfo getRestrictionInfo() {
		return this.restrictionInfo;
	}
	public void setRestrictionInfo(GroupRestrictionInfo restrictionInfo) {
		this.restrictionInfo = restrictionInfo;
	}

}
