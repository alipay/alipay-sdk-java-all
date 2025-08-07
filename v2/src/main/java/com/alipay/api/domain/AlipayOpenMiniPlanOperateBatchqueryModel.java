package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量查询支付后推荐方案列表
 *
 * @author auto create
 * @since 1.0, 2020-03-26 22:35:43
 */
public class AlipayOpenMiniPlanOperateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2762335469749737645L;

	/**
	 * 页码数，从第一页开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页记录数，默认10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 投放方案场景码，目前只支持支付后推荐场景：PAYMENT_SUCCESS
	 */
	@ApiField("scene")
	private String scene;

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
