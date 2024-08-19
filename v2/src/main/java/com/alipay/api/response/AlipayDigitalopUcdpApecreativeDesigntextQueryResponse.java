package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemDesignTextInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalop.ucdp.apecreative.designtext.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-27 10:37:03
 */
public class AlipayDigitalopUcdpApecreativeDesigntextQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4899447817254172516L;

	/** 
	 * 物品布局信息
	 */
	@ApiListField("item_design_text_info_list")
	@ApiField("item_design_text_info")
	private List<ItemDesignTextInfo> itemDesignTextInfoList;

	public void setItemDesignTextInfoList(List<ItemDesignTextInfo> itemDesignTextInfoList) {
		this.itemDesignTextInfoList = itemDesignTextInfoList;
	}
	public List<ItemDesignTextInfo> getItemDesignTextInfoList( ) {
		return this.itemDesignTextInfoList;
	}

}
