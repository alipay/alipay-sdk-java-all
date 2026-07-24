package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询转化信息
 *
 * @author auto create
 * @since 1.0, 2026-07-23 17:18:53
 */
public class AlipayDataDataserviceAdconversionConversionpageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6734881848961719946L;

	/**
	 * 当前页
	 */
	@ApiField("current")
	private Long current;

	/**
	 * 页面大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商家标识
	 */
	@ApiField("principal_tag")
	private String principalTag;

	public Long getCurrent() {
		return this.current;
	}
	public void setCurrent(Long current) {
		this.current = current;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

}
