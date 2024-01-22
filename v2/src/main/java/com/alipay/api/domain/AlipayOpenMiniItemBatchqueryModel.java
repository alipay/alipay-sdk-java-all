package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序商品批量查询
 *
 * @author auto create
 * @since 1.0, 2023-11-07 15:33:15
 */
public class AlipayOpenMiniItemBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4653222728397138754L;

	/**
	 * 操作类型，固定为：ITEM_BATCHQUERY
	 */
	@ApiField("operation")
	private String operation;

	/**
	 * 支付宝平台侧商品 id 列表，最多20个。通过商品信息导入返回的result_data，商品信息导入流程详见 <a href="https://opendocs.alipay.com/mini/00nxao#%E5%95%86%E5%93%81%E4%BF%A1%E6%81%AF%E5%AF%BC%E5%85%A5">导入商品</a>。
	 */
	@ApiListField("platform_item_id_list")
	@ApiField("string")
	private List<String> platformItemIdList;

	public String getOperation() {
		return this.operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

	public List<String> getPlatformItemIdList() {
		return this.platformItemIdList;
	}
	public void setPlatformItemIdList(List<String> platformItemIdList) {
		this.platformItemIdList = platformItemIdList;
	}

}
