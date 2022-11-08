package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 次卡商品列表查询
 *
 * @author auto create
 * @since 1.0, 2022-03-18 15:57:27
 */
public class AlipayCommerceOperationTimescardItemBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7811197322469897113L;

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
	 * 场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 商品状态 已上架ONLINE / 已下架OFFLINE
	 */
	@ApiField("status")
	private String status;

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

}
