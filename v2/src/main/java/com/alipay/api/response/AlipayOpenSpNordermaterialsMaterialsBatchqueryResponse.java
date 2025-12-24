package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopMaterialsInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nordermaterials.materials.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-18 15:31:46
 */
public class AlipayOpenSpNordermaterialsMaterialsBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8831166863842967698L;

	/** 
	 * 数据列表
	 */
	@ApiListField("data_list")
	@ApiField("shop_materials_info")
	private List<ShopMaterialsInfo> dataList;

	/** 
	 * 生产单的数据总量，单位条
	 */
	@ApiField("data_total")
	private Long dataTotal;

	/** 
	 * 是否还有剩余数据，用于标记是否查询完毕数据
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

	public void setDataList(List<ShopMaterialsInfo> dataList) {
		this.dataList = dataList;
	}
	public List<ShopMaterialsInfo> getDataList( ) {
		return this.dataList;
	}

	public void setDataTotal(Long dataTotal) {
		this.dataTotal = dataTotal;
	}
	public Long getDataTotal( ) {
		return this.dataTotal;
	}

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public Boolean getHasNextPage( ) {
		return this.hasNextPage;
	}

}
