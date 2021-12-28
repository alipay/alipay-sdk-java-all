package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑通用组明细模型，用来定制加料，以及属性
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:13:46
 */
public class KbdishCommGroupDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 6151855234334156535L;

	/**
	 * 明细描述；加料以本身的描述为准，该字段不生效
	 */
	@ApiField("detail_desc")
	private String detailDesc;

	/**
	 * 存明细的业务id，如果是加料组传入加料id，如果是属性组明细id由口碑生成；更新、删除明细时必填
	 */
	@ApiField("detail_id")
	private String detailId;

	/**
	 * 明细名称；加料以本身的名称为准，该字段不生效
	 */
	@ApiField("detail_name")
	private String detailName;

	/**
	 * 扩展透穿
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 图片id；加料以本身的图片id为准，该字段不生效
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 外部isv的明细id；加料以本身的外部id为准，该字段不生效
	 */
	@ApiField("out_detail_id")
	private String outDetailId;

	/**
	 * 通用组的组明细之间的排序
	 */
	@ApiField("sort")
	private String sort;

	public String getDetailDesc() {
		return this.detailDesc;
	}
	public void setDetailDesc(String detailDesc) {
		this.detailDesc = detailDesc;
	}

	public String getDetailId() {
		return this.detailId;
	}
	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	public String getDetailName() {
		return this.detailName;
	}
	public void setDetailName(String detailName) {
		this.detailName = detailName;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getImageId() {
		return this.imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getOutDetailId() {
		return this.outDetailId;
	}
	public void setOutDetailId(String outDetailId) {
		this.outDetailId = outDetailId;
	}

	public String getSort() {
		return this.sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}

}
