package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业订单支付二维码申请接口
 *
 * @author auto create
 * @since 1.0, 2018-08-20 17:09:29
 */
public class AlipayEbppOrderQrcodeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6836385324962713455L;

	/**
	 * 支付宝订单子项id列表
	 */
	@ApiListField("alipay_item_id_list")
	@ApiField("string")
	private List<String> alipayItemIdList;

	public List<String> getAlipayItemIdList() {
		return this.alipayItemIdList;
	}
	public void setAlipayItemIdList(List<String> alipayItemIdList) {
		this.alipayItemIdList = alipayItemIdList;
	}

}
