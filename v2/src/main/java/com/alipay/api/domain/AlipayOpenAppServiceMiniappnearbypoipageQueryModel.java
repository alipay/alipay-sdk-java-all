package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序附近服务poi分页查询
 *
 * @author auto create
 * @since 1.0, 2019-08-01 20:35:08
 */
public class AlipayOpenAppServiceMiniappnearbypoipageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6417359147856632234L;

	/**
	 * 当前页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

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

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}
