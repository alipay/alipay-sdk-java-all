package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连营销任务列表查询
 *
 * @author auto create
 * @since 1.0, 2023-04-17 10:35:53
 */
public class AlipayMerchantIndirectPromotaskBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3192881511135673346L;

	/**
	 * 平台定义的业务场景编码，用以区分不同的业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 支付宝侧定义的商户组编号，作为同一商户主体下多个smid的唯一商户编号
	 */
	@ApiField("group_mid")
	private String groupMid;

	/**
	 * 请求获取的列表条数，最大不超过30条，超过最大限制数接口会报错
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getGroupMid() {
		return this.groupMid;
	}
	public void setGroupMid(String groupMid) {
		this.groupMid = groupMid;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
