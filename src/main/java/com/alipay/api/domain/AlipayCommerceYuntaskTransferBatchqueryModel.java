package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云店资金转账记录查询
 *
 * @author auto create
 * @since 1.0, 2022-05-30 20:18:01
 */
public class AlipayCommerceYuntaskTransferBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3196731528769513862L;

	/**
	 * 第几页，默认1（从1开始计数）
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页记录条数，默认20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 资金代扣签约时的出资方uid
	 */
	@ApiField("sign_user_id")
	private String signUserId;

	/**
	 * 转账结束时间
	 */
	@ApiField("trans_date_end")
	private String transDateEnd;

	/**
	 * 转账开始时间
	 */
	@ApiField("trans_date_start")
	private String transDateStart;

	/**
	 * 转账类型：
TRANSFER：记账本转账 
WITHDRAW：记账本提现
	 */
	@ApiField("type")
	private String type;

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

	public String getSignUserId() {
		return this.signUserId;
	}
	public void setSignUserId(String signUserId) {
		this.signUserId = signUserId;
	}

	public String getTransDateEnd() {
		return this.transDateEnd;
	}
	public void setTransDateEnd(String transDateEnd) {
		this.transDateEnd = transDateEnd;
	}

	public String getTransDateStart() {
		return this.transDateStart;
	}
	public void setTransDateStart(String transDateStart) {
		this.transDateStart = transDateStart;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
