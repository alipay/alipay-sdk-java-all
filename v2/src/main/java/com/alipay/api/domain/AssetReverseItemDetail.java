package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 本数据结构主要用户供应商上传发起逆向的物料明细
 *
 * @author auto create
 * @since 1.0, 2025-07-24 17:27:19
 */
public class AssetReverseItemDetail extends AlipayObject {

	private static final long serialVersionUID = 2791279888293535883L;

	/**
	 * 申请数量，如1
	 */
	@ApiField("count")
	private String count;

	/**
	 * 发起未妥投的物料id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 本次未妥投对应列表
	 */
	@ApiListField("sn_records")
	@ApiField("string")
	private List<String> snRecords;

	public String getCount() {
		return this.count;
	}
	public void setCount(String count) {
		this.count = count;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public List<String> getSnRecords() {
		return this.snRecords;
	}
	public void setSnRecords(List<String> snRecords) {
		this.snRecords = snRecords;
	}

}
