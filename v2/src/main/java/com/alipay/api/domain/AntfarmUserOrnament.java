package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁庄园小鸡装扮情况
 *
 * @author auto create
 * @since 1.0, 2024-04-24 10:01:39
 */
public class AntfarmUserOrnament extends AlipayObject {

	private static final long serialVersionUID = 8522665349692767551L;

	/**
	 * 装扮名称
	 */
	@ApiField("ornament_name")
	private String ornamentName;

	/**
	 * 装扮资源key
	 */
	@ApiField("resource_key")
	private String resourceKey;

	/**
	 * 挂件
	 */
	@ApiField("sub_type")
	private String subType;

	public String getOrnamentName() {
		return this.ornamentName;
	}
	public void setOrnamentName(String ornamentName) {
		this.ornamentName = ornamentName;
	}

	public String getResourceKey() {
		return this.resourceKey;
	}
	public void setResourceKey(String resourceKey) {
		this.resourceKey = resourceKey;
	}

	public String getSubType() {
		return this.subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}

}
