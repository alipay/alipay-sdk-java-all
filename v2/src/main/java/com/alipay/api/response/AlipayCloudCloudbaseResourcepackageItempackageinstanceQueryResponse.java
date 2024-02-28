package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemPackageInstance;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.itempackageinstance.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-03 16:51:49
 */
public class AlipayCloudCloudbaseResourcepackageItempackageinstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5471636616474545844L;

	/** 
	 * 单项资源包实例详情列表
	 */
	@ApiListField("item_package_instances")
	@ApiField("item_package_instance")
	private List<ItemPackageInstance> itemPackageInstances;

	public void setItemPackageInstances(List<ItemPackageInstance> itemPackageInstances) {
		this.itemPackageInstances = itemPackageInstances;
	}
	public List<ItemPackageInstance> getItemPackageInstances( ) {
		return this.itemPackageInstances;
	}

}
