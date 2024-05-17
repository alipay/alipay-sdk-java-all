package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ape物品布局的文本信息
 *
 * @author auto create
 * @since 1.0, 2023-07-27 10:35:36
 */
public class ItemDesignTextInfo extends AlipayObject {

	private static final long serialVersionUID = 7673168599585686776L;

	/**
	 * 布局文本信息
	 */
	@ApiListField("design_text_info_list")
	@ApiField("design_text_info")
	private List<DesignTextInfo> designTextInfoList;

	/**
	 * 物品id
	 */
	@ApiField("item_id")
	private String itemId;

	public List<DesignTextInfo> getDesignTextInfoList() {
		return this.designTextInfoList;
	}
	public void setDesignTextInfoList(List<DesignTextInfo> designTextInfoList) {
		this.designTextInfoList = designTextInfoList;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
