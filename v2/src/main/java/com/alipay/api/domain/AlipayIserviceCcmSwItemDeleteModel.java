package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 政务事项删除
 *
 * @author auto create
 * @since 1.0, 2023-06-30 16:32:17
 */
public class AlipayIserviceCcmSwItemDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5755449839846556672L;

	/**
	 * 事项id集合
	 */
	@ApiListField("item_codes")
	@ApiField("string")
	private List<String> itemCodes;

	/**
	 * 外部透传批量操作id，用于问题排查
	 */
	@ApiField("syn_id")
	private String synId;

	public List<String> getItemCodes() {
		return this.itemCodes;
	}
	public void setItemCodes(List<String> itemCodes) {
		this.itemCodes = itemCodes;
	}

	public String getSynId() {
		return this.synId;
	}
	public void setSynId(String synId) {
		this.synId = synId;
	}

}
