package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品做法分组信息
 *
 * @author auto create
 * @since 1.0, 2025-01-07 17:52:43
 */
public class MethodGroupInfo extends AlipayObject {

	private static final long serialVersionUID = 1635174532326876823L;

	/**
	 * 商品做法分组id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商品做法名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商品做法信息
	 */
	@ApiListField("optional_methods")
	@ApiField("method_info")
	private List<MethodInfo> optionalMethods;

	/**
	 * 商品分组选择限制
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

	public List<MethodInfo> getOptionalMethods() {
		return this.optionalMethods;
	}
	public void setOptionalMethods(List<MethodInfo> optionalMethods) {
		this.optionalMethods = optionalMethods;
	}

	public GroupRestrictionInfo getRestrictionInfo() {
		return this.restrictionInfo;
	}
	public void setRestrictionInfo(GroupRestrictionInfo restrictionInfo) {
		this.restrictionInfo = restrictionInfo;
	}

}
