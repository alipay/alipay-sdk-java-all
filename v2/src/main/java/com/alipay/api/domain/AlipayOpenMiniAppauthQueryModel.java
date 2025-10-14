package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询三方应用的商家小程序授权列表
 *
 * @author auto create
 * @since 1.0, 2024-06-28 10:34:52
 */
public class AlipayOpenMiniAppauthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5194565643772368261L;

	/**
	 * 商家小程序APPID
	 */
	@ApiField("auth_app_id")
	private String authAppId;

	/**
	 * 请求分页页面
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 请求分页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getAuthAppId() {
		return this.authAppId;
	}
	public void setAuthAppId(String authAppId) {
		this.authAppId = authAppId;
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
