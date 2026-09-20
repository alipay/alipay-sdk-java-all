package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-14 16:12:51
 */
public class CheckOrderData extends AlipayObject {

	private static final long serialVersionUID = 5569937875668236898L;

	/**
	 * null
	 */
	@ApiListField("check_item_list")
	@ApiField("check_item_data")
	private List<CheckItemData> checkItemList;

	/**
	 * 检测单号
	 */
	@ApiField("check_no")
	private String checkNo;

	public List<CheckItemData> getCheckItemList() {
		return this.checkItemList;
	}
	public void setCheckItemList(List<CheckItemData> checkItemList) {
		this.checkItemList = checkItemList;
	}

	public String getCheckNo() {
		return this.checkNo;
	}
	public void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
	}

}
