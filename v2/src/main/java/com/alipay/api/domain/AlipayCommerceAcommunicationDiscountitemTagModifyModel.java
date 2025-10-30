package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 特惠充分层标签修改接口
 *
 * @author auto create
 * @since 1.0, 2025-08-18 13:57:35
 */
public class AlipayCommerceAcommunicationDiscountitemTagModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2611634482374276264L;

	/**
	 * 机构侧商品ID
	 */
	@ApiField("isv_item_id")
	private String isvItemId;

	/**
	 * 商品分层标签列表
	 */
	@ApiField("tag_code_list")
	private String tagCodeList;

	public String getIsvItemId() {
		return this.isvItemId;
	}
	public void setIsvItemId(String isvItemId) {
		this.isvItemId = isvItemId;
	}

	public String getTagCodeList() {
		return this.tagCodeList;
	}
	public void setTagCodeList(String tagCodeList) {
		this.tagCodeList = tagCodeList;
	}

}
