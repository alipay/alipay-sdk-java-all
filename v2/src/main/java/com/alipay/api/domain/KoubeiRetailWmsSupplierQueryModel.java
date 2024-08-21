package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑零售供应商信息查询
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:17:15
 */
public class KoubeiRetailWmsSupplierQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8185779953854124867L;

	/**
	 * 操作上下文
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 供应商ID，限制批量查询100个ID
	 */
	@ApiListField("supplier_ids")
	@ApiField("string")
	private List<String> supplierIds;

	public OperateContext getOperateContext() {
		return this.operateContext;
	}
	public void setOperateContext(OperateContext operateContext) {
		this.operateContext = operateContext;
	}

	public List<String> getSupplierIds() {
		return this.supplierIds;
	}
	public void setSupplierIds(List<String> supplierIds) {
		this.supplierIds = supplierIds;
	}

}
