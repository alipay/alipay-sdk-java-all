package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除商品后信息同步接口
 *
 * @author auto create
 * @since 1.0, 2024-12-31 10:20:58
 */
public class AlipayOpenNppdItemdeleteSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2577469627826878731L;

	/**
	 * 客户业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 商品ID列表
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
