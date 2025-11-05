package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询蚂蚁微客信息
 *
 * @author auto create
 * @since 1.0, 2019-05-30 11:56:11
 */
public class AlipayMerchantWeikeSettleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5846814922573565672L;

	/**
	 * 外部业务号
	 */
	@ApiListField("out_biz_no")
	@ApiField("string")
	private List<String> outBizNo;

	/**
	 * 分页查询页号，从1开始
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页查询页大小，最大100
	 */
	@ApiField("page_size")
	private Long pageSize;

	public List<String> getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(List<String> outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
