package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品图片
 *
 * @author auto create
 * @since 1.0, 2026-08-07 11:21:41
 */
public class ExternalItemPic extends AlipayObject {

	private static final long serialVersionUID = 8584489861748288618L;

	/**
	 * 图片说明
	 */
	@ApiField("pic_desc")
	private String picDesc;

	/**
	 * 图片标记
	 */
	@ApiField("pic_mark")
	private String picMark;

	/**
	 * 图片类型
	 */
	@ApiField("pic_type")
	private String picType;

	/**
	 * 图片排序
	 */
	@ApiField("sort")
	private Long sort;

	/**
	 * 图片链接
	 */
	@ApiField("source_url")
	private String sourceUrl;

	public String getPicDesc() {
		return this.picDesc;
	}
	public void setPicDesc(String picDesc) {
		this.picDesc = picDesc;
	}

	public String getPicMark() {
		return this.picMark;
	}
	public void setPicMark(String picMark) {
		this.picMark = picMark;
	}

	public String getPicType() {
		return this.picType;
	}
	public void setPicType(String picType) {
		this.picType = picType;
	}

	public Long getSort() {
		return this.sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}

	public String getSourceUrl() {
		return this.sourceUrl;
	}
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

}
