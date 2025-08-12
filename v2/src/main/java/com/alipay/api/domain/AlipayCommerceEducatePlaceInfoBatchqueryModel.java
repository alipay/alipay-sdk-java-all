package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询位置信息列表
 *
 * @author auto create
 * @since 1.0, 2025-06-09 09:59:16
 */
public class AlipayCommerceEducatePlaceInfoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3276556718176323229L;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 分页页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 父级楼栋ID。
	 */
	@ApiField("parent_id")
	private String parentId;

	/**
	 * 父位置名称
	 */
	@ApiField("parent_name")
	private String parentName;

	/**
	 * 位置标签
	 */
	@ApiField("place_label")
	private String placeLabel;

	/**
	 * 位置名称
	 */
	@ApiField("place_name")
	private String placeName;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
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

	public String getParentId() {
		return this.parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getParentName() {
		return this.parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getPlaceLabel() {
		return this.placeLabel;
	}
	public void setPlaceLabel(String placeLabel) {
		this.placeLabel = placeLabel;
	}

	public String getPlaceName() {
		return this.placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

}
