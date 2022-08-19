package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝景区信息获取
 *
 * @author auto create
 * @since 1.0, 2021-06-10 19:30:09
 */
public class AlipayCommerceDataScenicQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1432928829874234224L;

	/**
	 * 表示当前页， 不传默认第一页
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页数量，不传默认200， 最大不超过1000
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 景区小程序APPID。 未加白名单的服务商一定要传该值，否则查询不到结果
	 */
	@ApiField("scenic_app_id")
	private String scenicAppId;

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

	public String getScenicAppId() {
		return this.scenicAppId;
	}
	public void setScenicAppId(String scenicAppId) {
		this.scenicAppId = scenicAppId;
	}

}
