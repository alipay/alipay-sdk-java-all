package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 更新位置信息
 *
 * @author auto create
 * @since 1.0, 2025-06-09 09:56:16
 */
public class AlipayCommerceEducatePlaceInfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5773555919945745528L;

	/**
	 * 关联学工号列表，比如某寝室居住4名学生的学工号列表
	 */
	@ApiListField("employee_no_list")
	@ApiField("string")
	private List<String> employeeNoList;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 外部唯一编号，不可重复
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 上级位置ID
	 */
	@ApiField("parent_id")
	private String parentId;

	/**
	 * 上级位置外部唯一编号
	 */
	@ApiField("parent_out_biz_no")
	private String parentOutBizNo;

	/**
	 * 位置ID
	 */
	@ApiField("place_id")
	private String placeId;

	/**
	 * 位置标签
	 */
	@ApiField("place_label")
	private String placeLabel;

	/**
	 * 位置图片地址URL
	 */
	@ApiField("place_logo")
	private String placeLogo;

	/**
	 * 位置名称
	 */
	@ApiField("place_name")
	private String placeName;

	/**
	 * 位置点位信息
	 */
	@ApiField("poi")
	private EduPlacePointInfo poi;

	public List<String> getEmployeeNoList() {
		return this.employeeNoList;
	}
	public void setEmployeeNoList(List<String> employeeNoList) {
		this.employeeNoList = employeeNoList;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getParentId() {
		return this.parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getParentOutBizNo() {
		return this.parentOutBizNo;
	}
	public void setParentOutBizNo(String parentOutBizNo) {
		this.parentOutBizNo = parentOutBizNo;
	}

	public String getPlaceId() {
		return this.placeId;
	}
	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

	public String getPlaceLabel() {
		return this.placeLabel;
	}
	public void setPlaceLabel(String placeLabel) {
		this.placeLabel = placeLabel;
	}

	public String getPlaceLogo() {
		return this.placeLogo;
	}
	public void setPlaceLogo(String placeLogo) {
		this.placeLogo = placeLogo;
	}

	public String getPlaceName() {
		return this.placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public EduPlacePointInfo getPoi() {
		return this.poi;
	}
	public void setPoi(EduPlacePointInfo poi) {
		this.poi = poi;
	}

}
