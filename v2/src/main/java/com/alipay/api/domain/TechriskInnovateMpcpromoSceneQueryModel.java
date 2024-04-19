package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景信息查询接口
 *
 * @author auto create
 * @since 1.0, 2023-09-21 18:45:45
 */
public class TechriskInnovateMpcpromoSceneQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7245429434258565494L;

	/**
	 * 查询页数
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 查询条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 坑位id
	 */
	@ApiField("position_code")
	private String positionCode;

	/**
	 * 场景id
	 */
	@ApiField("scene_id")
	private String sceneId;

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

	public String getPositionCode() {
		return this.positionCode;
	}
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

}
