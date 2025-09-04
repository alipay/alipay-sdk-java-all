package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * poi批量查询接口
 *
 * @author auto create
 * @since 1.0, 2025-07-21 10:44:05
 */
public class AntMerchantExpandAddressQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2261312749278542392L;

	/**
	 * 数组类型,包含多个address_id,可查询多个商家地址address_id下面对应的商家地址信息
[2024051300502055000064955576,2024051300502055000065014598]
	 */
	@ApiListField("address_ids")
	@ApiField("string")
	private List<String> addressIds;

	public List<String> getAddressIds() {
		return this.addressIds;
	}
	public void setAddressIds(List<String> addressIds) {
		this.addressIds = addressIds;
	}

}
