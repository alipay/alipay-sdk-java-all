package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 素问医疗信息咨询结果
 *
 * @author auto create
 * @since 1.0, 2025-07-23 16:37:08
 */
public class RcMedConsultResult extends AlipayObject {

	private static final long serialVersionUID = 3282129689128245898L;

	/**
	 * 素问医疗信息咨询结果
	 */
	@ApiListField("item_list")
	@ApiField("consult_item")
	private List<ConsultItem> itemList;

	public List<ConsultItem> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<ConsultItem> itemList) {
		this.itemList = itemList;
	}

}
