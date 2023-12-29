package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商品推荐的个性化结果
 *
 * @author auto create
 * @since 1.0, 2023-09-26 12:09:48
 */
public class TechriskInnovateMpcpromoItemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3724751193925569623L;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页展示时，每页展示的数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 当前appid下的推荐场景id
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 商户定义的userId
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
