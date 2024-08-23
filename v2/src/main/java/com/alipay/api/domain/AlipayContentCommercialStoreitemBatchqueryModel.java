package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 带货车批量查询接口
 *
 * @author auto create
 * @since 1.0, 2024-05-31 16:46:20
 */
public class AlipayContentCommercialStoreitemBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3787847443222292498L;

	/**
	 * 支付宝商品库商品id列表
	 */
	@ApiListField("item_id_list")
	@ApiField("string")
	private List<String> itemIdList;

	/**
	 * 支付宝商家pid
	 */
	@ApiField("pid")
	private String pid;

	public List<String> getItemIdList() {
		return this.itemIdList;
	}
	public void setItemIdList(List<String> itemIdList) {
		this.itemIdList = itemIdList;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
