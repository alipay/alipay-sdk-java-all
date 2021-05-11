package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快消行业 店铺页面已经置顶券和DM查询接口
 *
 * @author auto create
 * @since 1.0, 2017-09-27 18:08:19
 */
public class KoubeiRetailTopinstanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5233949199969253518L;

	/**
	 * 券或者电子DM单（VOUCHER、DM）
	 */
	@ApiField("instance_type")
	private String instanceType;

	public String getInstanceType() {
		return this.instanceType;
	}
	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
	}

}
