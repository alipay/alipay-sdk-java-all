package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权列表查询
 *
 * @author auto create
 * @since 1.0, 2022-09-27 17:27:46
 */
public class AlipayCommerceOperationTimescardAuthorityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8788929922438169382L;

	/**
	 * 分页页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页显示数量
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 场景码，固定值
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
