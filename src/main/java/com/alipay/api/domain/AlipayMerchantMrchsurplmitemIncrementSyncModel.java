package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * LinkedMall添加商品信息同步
 *
 * @author auto create
 * @since 1.0, 2022-04-19 17:32:59
 */
public class AlipayMerchantMrchsurplmitemIncrementSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5244463382211725271L;

	/**
	 * 商家促活入驻LinkedMall的业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * json序列化后的字符串
	 */
	@ApiField("item_list")
	private String itemList;

	/**
	 * 请求标识
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 子渠道ID
	 */
	@ApiField("sub_biz_id")
	private String subBizId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getItemList() {
		return this.itemList;
	}
	public void setItemList(String itemList) {
		this.itemList = itemList;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSubBizId() {
		return this.subBizId;
	}
	public void setSubBizId(String subBizId) {
		this.subBizId = subBizId;
	}

}
