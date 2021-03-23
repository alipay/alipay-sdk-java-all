package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 累计数据查询接口
 *
 * @author auto create
 * @since 1.0, 2021-02-01 10:50:43
 */
public class ZhimaMerchantZmgoCumulateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8192394243389482179L;

	/**
	 * 芝麻go协议号，唯一标识一个芝麻go协议。
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 是否需要回传明细
	 */
	@ApiField("need_detail")
	private Boolean needDetail;

	/**
	 * 分页参数，当need_detail=true时需要，代表当前页数，从1开始。
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页参数，当need_detail=true时需要，代表每页大小，不能大于20。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 数据回传的商户主体PID。
	 */
	@ApiField("provider_pid")
	private String providerPid;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public Boolean getNeedDetail() {
		return this.needDetail;
	}
	public void setNeedDetail(Boolean needDetail) {
		this.needDetail = needDetail;
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

	public String getProviderPid() {
		return this.providerPid;
	}
	public void setProviderPid(String providerPid) {
		this.providerPid = providerPid;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
