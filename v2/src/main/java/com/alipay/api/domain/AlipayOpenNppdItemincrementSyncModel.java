package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 添加商品后信息同步接口
 *
 * @author auto create
 * @since 1.0, 2025-05-27 13:58:14
 */
public class AlipayOpenNppdItemincrementSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3169374532947189635L;

	/**
	 * 客户业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 商品列表
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
