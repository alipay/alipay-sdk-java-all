package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票信息获取
 *
 * @author auto create
 * @since 1.0, 2023-09-19 15:15:09
 */
public class AlipayCommerceEcTcnInvoiceBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5892378212241342315L;

	/**
	 * 申请ID
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 页号
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 平台申请ID
	 */
	@ApiField("platform_apply_id")
	private String platformApplyId;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
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

	public String getPlatformApplyId() {
		return this.platformApplyId;
	}
	public void setPlatformApplyId(String platformApplyId) {
		this.platformApplyId = platformApplyId;
	}

}
