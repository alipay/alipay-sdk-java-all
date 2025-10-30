package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询蚂蚁庄园装扮资源
 *
 * @author auto create
 * @since 1.0, 2024-04-24 09:56:52
 */
public class AlipaySocialAntfarmOrnamentresourceBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4415857954596331727L;

	/**
	 * 装扮资源key
	 */
	@ApiListField("ornament_resource_key_list")
	@ApiField("string")
	private List<String> ornamentResourceKeyList;

	public List<String> getOrnamentResourceKeyList() {
		return this.ornamentResourceKeyList;
	}
	public void setOrnamentResourceKeyList(List<String> ornamentResourceKeyList) {
		this.ornamentResourceKeyList = ornamentResourceKeyList;
	}

}
