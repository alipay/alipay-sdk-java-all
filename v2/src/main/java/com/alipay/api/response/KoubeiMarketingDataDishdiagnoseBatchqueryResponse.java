package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemDiagnoseDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.dishdiagnose.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:04
 */
public class KoubeiMarketingDataDishdiagnoseBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7481547337394481745L;

	/** 
	 * 查询返回的详情数据
	 */
	@ApiListField("item_diagnose_list")
	@ApiField("item_diagnose_detail")
	private List<ItemDiagnoseDetail> itemDiagnoseList;

	/** 
	 * 记录的总条数
	 */
	@ApiField("total")
	private Long total;

	public void setItemDiagnoseList(List<ItemDiagnoseDetail> itemDiagnoseList) {
		this.itemDiagnoseList = itemDiagnoseList;
	}
	public List<ItemDiagnoseDetail> getItemDiagnoseList( ) {
		return this.itemDiagnoseList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
