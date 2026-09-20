package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 点单助手商家作业信息批量查询
 *
 * @author auto create
 * @since 1.0, 2026-09-08 14:17:54
 */
public class AlipayOfflineSmddMerchantJobinfoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7275542958272843214L;

	/**
	 * null
	 */
	@ApiListField("merchant_id_list")
	@ApiField("string")
	private List<String> merchantIdList;

	public List<String> getMerchantIdList() {
		return this.merchantIdList;
	}
	public void setMerchantIdList(List<String> merchantIdList) {
		this.merchantIdList = merchantIdList;
	}

}
