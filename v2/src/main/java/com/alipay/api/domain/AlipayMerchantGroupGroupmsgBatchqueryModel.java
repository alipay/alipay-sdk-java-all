package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询商家群内群发消息记录
 *
 * @author auto create
 * @since 1.0, 2025-09-11 10:24:19
 */
public class AlipayMerchantGroupGroupmsgBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6854992869311922172L;

	/**
	 * 消息id
	 */
	@ApiField("msg_id")
	private String msgId;

	/**
	 * 当前第几页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页展示条数，最大展示50条
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
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

}
