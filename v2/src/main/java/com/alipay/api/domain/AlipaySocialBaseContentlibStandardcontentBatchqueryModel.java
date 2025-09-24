package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容批量查询接口
 *
 * @author auto create
 * @since 1.0, 2024-01-31 11:18:07
 */
public class AlipaySocialBaseContentlibStandardcontentBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5858258181582372382L;

	/**
	 * 指示是否返回内容详情, 默认为false
false: 仅返回内容ID列表
true:返回 content_details
	 */
	@ApiField("need_detail")
	private Boolean needDetail;

	/**
	 * 当页分页,默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页记录数，最大20,默认20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 生活号+号ID，只有MCN机构为达人号ID查询内容才需要传入
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * 内容状态，默认查询所有状态
	 */
	@ApiField("status")
	private String status;

	public Boolean getNeedDetail() {
		return this.needDetail;
	}
	public void setNeedDetail(Boolean needDetail) {
		this.needDetail = needDetail;
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

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
