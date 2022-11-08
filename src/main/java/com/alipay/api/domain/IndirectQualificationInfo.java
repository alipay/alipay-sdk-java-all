package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业经营许可证
 *
 * @author auto create
 * @since 1.0, 2022-09-01 19:25:30
 */
public class IndirectQualificationInfo extends AlipayObject {

	private static final long serialVersionUID = 7643521493217878679L;

	/**
	 * 行业经营许可证资质照片，一个行业类目下最多上传6张资质照片（使用图片上传接口）
	 */
	@ApiListField("image_list")
	@ApiField("string")
	private List<String> imageList;

	/**
	 * 行业类目编号，支付宝商家行业二级类目code
	 */
	@ApiField("mcc_code")
	private String mccCode;

	public List<String> getImageList() {
		return this.imageList;
	}
	public void setImageList(List<String> imageList) {
		this.imageList = imageList;
	}

	public String getMccCode() {
		return this.mccCode;
	}
	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}

}
