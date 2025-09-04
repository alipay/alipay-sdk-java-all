package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 花呗美味商家宝贝同步接口
 *
 * @author auto create
 * @since 1.0, 2022-08-11 18:47:01
 */
public class AlipayPcreditHuabeiMerchantGoodsSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1435119234237465816L;

	/**
	 * 同步的宝贝信息列表
	 */
	@ApiListField("item_list")
	@ApiField("hb_mei_wei_item_sync")
	private List<HbMeiWeiItemSync> itemList;

	/**
	 * 商家宝贝信息同步，商户请求蚂蚁侧
	 */
	@ApiField("type")
	private String type;

	public List<HbMeiWeiItemSync> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<HbMeiWeiItemSync> itemList) {
		this.itemList = itemList;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
