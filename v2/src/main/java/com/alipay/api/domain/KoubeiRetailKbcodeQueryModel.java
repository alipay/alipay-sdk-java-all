package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快消行业口碑码查询接口
 *
 * @author auto create
 * @since 1.0, 2022-06-02 11:11:30
 */
public class KoubeiRetailKbcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8122579311293845535L;

	/**
	 * 创建码接口返回的批次id，如果不填写则查询这个带运营商户下所有开放接口生成的码
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 当前页码（大于0的整数），默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页返回的记录数（1~100的整数），默认为10
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
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
