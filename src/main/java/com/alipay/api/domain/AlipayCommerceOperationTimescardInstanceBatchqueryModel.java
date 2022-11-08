package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 次卡实例列表查询
 *
 * @author auto create
 * @since 1.0, 2022-09-27 17:26:56
 */
public class AlipayCommerceOperationTimescardInstanceBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5839253173887625794L;

	/**
	 * 字段已废弃，无需传参
	 */
	@ApiField("isv_partner_id")
	private String isvPartnerId;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 分页size
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 字段已废弃，无需传参
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 状态 VALID有效 / INVALID无效 / REFUND_INVALID退款失效
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getIsvPartnerId() {
		return this.isvPartnerId;
	}
	public void setIsvPartnerId(String isvPartnerId) {
		this.isvPartnerId = isvPartnerId;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
