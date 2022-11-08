package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * LinkedMall删除商品信息同步	
 *
 * @author auto create
 * @since 1.0, 2022-04-19 19:54:40
 */
public class AlipayMerchantMrchsurplmitemDeletionSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8536938735233628323L;

	/**
	 * 客户业务 ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * json序列化后的字符串
	 */
	@ApiField("item_id_list")
	private String itemIdList;

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

	public String getItemIdList() {
		return this.itemIdList;
	}
	public void setItemIdList(String itemIdList) {
		this.itemIdList = itemIdList;
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
