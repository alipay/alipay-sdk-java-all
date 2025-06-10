package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直付通记账关系查询
 *
 * @author auto create
 * @since 1.0, 2023-12-28 15:00:18
 */
public class AntMerchantExpandZftChargerelationBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8794613799623223419L;

	/**
	 * 查询维度，默认dimension=PRIMARY;
	 */
	@ApiField("dimension")
	private String dimension;

	/**
	 * 分页页码，默认page_num=1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页返回数量，默认page_size=10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 对象目标ID，可为关联主ID，也可为关联子ID
	 */
	@ApiField("target_id")
	private String targetId;

	public String getDimension() {
		return this.dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

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

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

}
