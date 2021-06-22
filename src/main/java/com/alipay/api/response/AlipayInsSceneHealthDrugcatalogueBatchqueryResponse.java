package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HealthDrugCatalogueItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.health.drugcatalogue.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-17 11:35:23
 */
public class AlipayInsSceneHealthDrugcatalogueBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3124161551616544698L;

	/** 
	 * 药品列表
	 */
	@ApiListField("drug_item_list")
	@ApiField("health_drug_catalogue_item")
	private List<HealthDrugCatalogueItem> drugItemList;

	public void setDrugItemList(List<HealthDrugCatalogueItem> drugItemList) {
		this.drugItemList = drugItemList;
	}
	public List<HealthDrugCatalogueItem> getDrugItemList( ) {
		return this.drugItemList;
	}

}
