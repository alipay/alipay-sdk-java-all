package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemPackage;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.itempackage.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-03 16:51:50
 */
public class AlipayCloudCloudbaseResourcepackageItempackageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3266579647161378595L;

	/** 
	 * 单项资源包列表信息
	 */
	@ApiListField("item_package_list")
	@ApiField("item_package")
	private List<ItemPackage> itemPackageList;

	public void setItemPackageList(List<ItemPackage> itemPackageList) {
		this.itemPackageList = itemPackageList;
	}
	public List<ItemPackage> getItemPackageList( ) {
		return this.itemPackageList;
	}

}
