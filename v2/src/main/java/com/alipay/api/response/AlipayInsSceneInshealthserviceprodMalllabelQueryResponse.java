package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExternalItemLabel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.inshealthserviceprod.malllabel.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-07 11:21:43
 */
public class AlipayInsSceneInshealthserviceprodMalllabelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3785322818631979955L;

	/** 
	 * 商品标签列表
	 */
	@ApiListField("item_label_list")
	@ApiField("external_item_label")
	private List<ExternalItemLabel> itemLabelList;

	public void setItemLabelList(List<ExternalItemLabel> itemLabelList) {
		this.itemLabelList = itemLabelList;
	}
	public List<ExternalItemLabel> getItemLabelList( ) {
		return this.itemLabelList;
	}

}
