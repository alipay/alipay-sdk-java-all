package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SupplierCoreMaterialInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.corematerial.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-21 15:37:46
 */
public class AntMerchantExpandCorematerialListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1282593972942665679L;

	/** 
	 * 核心原材料详细信息
	 */
	@ApiListField("data_list")
	@ApiField("supplier_core_material_info")
	private List<SupplierCoreMaterialInfo> dataList;

	public void setDataList(List<SupplierCoreMaterialInfo> dataList) {
		this.dataList = dataList;
	}
	public List<SupplierCoreMaterialInfo> getDataList( ) {
		return this.dataList;
	}

}
