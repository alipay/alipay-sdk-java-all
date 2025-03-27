package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 带货车批量添加接口
 *
 * @author auto create
 * @since 1.0, 2024-05-31 16:47:27
 */
public class AlipayContentCommercialStoreitemBatchcreateModel extends AlipayObject {

	private static final long serialVersionUID = 5464862373877935198L;

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
