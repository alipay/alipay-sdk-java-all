package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云店A发A券核销场景生效中的券模版列表查询
 *
 * @author auto create
 * @since 1.0, 2022-10-31 19:51:01
 */
public class AlipayCommerceVoucherTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6129151292131788341L;

	/**
	 * 页数，起始页是1
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 每页的条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 券模版的起始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 发行人用户id，2088账号
	 */
	@ApiField("voucher_owner_id")
	private String voucherOwnerId;

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getVoucherOwnerId() {
		return this.voucherOwnerId;
	}
	public void setVoucherOwnerId(String voucherOwnerId) {
		this.voucherOwnerId = voucherOwnerId;
	}

}
