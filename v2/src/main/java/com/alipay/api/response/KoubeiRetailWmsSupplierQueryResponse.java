package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SupplierVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.supplier.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 21:02:46
 */
public class KoubeiRetailWmsSupplierQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1351114364264358648L;

	/** 
	 * 供应商信息
	 */
	@ApiListField("suppliers")
	@ApiField("supplier_v_o")
	private List<SupplierVO> suppliers;

	/** 
	 * 记录总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setSuppliers(List<SupplierVO> suppliers) {
		this.suppliers = suppliers;
	}
	public List<SupplierVO> getSuppliers( ) {
		return this.suppliers;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
